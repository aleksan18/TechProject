DROP DATABASE IF EXISTS apartmentsdatabase;
CREATE DATABASE apartmentsdatabase;
USE apartmentsdatabase;
-- Create all tables
CREATE TABLE apartments
(
apID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
zip VARCHAR(5) NOT NULL,
rent INT NOT NULL,
size INT NOT NULL,
floor VARCHAR(2) NOT NULL,
has_furniture TINYINT NOT NULL
);

INSERT INTO apartments VALUES
(3532,2400,3000,40,4,true),
(4503,2000,4000,25,7,true),
(4509,5000,5000,45,2,false),
(4510,2800,10000,100,5,false);
