CREATE DATABASE  IF NOT EXISTS `git_biblioteca` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `git_biblioteca`;
-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: git_biblioteca
-- ------------------------------------------------------
-- Server version	10.4.28-MariaDB

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
-- Table structure for table `tbl_cat_editorial`
--

DROP TABLE IF EXISTS `tbl_cat_editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_cat_editorial` (
  `editorial_Id` int(11) NOT NULL AUTO_INCREMENT,
  `editorial_Nombre` varchar(45) NOT NULL,
  `editorial_Activo` int(11) NOT NULL,
  PRIMARY KEY (`editorial_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_editorial`
--

LOCK TABLES `tbl_cat_editorial` WRITE;
/*!40000 ALTER TABLE `tbl_cat_editorial` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_editorial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_genero`
--

DROP TABLE IF EXISTS `tbl_cat_genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_cat_genero` (
  `generoId` int(11) NOT NULL AUTO_INCREMENT,
  `generoNombre` varchar(45) NOT NULL,
  `generoActivo` int(11) NOT NULL,
  PRIMARY KEY (`generoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_genero`
--

LOCK TABLES `tbl_cat_genero` WRITE;
/*!40000 ALTER TABLE `tbl_cat_genero` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_idioma`
--

DROP TABLE IF EXISTS `tbl_cat_idioma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_cat_idioma` (
  `Idioma_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Idioma_Nombre` varchar(45) NOT NULL,
  `Idioma_Activo` int(11) NOT NULL,
  PRIMARY KEY (`Idioma_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_idioma`
--

LOCK TABLES `tbl_cat_idioma` WRITE;
/*!40000 ALTER TABLE `tbl_cat_idioma` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_idioma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_ope_libro`
--

DROP TABLE IF EXISTS `tbl_ope_libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_ope_libro` (
  `libro_Id` int(11) NOT NULL AUTO_INCREMENT,
  `libro_Nombre` varchar(45) NOT NULL,
  `libro_Genero_Id` int(11) NOT NULL,
  `libro_Editorial_Id` int(11) NOT NULL,
  `libro_Idioma_Id` int(11) NOT NULL,
  `libro_Cantidad` int(11) NOT NULL,
  `libro_Costo` decimal(10,0) NOT NULL,
  `libro_Activo` int(11) NOT NULL,
  PRIMARY KEY (`libro_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ope_libro`
--

LOCK TABLES `tbl_ope_libro` WRITE;
/*!40000 ALTER TABLE `tbl_ope_libro` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_ope_libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'git_biblioteca'
--

--
-- Dumping routines for database 'git_biblioteca'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-01 20:29:39
