-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: bancopreguntas
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `respuesta`
--

DROP TABLE IF EXISTS `respuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `respuesta` (
  `idrespuesta` int NOT NULL,
  `respuesta` varchar(45) DEFAULT NULL,
  `literalABCD` varchar(25) DEFAULT NULL,
  `resultado` int DEFAULT NULL,
  `idpregunta` int DEFAULT NULL,
  PRIMARY KEY (`idrespuesta`),
  KEY `foreingKey_idPregunta_idx` (`idpregunta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `respuesta`
--

LOCK TABLES `respuesta` WRITE;
/*!40000 ALTER TABLE `respuesta` DISABLE KEYS */;
INSERT INTO `respuesta` VALUES (1,'amarillo,azul,rojo','A',1,1),(2,'amarillo,verde,rojo','B',0,1),(3,'verde,azul,rojo','C',0,1),(4,'amarillo,verde,rojo','D',0,1),(5,'nilo','A',0,2),(6,'amazonas','B',1,2),(7,'misisipi','C',0,2),(8,'danubio','D',0,2),(9,'Asia','A',0,3),(10,'Europa','B',0,3),(11,'America','C',1,3),(12,'Africa','D',0,3),(13,'Pez','A',0,4),(14,'Reptil','B',0,4),(15,'Mamifero','C',1,4),(16,'Oviparo','D',0,4),(17,'China','A',0,5),(18,'Brasil','B',0,5),(19,'Canada','C',0,5),(20,'Rusia','D',1,5),(21,'1910','A',0,6),(22,'1950','B',0,6),(23,'1939','C',1,6),(24,'1949','D',0,6),(25,'Colombia','A',0,7),(26,'Estados Unidos','B',0,7),(27,'Francia','C',0,7),(28,'Italia','D',1,7),(29,'India','A',0,8),(30,'Brasil','B',0,8),(31,'China','C',1,8),(32,'España','D',0,8),(33,'8','A',1,9),(34,'4','B',0,9),(35,'5','C',0,9),(36,'6','D',0,9),(37,'Murcielago','A',1,10),(38,'Ornitorrico','B',0,10),(39,'Nutria','C',0,10),(40,'Oso','D',0,10),(41,'Alemania','A',0,11),(42,'Escocia','B',0,11),(43,'Polonia','C',1,11),(44,'Italia','D',0,11),(45,'Brasileño','A',0,12),(46,'Chileno','B',1,12),(47,'Portugues','C',0,12),(48,'Colombiano','D',0,12),(49,'Croacia','A',0,13),(50,'Zagreb','B',1,13),(51,'Dinamov','C',0,13),(52,'Oslo','D',0,13),(53,'Cophenague','A',1,14),(54,'Andorra','B',0,14),(55,'Albania','C',0,14),(56,'Berlin','D',0,14),(57,'Roca','A',0,15),(58,'Brad Pitt','B',0,15),(59,'Sylvester Stallone','C',1,15),(60,'Leonardo Dicarpio','D',0,15),(61,'10 años','A',0,16),(62,'15 años','B',0,16),(63,'3 años','C',0,16),(64,'5 años','D',1,16),(65,'España','A',0,17),(66,'Inglaterra','B',1,17),(67,'Estados Unidos','C',0,17),(68,'Francia','D',0,17),(69,'Futbol','A',0,18),(70,'Basquetbol','B',0,18),(71,'Voleibol','C',0,18),(72,'Tenis','D',1,18),(73,'España','A',0,19),(74,'Reino Unido','B',1,19),(75,'Estados Unidos','C',0,19),(76,'Francia','D',0,19),(77,'Santiago Bernabeu','A',0,20),(78,'Palogrande','B',0,20),(79,'Camp nou','C',1,20),(80,'Bombonera','D',0,20),(81,'Leucemia','A',0,21),(82,'Cancer','B',0,21),(83,'Esclerosis','C',1,21),(84,'Artritis','D',0,21),(85,'100 años','A',0,22),(86,'95 años','B',0,22),(87,'99 años','C',0,22),(88,'116 años','D',1,22),(89,'Manila','A',1,23),(90,'Tirana','B',0,23),(91,'Luxenburgo','C',0,23),(92,'Liubliania','D',0,23),(93,'Helios','A',0,24),(94,'Aureliano','B',0,24),(95,'Ra','C',1,24),(96,'IaH','D',0,24),(97,'1948','A',0,25),(98,'1940','B',0,25),(99,'1950','C',0,25),(100,'1945','D',1,25);
/*!40000 ALTER TABLE `respuesta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-10 17:37:39
