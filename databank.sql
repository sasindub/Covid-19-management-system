-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 26, 2022 at 01:56 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `databank`
--

-- --------------------------------------------------------

--
-- Table structure for table `addvacc`
--

CREATE TABLE `addvacc` (
  `id` int(11) NOT NULL,
  `nic` varchar(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `tp` int(11) DEFAULT NULL,
  `1stVac` varchar(100) DEFAULT NULL,
  `2ndVac` varchar(100) DEFAULT NULL,
  `booster` varchar(100) DEFAULT NULL,
  `fullVac` varchar(5) DEFAULT NULL,
  `covidAffect` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addvacc`
--

INSERT INTO `addvacc` (`id`, `nic`, `name`, `age`, `email`, `tp`, `1stVac`, `2ndVac`, `booster`, `fullVac`, `covidAffect`) VALUES
(26, '196523654V', 'K.L.James', 55, 'james12@gmail.com', 774186325, 'Sinopharm', 'Sinopharm', 'Pfizer', 'yes', 'yes'),
(28, '195625351V', 'A.J.K.Sriman', 56, 'sriman123@gmail.com', 774569824, 'Sinopharm', 'no', 'no', 'no', 'yes');

-- --------------------------------------------------------

--
-- Table structure for table `affected`
--

CREATE TABLE `affected` (
  `id` int(11) NOT NULL,
  `nic` varchar(20) DEFAULT NULL,
  `reportNo` varchar(10) DEFAULT NULL,
  `day` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `deathpersons`
--

CREATE TABLE `deathpersons` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `nic` varchar(255) DEFAULT NULL,
  `reportNo` varchar(255) DEFAULT NULL,
  `day` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `deathpersons`
--

INSERT INTO `deathpersons` (`id`, `name`, `nic`, `reportNo`, `day`) VALUES
(5, 'A.J.K.Sriman', '195625351V', 'DD1956', '04.03.2022');

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `id` varchar(6) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `tp` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `idNo` varchar(255) NOT NULL,
  `position` varchar(60) DEFAULT NULL,
  `hospital` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birthday` varchar(255) DEFAULT NULL,
  `workyears` int(11) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`id`, `name`, `address`, `tp`, `email`, `idNo`, `position`, `hospital`, `gender`, `birthday`, `workyears`, `pass`) VALUES
('D1472', 'R.S.K.Smithri', 'J28/2, Will RD Colo', 456987561, 'smithr213@gmail.com', '195632154V', 'Senior Doctor', 'Colombo Base Hospital', 'Male', '10/02/1956', 40, 'Abcd123456'),
('D2543', 'A.D.D.Andrew', 'LL/5, Kom, Lariado', 774156987, 'andr22@gmail.com', '199635856V', 'Junior Doctor', 'Kandy Base Hospital', 'Male', '10/02/1996', 2, 'D12345678');

-- --------------------------------------------------------

--
-- Table structure for table `vaccpositiondetails`
--

CREATE TABLE `vaccpositiondetails` (
  `id` int(11) NOT NULL,
  `pnic` varchar(20) DEFAULT NULL,
  `did` varchar(10) DEFAULT NULL,
  `dmail` varchar(255) DEFAULT NULL,
  `dname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vaccpositiondetails`
--

INSERT INTO `vaccpositiondetails` (`id`, `pnic`, `did`, `dmail`, `dname`) VALUES
(8, '196523654V', 'D2543', 'andr22@gmail.com', 'A.D.D.Andrew'),
(9, '456985465V', 'null', 'null', 'null'),
(10, '195625351V', 'D1472', 'smithr213@gmail.com', 'R.S.K.Smithri');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addvacc`
--
ALTER TABLE `addvacc`
  ADD PRIMARY KEY (`id`,`nic`);

--
-- Indexes for table `affected`
--
ALTER TABLE `affected`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `deathpersons`
--
ALTER TABLE `deathpersons`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userdetails`
--
ALTER TABLE `userdetails`
  ADD PRIMARY KEY (`id`,`idNo`);

--
-- Indexes for table `vaccpositiondetails`
--
ALTER TABLE `vaccpositiondetails`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addvacc`
--
ALTER TABLE `addvacc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `affected`
--
ALTER TABLE `affected`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `deathpersons`
--
ALTER TABLE `deathpersons`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `vaccpositiondetails`
--
ALTER TABLE `vaccpositiondetails`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
