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
-- Table structure for table `ejb__timer__tbl`
--

DROP TABLE IF EXISTS `ejb__timer__tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ejb__timer__tbl` (
  `CREATIONTIMERAW` bigint(20) NOT NULL,
  `BLOB` blob,
  `TIMERID` varchar(255) COLLATE latin1_german1_ci NOT NULL,
  `CONTAINERID` bigint(20) NOT NULL,
  `OWNERID` varchar(255) COLLATE latin1_german1_ci DEFAULT NULL,
  `STATE` int(11) NOT NULL,
  `PKHASHCODE` int(11) NOT NULL,
  `INTERVALDURATION` bigint(20) NOT NULL,
  `INITIALEXPIRATIONRAW` bigint(20) NOT NULL,
  `LASTEXPIRATIONRAW` bigint(20) NOT NULL,
  `SCHEDULE` varchar(255) COLLATE latin1_german1_ci DEFAULT NULL,
  `APPLICATIONID` bigint(20) NOT NULL,
  PRIMARY KEY (`TIMERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ejb__timer__tbl`
--

LOCK TABLES `ejb__timer__tbl` WRITE;
/*!40000 ALTER TABLE `ejb__timer__tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `ejb__timer__tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-09-20 18:11:35
