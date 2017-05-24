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