CREATE DATABASE  IF NOT EXISTS `lrs` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `lrs`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: lrs
-- ------------------------------------------------------
-- Server version	5.7.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `reservation` (
  `Reservation_number` int(11) NOT NULL AUTO_INCREMENT,
  `Status` varchar(255) NOT NULL,
  `Date_time_start` datetime DEFAULT NULL,
  `Comment` varchar(255) DEFAULT NULL,
  `Reserved_person_id` varchar(255) NOT NULL,
  `Non_academic_id` varchar(255) DEFAULT NULL,
  `Room_id` int(11) NOT NULL,
  `Date_time_end` datetime DEFAULT NULL,
  PRIMARY KEY (`Reservation_number`),
  KEY `Reserved_person_id` (`Reserved_person_id`),
  KEY `Room_id` (`Room_id`),
  CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`Reserved_person_id`) REFERENCES `user` (`Id_number`),
  CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`Room_id`) REFERENCES `room` (`Room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
INSERT INTO `reservation` VALUES (100,'CONFIRM','2020-02-13 01:00:00','','S001','N001',110,'2020-02-13 04:00:00'),(101,'PENDING','2020-02-13 02:00:00','','S001','',111,'2020-02-13 05:00:00'),(102,'REJECTED','2020-02-15 06:00:00','','S001','',109,'2020-02-15 10:00:00'),(103,'CONFIRM','2020-02-28 01:00:00','','S001','N001',104,'2020-02-28 06:00:00');
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `room` (
  `Room_id` int(11) NOT NULL AUTO_INCREMENT,
  `Room_type` varchar(255) NOT NULL,
  PRIMARY KEY (`Room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (100,'LECTURE_ROOM'),(101,'LECTURE_ROOM'),(102,'LECTURE_ROOM'),(103,'LECTURE_ROOM'),(104,'LECTURE_ROOM'),(105,'LECTURE_ROOM'),(106,'LECTURE_ROOM'),(107,'LECTURE_ROOM'),(108,'LECTURE_ROOM'),(109,'LECTURE_ROOM'),(110,'MEETING_ROOM'),(111,'STUDY_AREA'),(112,'STUDY_AREA');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `Id_number` varchar(255) NOT NULL,
  `User_type` varchar(255) NOT NULL,
  `Last_name` varchar(255) NOT NULL,
  `First_name` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  PRIMARY KEY (`Id_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('A001','ADMIN','Jayaweera','Amesh','123'),('H001','STAFF','DMED','HDJEWD','123'),('N001','NON_ACADEMIC','Kamal','Nimal','123'),('N002','NON_ACADEMIC','Kumara','Jayashakthi','123'),('S001','STUDENT','Jayaweera','Amesh','123');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'lrs'
--

--
-- Dumping routines for database 'lrs'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-15 14:37:22
