
/**
 * Author:  Kevin
 * Created: 28/05/2023
 */
--roles--
INSERT INTO roles (id, name) VALUES (1, 'ADMIN');
INSERT INTO roles (id, name) VALUES (2, 'INSPECTOR');
INSERT INTO roles (id, name) VALUES (3, 'SELLER');

INSERT INTO users (id, email, name, role_id, role, password, status) 
VALUES (9, 'Kevin@email.com', 'Kevin', 1, 'ADMIN', 'password', 'ENABLE');


--lotteries--
INSERT INTO lotteries VALUES('CUND', 1, 'CUNDINAMARCA', '22:30:00');
INSERT INTO lotteries VALUES('TOLI', 1, 'TOLIMA', '23:00:00');

INSERT INTO lotteries VALUES('CRUZ', 2, 'CRUZ ROJA', '22:30:00');
INSERT INTO lotteries VALUES('HUIL', 2, 'HUILA', '22:30:00');

INSERT INTO lotteries VALUES('CUND', 3, 'MANIZALES', '22:30:00');
INSERT INTO lotteries VALUES('META', 3, 'META', '22:30:00');
INSERT INTO lotteries VALUES('VALL', 3, 'VALLE', '22:30:00');

INSERT INTO lotteries VALUES('QUIN', 4, 'QUINDÍO', '22:30:00');
INSERT INTO lotteries VALUES('BOGO', 4, 'BOGOTÁ', '22:30:00');

INSERT INTO lotteries VALUES('CUND', 5, 'SORTEO SANTANDER', '23:00:00');
INSERT INTO lotteries VALUES('MEDE', 5, 'MEDELLÍN', '23:00:00');
INSERT INTO lotteries VALUES('RISA', 5, 'RISARALDA', '23:00:00');

INSERT INTO lotteries VALUES('BOYACÁ', 6, 'CUNDINAMARCA', '22:40:00');
INSERT INTO lotteries VALUES('CAUCA', 6, 'CUNDINAMARCA', '21:40:00');