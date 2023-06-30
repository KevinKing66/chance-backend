
/**
 * Author:  Kevin
 * Created: 28/05/2023
 */
--roles--
INSERT INTO roles (id, name) VALUES (1, 'ADMIN');
INSERT INTO roles (id, name) VALUES (2, 'INSPECTOR');
INSERT INTO roles (id, name) VALUES (3, 'SELLER');

INSERT INTO users (id, email, name, role_id, role, password, Salt) 
VALUES (1, 'example@email.com', 'Kevin', 1, 'admin', 'password', 'somesalt');


--lotteries--
INSERT INTO lotteries VALUES('CUND', 'CUNDINAMARCA',1, '22:30:00');
INSERT INTO lotteries VALUES('TOLI', 'TOLIMA',1, '23:00:00');

INSERT INTO lotteries VALUES('CRUZ', 'CRUZ ROJA',2, '22:30:00');
INSERT INTO lotteries VALUES('HUIL', 'HUILA',2, '22:30:00');

INSERT INTO lotteries VALUES('CUND', 'MANIZALES',3, '22:30:00');
INSERT INTO lotteries VALUES('META', 'META',3, '22:30:00');
INSERT INTO lotteries VALUES('VALL', 'VALLE',3, '22:30:00');

INSERT INTO lotteries VALUES('QUIN', 'QUINDÍO',4, '22:30:00');
INSERT INTO lotteries VALUES('BOGO', 'BOGOTÁ',4, '22:30:00');

INSERT INTO lotteries VALUES('CUND', 'SORTEO SANTANDER',5, '23:00:00');
INSERT INTO lotteries VALUES('MEDE', 'MEDELLÍN',5, '23:00:00');
INSERT INTO lotteries VALUES('RISA', 'RISARALDA',5, '23:00:00');

INSERT INTO lotteries VALUES('BOYACÁ', 'CUNDINAMARCA',6, '22:40:00');
INSERT INTO lotteries VALUES('CAUCA', 'CUNDINAMARCA',6, '21:40:00');