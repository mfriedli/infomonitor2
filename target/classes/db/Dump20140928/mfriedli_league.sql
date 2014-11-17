CREATE DATABASE  IF NOT EXISTS `mfriedli` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_german1_ci */;
USE `mfriedli`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: mfriedli
-- ------------------------------------------------------
-- Server version	5.6.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `league`
--

DROP TABLE IF EXISTS `league`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `league` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `LEAGUE_ID` int(11) NOT NULL,
  `LEAGUE_NAME` varchar(50) COLLATE latin1_german1_ci NOT NULL,
  `LEAGUE_SHORT_NAME` varchar(15) COLLATE latin1_german1_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `league`
--

LOCK TABLES `league` WRITE;
/*!40000 ALTER TABLE `league` DISABLE KEYS */;
INSERT INTO `league` VALUES (35,182,'Saison 2015 Pokal Aktive Finalrunde','Aktive'),(36,178,'Saison 2015 Pokal Elite U18','U18'),(37,183,'Saison 2015 Pokal Elite U18 Finalrunde','U18'),(38,180,'Saison 2015 Pokal Mini U12','U12'),(39,185,'Saison 2015 Pokal Mini U12 Finalrunde','U12'),(40,181,'Saison 2015 Pokal Moskito U9','U9'),(41,186,'Saison 2015 Pokal Moskito U9 Finalrunde','U9'),(42,179,'Saison 2015 Pokal Novizen U15','U15'),(43,184,'Saison 2015 Pokal Novizen U15 Finalrunde','U15'),(44,174,'Saison 2015 Pokal SK1','SK1'),(45,175,'Saison 2015 Pokal SK2','SK2'),(46,176,'Saison 2015 Pokal SK3','SK3'),(47,177,'Saison 2015 Pokal SK4','SK4');
/*!40000 ALTER TABLE `league` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-09-28 23:30:09
