DROP DATABASE IF EXISTS apartmentsdatabase;
CREATE DATABASE apartmentsdatabase;
USE apartmentsdatabase;
-- Create all tables
CREATE TABLE apartments
(
apID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
zip VARCHAR(5) NOT NULL,
size VARCHAR(12) NOT NULL,
floor VARCHAR(2) NOT NULL,
has_furniture TINYINT NOT NULL

);
