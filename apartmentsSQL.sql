DROP DATABASE IF EXISTS apartmentsdatabase;
CREATE DATABASE apartmentsdatabase;
USE apartmentsdatabase;
-- Create all tables
CREATE TABLE apartments
(
apID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
address VARCHAR(45) NOT NULL,
zip VARCHAR(5) NOT NULL,
rent INT NOT NULL,
size INT NOT NULL,
floor VARCHAR(2) NOT NULL,
has_furniture TINYINT NOT NULL
);

INSERT INTO apartments VALUES
(1,"Emdrup 45",2400,3000,40,4,true),
(2,"Nansensgade 19",2000,4000,25,7,true),
(3,"Enighedsvej 52",5000,5000,45,2,false),
(4,"Kulsvierparken A09",2800,10000,100,5,false);
