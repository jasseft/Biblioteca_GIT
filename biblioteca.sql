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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_editorial`
--

LOCK TABLES `tbl_cat_editorial` WRITE;
/*!40000 ALTER TABLE `tbl_cat_editorial` DISABLE KEYS */;
INSERT INTO `tbl_cat_editorial` VALUES (1,'Penguin Random House',1),(2,'HarperCollins',1),(3,'Simon & Schuster',1),(4,'Macmillan Publishers',1),(5,'Hachette Livre',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_genero`
--

LOCK TABLES `tbl_cat_genero` WRITE;
/*!40000 ALTER TABLE `tbl_cat_genero` DISABLE KEYS */;
INSERT INTO `tbl_cat_genero` VALUES (1,'Novela',1),(2,'Ensayo',1),(3,'Ciencia Ficción',1),(4,'Misterio',1),(5,'Romance',1),(6,'Thriller',1),(7,'Biografía',1),(8,'Histórico',1),(9,'Drama',1),(10,'Fantasía',1),(11,'Aventura',1),(12,'Suspense',1),(13,'Poesía',1),(14,'Humor',1),(15,'Crimen',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_idioma`
--

LOCK TABLES `tbl_cat_idioma` WRITE;
/*!40000 ALTER TABLE `tbl_cat_idioma` DISABLE KEYS */;
INSERT INTO `tbl_cat_idioma` VALUES (1,'Español',1),(2,'Inglés',1),(3,'Francés',1),(4,'Alemán',1),(5,'Italiano',1);
/*!40000 ALTER TABLE `tbl_cat_idioma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_hist_ventas`
--

DROP TABLE IF EXISTS `tbl_hist_ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_hist_ventas` (
  `venta_Id` int(11) NOT NULL AUTO_INCREMENT,
  `libro_Id` int(11) NOT NULL,
  `venta_Cantidad` int(11) NOT NULL,
  `venta_Activo` int(11) NOT NULL,
  PRIMARY KEY (`venta_Id`),
  KEY `libro_Id_idx` (`libro_Id`),
  CONSTRAINT `libro_Id` FOREIGN KEY (`libro_Id`) REFERENCES `tbl_ope_libro` (`libro_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_hist_ventas`
--

LOCK TABLES `tbl_hist_ventas` WRITE;
/*!40000 ALTER TABLE `tbl_hist_ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_hist_ventas` ENABLE KEYS */;
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
  PRIMARY KEY (`libro_Id`),
  KEY `libro_Genero_Id_idx` (`libro_Genero_Id`),
  KEY `libro_Editorial_Id_idx` (`libro_Editorial_Id`),
  KEY `libro_Idioma_Id_idx` (`libro_Idioma_Id`),
  CONSTRAINT `libro_Editorial_Id` FOREIGN KEY (`libro_Editorial_Id`) REFERENCES `tbl_cat_editorial` (`editorial_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `libro_Genero_Id` FOREIGN KEY (`libro_Genero_Id`) REFERENCES `tbl_cat_genero` (`generoId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `libro_Idioma_Id` FOREIGN KEY (`libro_Idioma_Id`) REFERENCES `tbl_cat_idioma` (`Idioma_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ope_libro`
--

LOCK TABLES `tbl_ope_libro` WRITE;
/*!40000 ALTER TABLE `tbl_ope_libro` DISABLE KEYS */;
INSERT INTO `tbl_ope_libro` VALUES (1,'Libro A1',1,1,1,30,20,1),(2,'Libro A2',2,1,2,25,16,1),(3,'Libro A3',3,1,3,40,23,1);
/*!40000 ALTER TABLE `tbl_ope_libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'git_biblioteca'
--

--
-- Dumping routines for database 'git_biblioteca'
--
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertEditorial` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
DELIMITER ;;
CREATE DEFINER=`jason`@`%` PROCEDURE `insertEditorial`(
	IN _editorial_nombre VARCHAR(45))
BEGIN
	INSERT INTO tbl_cat_editorial VALUES(NULL, _editorial_nombre, 1);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertGenero` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
DELIMITER ;;
CREATE DEFINER=`jason`@`%` PROCEDURE `insertGenero`(
	IN _genero_nombre VARCHAR(45))
BEGIN
	INSERT INTO tbl_cat_genero VALUES(NULL, _genero_nombre, 1);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertIdioma` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
DELIMITER ;;
CREATE DEFINER=`jason`@`%` PROCEDURE `insertIdioma`(
	IN _idioma_nombre VARCHAR(45))
BEGIN
	INSERT INTO tbl_cat_idioma VALUES(NULL, _idioma_nombre, 1);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertLibro` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
DELIMITER ;;
CREATE DEFINER=`jason`@`%` PROCEDURE `insertLibro`(
	IN _libro_nombre VARCHAR(45),
    IN _libro_genero INT,
    IN _libro_editorial INT,
    IN _libro_idioma INT,
    IN _libro_cantidad INT,
    IN _libro_costo DECIMAL)
BEGIN
	INSERT INTO tbl_ope_libro VALUES(NULL, _libro_nombre, _libro_genero, _libro_editorial, _libro_idioma, _libro_cantidad, _libro_costo, 1);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
/*!50003 DROP PROCEDURE IF EXISTS `showAllEditoriales` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
DELIMITER ;;
CREATE DEFINER=`jason`@`%` PROCEDURE `showAllEditoriales`()
BEGIN
    SELECT * FROM tbl_cat_editorial WHERE editorial_Activo = 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
/*!50003 DROP PROCEDURE IF EXISTS `showAllGeneros` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
DELIMITER ;;
CREATE DEFINER=`jason`@`%` PROCEDURE `showAllGeneros`()
BEGIN
    SELECT * FROM tbl_cat_genero WHERE generoActivo = 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
/*!50003 DROP PROCEDURE IF EXISTS `showAllIdiomas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
DELIMITER ;;
CREATE DEFINER=`jason`@`%` PROCEDURE `showAllIdiomas`()
BEGIN
    SELECT * FROM tbl_cat_idioma WHERE Idioma_Activo = 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
/*!50003 DROP PROCEDURE IF EXISTS `showAllLibros` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
DELIMITER ;;
CREATE DEFINER=`jason`@`%` PROCEDURE `showAllLibros`()
BEGIN
	SELECT 
        l.libro_Id,
        l.libro_Nombre,
        g.generoNombre AS Genero,
        e.editorial_Nombre AS Editorial,
        i.Idioma_Nombre AS Idioma,
        l.libro_Cantidad,
        l.libro_Costo
    FROM tbl_ope_libro l
    INNER JOIN tbl_cat_genero g ON l.libro_Genero_Id = g.generoId
    INNER JOIN tbl_cat_editorial e ON l.libro_Editorial_Id = e.editorial_Id
    INNER JOIN tbl_cat_idioma i ON l.libro_Idioma_Id = i.Idioma_Id
    WHERE l.libro_Activo = 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
/*!50003 DROP PROCEDURE IF EXISTS `updateLibro` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
DELIMITER ;;
CREATE DEFINER=`jason`@`%` PROCEDURE `updateLibro`(
    IN _libro_Id INT,
    IN _libro_Nombre VARCHAR(45),
    IN _libro_Genero_Id INT,
    IN _libro_Editorial_Id INT,
    IN _libro_Idioma_Id INT,
    IN _libro_Costo DECIMAL(10,2))
BEGIN
    -- Verificar si el libro existe antes de actualizar
    DECLARE libroExists INT DEFAULT 0;
    SELECT COUNT(*) INTO libroExists FROM tbl_ope_libro WHERE libro_Id = _libro_Id;

    IF libroExists > 0 THEN
        -- Actualizar el libro
        UPDATE tbl_ope_libro
        SET
            libro_Nombre = _libro_Nombre,
            libro_Genero_Id = _libro_Genero_Id,
            libro_Editorial_Id = _libro_Editorial_Id,
            libro_Idioma_Id = _libro_Idioma_Id,
            libro_Costo = _libro_Costo
        WHERE libro_Id = _libro_Id;

        SELECT 'Libro actualizado correctamente.' AS Resultado;
    ELSE
        SELECT 'El libro con ID ' + CAST(_libro_Id AS CHAR) + ' no existe.' AS Resultado;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ventaLibro` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
DELIMITER ;;
CREATE DEFINER=`jason`@`%` PROCEDURE `ventaLibro`(
    IN _libro_Id INT,
    IN _venta_Cantidad INT
)
BEGIN
    -- Verificar si el libro existe y hay suficiente stock
    DECLARE stockDisponible INT;
    SELECT libro_Cantidad INTO stockDisponible FROM tbl_ope_libro WHERE libro_Id = _libro_Id;

    IF stockDisponible >= _venta_Cantidad THEN
        -- Realizar la venta y actualizar el stock
        INSERT INTO tbl_hist_ventas (libro_Id, venta_Cantidad, venta_Activo)
        VALUES (_libro_Id, _venta_Cantidad, 1);

        UPDATE tbl_ope_libro
        SET libro_Cantidad = libro_Cantidad - _venta_Cantidad
        WHERE libro_Id = _libro_Id;

        SELECT 'Venta realizada correctamente.' AS Resultado;
    ELSE
        SELECT 'Stock insuficiente para realizar la venta.' AS Resultado;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-03 22:43:44
