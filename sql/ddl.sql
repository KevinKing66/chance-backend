/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Kevin
 * Created: 25/05/2023
 */

 create user 'admin'@'localhost' identified by 'admin';

 CREATE DATABASE chance;

 GRANT ALL PRIVILEGES ON CHANCE.* TO 'admin'@'localhost';