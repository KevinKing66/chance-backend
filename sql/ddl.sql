/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Kevin
 * Created: 25/05/2023
 */

 create user 'kevin'@'localhost' identified by 'KevinValledupar';

 CREATE DATABASE chance;

 GRANT ALL PRIVILEGES ON CHANCE.* TO 'kevin'@'localhost';

---- 24-jul-2023 ----
ALTER TABLE chances DROP COLUMN value_with_tax;
ALTER TABLE chances
CHANGE value value_with_tax DOUBLE DEFAULT 0;
