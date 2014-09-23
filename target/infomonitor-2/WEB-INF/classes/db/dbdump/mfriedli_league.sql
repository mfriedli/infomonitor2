CREATE DATABASE  IF NOT EXISTS `mfriedli` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_german1_ci */;
USE `mfriedli`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: mfriedli
-- ------------------------------------------------------
-- Server version	5.6.19-log

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
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `league`
--

LOCK TABLES `league` WRITE;
/*!40000 ALTER TABLE `league` DISABLE KEYS */;
INSERT INTO `league` VALUES (1,138,'Saison 2014 Meisterschaft 1. Liga','1. Liga'),(2,155,'Saison 2014 Meisterschaft 1. Liga Auf/Abstieg','1. Liga'),(3,156,'Saison 2014 Meisterschaft 1. Liga Playoff','1. Liga'),(4,157,'Saison 2014 Meisterschaft 1. Liga Playout','1. Liga'),(5,139,'Saison 2014 Meisterschaft 2. Liga','2. Liga'),(6,158,'Saison 2014 Meisterschaft 2. Liga Auf/Abstieg','2. Liga'),(7,159,'Saison 2014 Meisterschaft 2. Liga Playoff','2. Liga'),(8,160,'Saison 2014 Meisterschaft 2. Liga Playout','2. Liga'),(9,140,'Saison 2014 Meisterschaft 3. Liga','3. Liga'),(10,161,'Saison 2014 Meisterschaft 3. Liga Auf/Abstieg','3. Liga'),(11,171,'Saison 2014 Meisterschaft 3. Liga Ost','3. Liga'),(12,163,'Saison 2014 Meisterschaft 3. Liga Playout','3. Liga'),(13,162,'Saison 2014 Meisterschaft 3. Liga West','3. Liga'),(14,141,'Saison 2014 Meisterschaft 4. Liga','4.Liga'),(15,164,'Saison 2014 Meisterschaft 4. Liga Ost','4.Liga'),(16,165,'Saison 2014 Meisterschaft 4. Liga West','4. Liga'),(17,144,'Saison 2014 Meisterschaft Damen','Damen'),(18,166,'Saison 2014 Meisterschaft Damen Playoff','Damen'),(19,145,'Saison 2014 Meisterschaft Elite','U18'),(20,167,'Saison 2014 Meisterschaft Elite Playoff','U18'),(21,147,'Saison 2014 Meisterschaft Mini','U12'),(22,169,'Saison 2014 Meisterschaft Mini Playoff','U12'),(23,148,'Saison 2014 Meisterschaft Moskito','U9'),(24,170,'Saison 2014 Meisterschaft Moskito Playoff','U9'),(25,143,'Saison 2014 Meisterschaft NLA','NLA'),(26,149,'Saison 2014 Meisterschaft NLA Auf/Abstieg','NLA'),(27,150,'Saison 2014 Meisterschaft NLA Playoff','NLA'),(28,151,'Saison 2014 Meisterschaft NLA Playout','NLA'),(29,142,'Saison 2014 Meisterschaft NLB','NLB'),(30,152,'Saison 2014 Meisterschaft NLB Auf/Abstieg','NLB'),(31,153,'Saison 2014 Meisterschaft NLB Playoff','NLB'),(32,154,'Saison 2014 Meisterschaft NLB Playout','NLB'),(33,146,'Saison 2014 Meisterschaft Novizen','U15'),(34,168,'Saison 2014 Meisterschaft Novizen Playoff','U15');
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

-- Dump completed on 2014-09-20 18:11:31
