DROP DATABASE IF EXISTS hospital;
CREATE DATABASE hospital;
use hospital;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
);

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('ali', 'ali'),
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE IF NOT EXISTS `doctor` (
  `count` int(11) NOT NULL AUTO_INCREMENT,
  `id` varchar(15) NOT NULL, 
  `name` varchar(30) NOT NULL,
  `dept` varchar(20) NOT NULL,
  `room` int(11) NOT NULL UNIQUE,
  `fees` int(11) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `count` (`count`)
);

--
-- Dumping data for table `doctor`
--

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `count` int(11) NOT NULL AUTO_INCREMENT,
  `pid` varchar(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `bloodGrp` varchar(4) NOT NULL,
  KEY `count` (`count`),
  PRIMARY KEY (`pid`)
);

--
-- Dumping data for table `patient`
--
-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

DROP TABLE IF EXISTS `receptionist`;
CREATE TABLE IF NOT EXISTS `receptionist` (
  `count` int(11) NOT NULL AUTO_INCREMENT,
  `id` varchar(15) NOT NULL,
  `name` varchar(30) NOT NULL,
  `salary` int(6), 
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `count` (`count`)
  
);

--
-- Dumping data for table `receptionist`
--
--
-- Table structure for table `info`
--
DROP TABLE IF EXISTS `info`;
CREATE TABLE IF NOT EXISTS `info`(
	`docId` varchar(15) ,
    `pateintId` varchar(20), 
	`ReceptionistId` varchar(15),
    `date` date,
    `age` int(5),
    `gender` varchar(10),
    `email` varchar(40),
    `phone` varchar(20	),
    `status` varchar(10),
	`address` varchar(40),
    foreign key (`docId`) references doctor (`id`)
    ON DELETE CASCADE,
    foreign key (`pateintId`) references patient (`pid`)
    ON DELETE CASCADE,
    foreign key (`ReceptionistId`) references receptionist (`id`)
    ON DELETE CASCADE
);
--
-- Table structure for table `appointment`
--
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE IF NOT EXISTS `appointment` (
	`count` int(11) NOT NULL AUTO_INCREMENT,
	`dId` varchar(15) NOT NULL,
    `pid` varchar(20) NOT NULL,
	`room` int(11) NOT NULL,
	`StartAt` datetime NOT NULL,
	`EndsAt` datetime NOT NULL,
    primary key (`count`),
    foreign key (`dId`) references doctor (`id`)
    ON DELETE CASCADE,
    foreign key (`pid`) references patient (`pid`)
    ON DELETE CASCADE
);

--
-- Dumping data for table `appointment`
--

--
-- Table structure for table `appointment`
--
DROP TABLE IF EXISTS `bill`;
CREATE TABLE IF NOT EXISTS `bill` (
	`billId` int(11) NOT NULL AUTO_INCREMENT,
 	`appointmentId` varchar(30) NOT NULL,
 	`dId` varchar(15) NOT NULL,
    `pid` varchar(20) NOT NULL,
    `patientName` varchar(15) NOT NULL,
	`appointmentDate` date NOT NULL,
    `amount` int NOT NULL,
    primary key (`billId`),
    foreign key (`dId`) references doctor (`id`)
    ON DELETE CASCADE,
    foreign key (`pid`) references patient (`pid`)
    ON DELETE CASCADE
);

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

