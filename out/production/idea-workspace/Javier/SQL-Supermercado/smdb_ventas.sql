CREATE DATABASE  IF NOT EXISTS `smdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `smdb`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: smdb
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `IdTicket` int(11) NOT NULL AUTO_INCREMENT,
  `IdSucursal` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `MontoTotal` float NOT NULL,
  `MedioPago` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`IdTicket`),
  KEY `IdSucursal` (`IdSucursal`),
  CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`IdSucursal`) REFERENCES `sucursales` (`IdSucursal`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,5,'2019-09-05',589.8,'Credito'),(2,8,'2019-09-10',1320.5,'Efectivo'),(3,4,'2019-09-12',542.3,'Credito'),(4,1,'2019-09-20',875.2,'Debito'),(5,2,'2019-09-20',733.5,'Efectivo'),(6,5,'2019-09-20',738.5,'Debito'),(7,5,'2019-09-21',735.3,'Credito'),(8,7,'2019-09-28',375.9,'Credito'),(9,1,'2019-09-29',1459.9,'Debito'),(10,8,'2019-10-05',7186.9,'Efectivo'),(11,4,'2019-10-06',1675.2,'Debito'),(12,3,'2019-10-06',2741.9,'Efectivo'),(13,5,'2019-10-06',713.2,'Debito'),(14,4,'2019-10-06',196.8,'Credito'),(15,1,'2019-10-07',7152.4,'Credito'),(16,3,'2019-10-07',6482.9,'Credito'),(17,2,'2019-10-08',3812.3,'Credito'),(18,4,'2019-11-09',843.9,'Debito'),(19,5,'2019-11-09',205.1,'Debito'),(20,5,'2019-11-09',5861.3,'Efectivo'),(21,5,'2019-11-10',846.3,'Credito'),(22,3,'2019-11-10',6200.8,'Efectivo'),(23,8,'2019-11-10',2120.9,'Credito'),(24,7,'2019-11-10',608.4,'Credito'),(25,9,'2019-11-10',7506.9,'Efectivo');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-14 22:50:39
