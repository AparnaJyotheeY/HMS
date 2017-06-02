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

  
  #pharmacist table,Created By:Aparna,Date:26-05-2017.
CREATE TABLE `hotelmanagement`.`pharmacist` (
  `pharmacistid` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `image` BLOB NOT NULL,
  `addeddate` DATE NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`pharmacistid`));

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
  #accountant table,Created By:Aparna,Date:25-05-2017.
CREATE TABLE `hotelmanagement`.`accountant` (
  `accountantid` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `image` BLOB NOT NULL,
  `addeddate` DATE NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`accountantid`));
    #ambulance table,Created By:Aparna,Date:31-05-2017.
  CREATE TABLE `hotelmanagement`.`ambulancedetails` (
  `ambulanceid` INT NOT NULL AUTO_INCREMENT,
  `ambulancenumber` VARCHAR(45) NOT NULL,
  `driver` VARCHAR(45) NOT NULL,
  `intime` VARCHAR(45) NOT NULL,
  `outtime` VARCHAR(45) NOT NULL,
  `status` VARCHAR(45) NULL,
  `addeddate` DATE NOT NULL,
  PRIMARY KEY (`ambulanceid`));
   #appointmentlist table,Created By:Rajamohan,Date:01-06-2017.
  CREATE TABLE `hotelmanagement`.`appointmentlist` (
  `aid` INT(11) NOT NULL AUTO_INCREMENT,
  `pid` VARCHAR(45) NOT NULL,
  `apdate` DATE NOT NULL,
  `aptime` VARCHAR(45) NOT NULL,
  `casehistory` VARCHAR(45) NOT NULL,
  `medication` VARCHAR(45) NOT NULL,
  `note` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`aid`));
  
  #ambulancefueldetails table,Created By:Rajamohan,Date:02-06-2017.
  CREATE TABLE `hotelmanagement`.`ambulancefueldetails` (
  `ambulanceid` INT(45) NOT NULL AUTO_INCREMENT,
  `ambulancenumber` VARCHAR(45) NOT NULL,
  `driver` VARCHAR(45) NOT NULL,
  `fueldate` DATE NOT NULL,
  `fueltime` VARCHAR(45) NOT NULL,
  `fuelquantity` INT(45) NOT NULL,
  `fuelamount` INT(45) NOT NULL,
  PRIMARY KEY (`ambulanceid`));

  
  
  
