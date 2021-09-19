-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 07, 2019 at 01:38 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` varchar(15) NOT NULL,
  `password` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `password`) VALUES
('sourav', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE IF NOT EXISTS `marks` (
  `id` varchar(15) NOT NULL,
  `pc` int(3) NOT NULL,
  `maths` int(3) NOT NULL,
  `english` int(3) NOT NULL,
  `cfo` int(3) NOT NULL,
  `os` int(3) NOT NULL,
  `total` int(3) NOT NULL,
  `percentage` float NOT NULL,
  `cgpa` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`id`, `pc`, `maths`, `english`, `cfo`, `os`, `total`, `percentage`, `cgpa`) VALUES
('CS18', 90, 90, 98, 85, 89, 452, 90, 9.47368),
('CS17', 90, 80, 87, 76, 89, 422, 84, 8.8421),
('CS19', 88, 90, 90, 80, 75, 423, 84, 8.8421),
('CS123', 80, 75, 75, 80, 80, 390, 78, 8.21053),
('CS18BCA01', 70, 90, 70, 80, 90, 400, 80, 8.42105),
('12', 80, 80, 80, 78, 75, 393, 78, 8.21053);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `name` text NOT NULL,
  `branch` text NOT NULL,
  `course` text NOT NULL,
  `year` int(4) NOT NULL,
  `id` varchar(15) NOT NULL,
  `password` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`name`, `branch`, `course`, `year`, `id`, `password`) VALUES
('surajita', 'cs', 'BSC IT', 2018, 'cs12', ''),
('amit', 'cs', 'BSC IT', 2017, 'cs1751', 'pAhl5'),
('Gautam', 'SCS', 'BSC IT', 2018, 'CS18', 'igt2v'),
('SOURAV GHOSH', 'SCS', 'BCA', 2018, 'CS11', 'pohus'),
('AMIT', 'SCS', 'BSC IT', 2017, 'CS123', 'b8jtv'),
('NAYAN', 'SCS', 'MCA', 2017, '30', 'hmatj'),
('AMIT', 'SCS', 'MCA', 2017, '30', 'hroeq'),
('SAIKAT GHOSE', 'SCS', 'BCA', 2019, '12', 'ddxna');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
