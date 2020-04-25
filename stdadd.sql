-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 23, 2020 at 11:56 AM
-- Server version: 8.0.18
-- PHP Version: 7.3.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stdadd`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `id` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `label` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `teacher` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `label`, `teacher`) VALUES
('01204111', 'Computers and Programming', 'Adisak S.'),
('03601203', 'Electronics for Computer Engineers', 'Pairote T.'),
('03603112', 'Programming Fundamentals II', 'Kulwadee S.'),
('03603223', 'Computer Architecture and Organization', 'Jirawat J.'),
('03603251', 'Database Systems', 'Anan B.'),
('03603252', 'Database Systems Laboratory', 'Anan B.'),
('03603299', 'Exploratory Project in Computing', 'Nanta J.'),
('03603325', 'Data Communications and Computer Networks', 'Prawit C.'),
('03601205', 'Electric Circuit Laboratory for Computer Engineers', '-');

-- --------------------------------------------------------

--
-- Table structure for table `score`
--

CREATE TABLE `score` (
  `Student_ID` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Course_ID` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Student_Score` int(11) NOT NULL,
  `Description` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `score`
--

INSERT INTO `score` (`Student_ID`, `Course_ID`, `Student_Score`, `Description`) VALUES
('6130300549', 'Data Communications and Computer Networks', 22, 'Midterm');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `ID` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `First_Name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Last_Name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Sex` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Phone_Number` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Address` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `First_Name`, `Last_Name`, `Sex`, `Phone_Number`, `Address`) VALUES
('6130300549', 'Pajaree', 'Wiyasing', 'Female', '0628019565', 'Chonburi '),
('6130300433', 'Pattarapon', 'Buddee', 'Male', '0619548624', 'Lobburi');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `User_Name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Password` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`User_Name`, `Password`) VALUES
('zincexx', '7725432000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
