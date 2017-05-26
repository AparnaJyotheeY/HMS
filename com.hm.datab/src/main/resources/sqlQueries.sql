#nurse table,Created By:Aparna,Date:23-05-2017.
CREATE TABLE `hotelmanagement`.`nurse` (
  `nurseid` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `image` BLOB NOT NULL,
  `addeddate` DATE NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`nurseid`));
  
   #patientlist table,Created By:Rajamohan,Date:24-05-2017.
  CREATE TABLE `hotelmanagement`.`patientlist` (
  `pid` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `mobileno` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `dob` DATE NULL,
  `age` INT(45) NULL,
  `image` BLOB NULL,
  `bloodgroup` VARCHAR(45) NULL,
  `addeddate` DATE NULL,
  PRIMARY KEY (`pid`));
  
  #Laboratorist table,Created By:Rajamohan,Date:25-05-2017.
  CREATE TABLE `hotelmanagement`.`Laboratoristlist` (
  `lid` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `phoneno` INT(45) NULL,
  `image` BLOB NULL,
   `addeddate` DATE NULL,
  PRIMARY KEY (`lid`));
