
# Utilizamos una imagen base con OpenJDK 20
FROM eclipse-temurin:20-jdk AS build

RUN apt-get update \
  && apt-get install -y ca-certificates curl git --no-install-recommends \
  && rm -rf /var/lib/apt/lists/*

# common for all images
ENV MAVEN_HOME /usr/share/maven

COPY --from=maven:3.9.3-eclipse-temurin-11 ${MAVEN_HOME} ${MAVEN_HOME}
COPY --from=maven:3.9.3-eclipse-temurin-11 /usr/local/bin/mvn-entrypoint.sh /usr/local/bin/mvn-entrypoint.sh
COPY --from=maven:3.9.3-eclipse-temurin-11 /usr/share/maven/ref/settings-docker.xml /usr/share/maven/ref/settings-docker.xml

RUN ln -s ${MAVEN_HOME}/bin/mvn /usr/bin/mvn

ARG MAVEN_VERSION=3.9.3
ARG USER_HOME_DIR="/root"
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"

ENTRYPOINT ["/usr/local/bin/mvn-entrypoint.sh"]


# Instalamos MariaDB en el contenedor
RUN apt-get update && \
    apt-get install -y mariadb-server

# Establecemos el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el archivo pom.xml al contenedor
COPY pom.xml .

# Descargamos las dependencias de Maven
RUN mvn dependency:go-offline -B

# Copiamos el resto de los archivos del proyecto al contenedor
COPY src ./src

# Compilamos el proyecto con Maven
RUN mvn package -DskipTests

# Exponemos el puerto en el que se ejecutará la aplicación
EXPOSE 8080
EXPOSE 3306

# Ejecutamos el comando para iniciar la aplicación Spring
CMD  mvn && \
    service mysql start && \
    java -jar target/chances-app.war
# CMD ["java", "-jar", "target/chances-app.war"]
