-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: creche_gennevilliers
-- ------------------------------------------------------
-- Server version	8.0.15

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
-- Table structure for table `demandeponctuelle`
--

DROP TABLE IF EXISTS `demandeponctuelle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `demandeponctuelle` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `arrivee` datetime NOT NULL,
  `depart` datetime NOT NULL,
  `email` varchar(320) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `demandeponctuelle`
--

LOCK TABLES `demandeponctuelle` WRITE;
/*!40000 ALTER TABLE `demandeponctuelle` DISABLE KEYS */;
INSERT INTO `demandeponctuelle` VALUES (11,'2019-07-16 08:00:00','2019-07-16 20:00:00','i-tem@live.fr'),(12,'2019-07-24 08:00:00','2019-07-25 08:00:00','i-tem@live.fr'),(13,'2019-07-24 08:00:00','2019-07-25 08:00:00','i-tem@live.fr'),(14,'2019-07-24 08:00:00','2019-07-25 08:00:00','i-tem@live.fr'),(15,'2019-07-24 09:00:00','2019-07-25 23:00:00','i-tem@live.fr'),(16,'2019-07-18 08:00:00','2019-07-24 22:00:00','haythem75008@gmail.Com'),(17,'2019-07-18 08:00:00','2019-07-24 22:00:00','haythem75008@gmail.Com');
/*!40000 ALTER TABLE `demandeponctuelle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enfants`
--

DROP TABLE IF EXISTS `enfants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `enfants` (
  `nomDEFamilleEnfant` varchar(30) NOT NULL,
  `prenomEnfant` varchar(30) NOT NULL,
  `age` varchar(2) NOT NULL,
  `sex` varchar(5) NOT NULL,
  `allergie` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enfants`
--

LOCK TABLES `enfants` WRITE;
/*!40000 ALTER TABLE `enfants` DISABLE KEYS */;
INSERT INTO `enfants` VALUES ('BARRANI','Leyth','2','M','Veuillez preciser si l\'enfant Ã  des allergies'),('karima','mima','2','M','Veuillez preciser si l\'enfant Ã  des allergies'),('kino','boubou','2','F','Veuillez preciser si l\'enfant Ã  des allergies');
/*!40000 ALTER TABLE `enfants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identifiants`
--

DROP TABLE IF EXISTS `identifiants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `identifiants` (
  `login` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identifiants`
--

LOCK TABLES `identifiants` WRITE;
/*!40000 ALTER TABLE `identifiants` DISABLE KEYS */;
INSERT INTO `identifiants` VALUES ('haythem','Hercules86'),('sanaa','naciri87');
/*!40000 ALTER TABLE `identifiants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parents`
--

DROP TABLE IF EXISTS `parents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `parents` (
  `nomDeFamille` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `adressePostale` varchar(50) NOT NULL,
  `codePostale` varchar(10) NOT NULL,
  `ville` varchar(20) NOT NULL,
  `telephone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telephone2` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parents`
--

LOCK TABLES `parents` WRITE;
/*!40000 ALTER TABLE `parents` DISABLE KEYS */;
INSERT INTO `parents` VALUES ('deniro','robert','67 rue de rome','92230','gennevilliers','06XXXXX','haythem75008@gmail.Com','06XXXXX'),('BARRANI','Haythem','2 RUE CHARLES BAUDELAIRE','92240','malakoff','0769022716','i-tem@live.fr','0000'),('NACIRI','BARRANI OU','2     R CHARLES BAUDELAIRE','92240','MALAKOFF','0778780222','nacirisanaa@hotmail.fr','06XXXXX');
/*!40000 ALTER TABLE `parents` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-07 22:50:58
