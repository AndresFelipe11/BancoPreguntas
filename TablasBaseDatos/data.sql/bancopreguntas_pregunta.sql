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
-- Table structure for table `pregunta`
--

DROP TABLE IF EXISTS `pregunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pregunta` (
  `idpregunta` int NOT NULL AUTO_INCREMENT,
  `pregunta` varchar(100) DEFAULT NULL,
  `idronda` int NOT NULL,
  PRIMARY KEY (`idpregunta`),
  CONSTRAINT `preguntaKEY` FOREIGN KEY (`idpregunta`) REFERENCES `respuesta` (`idpregunta`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pregunta`
--

LOCK TABLES `pregunta` WRITE;
/*!40000 ALTER TABLE `pregunta` DISABLE KEYS */;
INSERT INTO `pregunta` VALUES (1,'¿Cuales son los colores primarios?',1),(2,'¿Cuál es el río más largo del mundo?',1),(3,'¿En qué continente está Ecuador?',1),(4,'¿Qué tipo de animal es la ballena?',1),(5,'¿Cuál es el país más grande del mundo?',1),(6,'¿En qué año comenzó la II Guerra Mundial?',2),(7,'¿Qué país tiene forma de bota?',2),(8,'¿Cual es país más poblado de la Tierra?',2),(9,'¿Cuántas patas tiene la araña?',2),(10,'¿Cuál es el único mamífero capaz de volar?',2),(11,'¿A qué país pertenece la ciudad de Varsovia?',3),(12,'¿Cuál es la nacionalidad de Pablo Neruda?',3),(13,'¿Cuál es la capital de Croacia?',3),(14,'¿Cuál es la capital de Dinamarca?',3),(15,'¿Quién es el protagonista de“Rocky”?',3),(16,'¿Cuántos años tiene un lustro?',4),(17,'¿En qué país se encuentra la Universidad de Cambridge?',4),(18,'¿Qué deporte practica profesionalmente Roger Federer?',4),(19,'¿En qué país se encuentra el estadio de Wembley?',4),(20,'¿Cómo se llama el estadio del F.C. Barcelona?',4),(21,'¿Qué enfermedad padeció Stephen Hawking?',5),(22,'¿Cuántos años duró la guerra de los 100 años?',5),(23,'¿Cuál es la capital de Filipinas? ',5),(24,'¿Cuál era el nombre del dios del Sol en el Antiguo Egipto?',5),(25,'¿En qué año se creó la Organización de las Naciones Unidas (ONU)?',5);
/*!40000 ALTER TABLE `pregunta` ENABLE KEYS */;
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
