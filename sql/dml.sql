
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
INSERT INTO lotteries VALUES('CUND', 1, 'CUNDINAMARCA', '21:30:00');
INSERT INTO lotteries VALUES('TOLI', 1, 'TOLIMA', '22:00:00');

INSERT INTO lotteries VALUES('CRUZ', 2, 'CRUZ ROJA', '21:30:00');
INSERT INTO lotteries VALUES('HUIL', 2, 'HUILA', '21:30:00');

INSERT INTO lotteries VALUES('CUND', 3, 'MANIZALES', '21:30:00');
INSERT INTO lotteries VALUES('META', 3, 'META', '21:30:00');
INSERT INTO lotteries VALUES('VALL', 3, 'VALLE', '21:30:00');

INSERT INTO lotteries VALUES('QUIN', 4, 'QUINDIO', '21:30:00');
INSERT INTO lotteries VALUES('BOGO', 4, 'BOGOTÁ', '21:30:00');

INSERT INTO lotteries VALUES('CUND', 5, 'SORTEO SANTANDER', '22:00:00');
INSERT INTO lotteries VALUES('MEDE', 5, 'MEDELLIN', '22:00:00');
INSERT INTO lotteries VALUES('RISA', 5, 'RISARALDA', '22:00:00');

INSERT INTO lotteries VALUES('BOYA', 6, 'BOYACÁ', '21:40:00');
INSERT INTO lotteries VALUES('CAUC', 6, 'CAUCA', '20:40:00');


INSERT INTO lotteries VALUES('ChoD1', 1, 'Chontico Dia', '12:30:00'); 
INSERT INTO lotteries VALUES('ChoD2', 2, 'Chontico Día', '12:30:00'); 
INSERT INTO lotteries VALUES('ChoD3', 3, 'Chontico Día', '12:30:00'); 
INSERT INTO lotteries VALUES('ChoD4', 4, 'Chontico Día', '12:30:00'); 
INSERT INTO lotteries VALUES('ChoD5', 5, 'Chontico Día', '12:30:00'); 
INSERT INTO lotteries VALUES('ChoD6', 6, 'Chontico Día', '12:30:00'); 
INSERT INTO lotteries VALUES('ChoD7', 7, 'Chontico Día', '12:30:00'); --todos los dias
INSERT INTO lotteries VALUES('ChoN1', 1, 'Chontico Noche Sem.', '18:00:00');
INSERT INTO lotteries VALUES('ChoN2', 2, 'Chontico Noche Sem.', '18:00:00');
INSERT INTO lotteries VALUES('ChoN3', 3, 'Chontico Noche Sem.', '18:00:00');
INSERT INTO lotteries VALUES('ChoN4', 4, 'Chontico Noche Sem.', '18:00:00');
INSERT INTO lotteries VALUES('ChoN5', 5, 'Chontico Noche Sem.', '18:00:00'); --de lunes a viernes
INSERT INTO lotteries VALUES('ChoN6', 6, 'Chontico Noche Sab.', '21:00:00');
INSERT INTO lotteries VALUES('ChoN7', 7, 'Chontico Noche Dom.', '21:00:00'); 

INSERT INTO lotteries VALUES('CafeT1', 1, 'Cafeterito Tarde', '11:30:00');
INSERT INTO lotteries VALUES('CafeT2', 2, 'Cafeterito Tarde', '11:30:00');
INSERT INTO lotteries VALUES('CafeT3', 3 'Cafeterito Tarde', '11:30:00');
INSERT INTO lotteries VALUES('CafeT4', 4, 'Cafeterito Tarde', '11:30:00');
INSERT INTO lotteries VALUES('CafeT5', 5, 'Cafeterito Tarde', '11:30:00');
INSERT INTO lotteries VALUES('CafeT6', 6, 'Cafeterito Tarde', '11:30:00'); --de lunes a sabado

INSERT INTO lotteries VALUES('CafeN1', 1, 'Cafeterito Noche', '21:00:00');
INSERT INTO lotteries VALUES('CafeN2', 2, 'Cafeterito Noche', '21:00:00');
INSERT INTO lotteries VALUES('CafeN3', 3 'Cafeterito Noche', '21:00:00');
INSERT INTO lotteries VALUES('CafeN4', 4, 'Cafeterito Noche', '21:00:00');
INSERT INTO lotteries VALUES('CafeN5', 5, 'Cafeterito Noche', '21:00:00');
INSERT INTO lotteries VALUES('CafeN6', 6, 'Cafeterito Noche', '22:00:00'); 
INSERT INTO lotteries VALUES('CafeN7', 7, 'Cafeterito Noche', '20:00:00');

INSERT INTO lotteries VALUES('PaiD1', 1, 'Paisita Día', '12:30:00');
INSERT INTO lotteries VALUES('PaiD2', 2, 'Paisita Día', '12:30:00');
INSERT INTO lotteries VALUES('PaiD3', 3, 'Paisita Día', '12:30:00');
INSERT INTO lotteries VALUES('PaiD4', 4, 'Paisita Día', '12:30:00');
INSERT INTO lotteries VALUES('PaiD5', 5, 'Paisita Día', '12:30:00');
INSERT INTO lotteries VALUES('PaiD6', 6, 'Paisita Día', '12:30:00');
INSERT INTO lotteries VALUES('PaiD7', 7, 'Paisita Día', '13:30:00');

INSERT INTO lotteries VALUES('PaiN1', 1, 'Paisita Noche', '17:30:00');
INSERT INTO lotteries VALUES('PaiN2', 2, 'Paisita Noche', '17:30:00');
INSERT INTO lotteries VALUES('PaiN3', 3, 'Paisita Noche', '17:30:00');
INSERT INTO lotteries VALUES('PaiN4', 4, 'Paisita Noche', '17:30:00');
INSERT INTO lotteries VALUES('PaiN5', 5, 'Paisita Noche', '17:30:00');
INSERT INTO lotteries VALUES('PaiN6', 6, 'Paisita Noche', '17:30:00');
INSERT INTO lotteries VALUES('PaiN7', 7, 'Paisita Noche', '19:30:00');


INSERT INTO lotteries VALUES('Sam1', 1, 'El Samán de la Suerte', '12:30:00');
INSERT INTO lotteries VALUES('Sam2', 2, 'El Samán de la Suerte', '12:30:00');
INSERT INTO lotteries VALUES('Sam3', 3, 'El Samán de la Suerte', '12:30:00');
INSERT INTO lotteries VALUES('Sam4', 4, 'El Samán de la Suerte', '12:30:00');
INSERT INTO lotteries VALUES('Sam5', 5, 'El Samán de la Suerte', '12:30:00');
INSERT INTO lotteries VALUES('Sam6', 6, 'El Samán de la Suerte', '18:00:00');