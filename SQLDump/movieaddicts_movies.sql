-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: movieaddicts
-- ------------------------------------------------------
-- Server version	5.7.15-log

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
-- Table structure for table `movies`
--

DROP TABLE IF EXISTS `movies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movies` (
  `movieid` int(11) NOT NULL AUTO_INCREMENT,
  `moviename` varchar(45) DEFAULT NULL,
  `moviegenre` varchar(45) DEFAULT NULL,
  `movieactors` varchar(255) DEFAULT NULL,
  `movieimagelocation` varchar(255) DEFAULT NULL,
  `moviedescription` varchar(500) DEFAULT NULL,
  `moviereleasedate` date DEFAULT NULL,
  `moviequantity` int(11) DEFAULT NULL,
  `movierating` int(11) DEFAULT NULL,
  PRIMARY KEY (`movieid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies`
--

LOCK TABLES `movies` WRITE;
/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
INSERT INTO `movies` VALUES (1,'Pete\'s Dragon','Adventure, Family, Fantasy','Bryce Dallas Howard, Robert Redford, Oakes Fegley ','images/Petes-Dragon-TMNS.png','The adventures of an orphaned boy named Pete and his best friend Elliot, who just so happens to be a dragon.','2016-08-12',0,71),(2,'Don\'t Breathe','Crime, Horror, Thriller ','Stephen Lang, Jane Levy, Dylan Minnette ','images/Dont-Breathe-TMNS.png','Hoping to walk away with a massive cash, a trio of thieves break into the house of a sick man who isn\'t as helpless as he seems.','2016-08-26',1,73),(3,'Snowden','Biography, Drama, Thriller ','Joseph Gordon-Levitt, Shailene Woodley, Melissa Leo ','images/Snowden-TMNS.png','The NSA\'s illegal surveillance techniques are leaked to the public by one of the agency\'s employees, Edward Snowden, in the form of thousands of classified documents distributed to the press.','2016-09-16',0,74),(4,'Operator ','Comedy, Drama ','Martin Starr, Mae Whitman, Nat Faxon ','images/Operator-TMNS.png','Joe, a programmer and obsessive self-quantifier, and Emily, a budding comedy performer, are happily married until they decide to use one another in their work.','2016-11-08',0,59),(5,'Mechanic: Resurrection ','Action, Crime, Thriller ','Jason Statham, Jessica Alba, Tommy Lee Jones ','images/Mechanic-Resurrection-TMNS.png','Arthur Bishop thought he had put his murderous past behind him when his most formidable foe kidnaps the love of his life. Now he is forced to travel the globe to complete three impossible assassinations, and do what he does best, make them look like accidents.','2016-08-26',2,57);
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-05 13:19:47
