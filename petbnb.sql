-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2021 at 01:38 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `petbnb`
--

-- --------------------------------------------------------

--
-- Table structure for table `host`
--

CREATE TABLE `host` (
  `id_host` int(11) NOT NULL,
  `id_user` int(5) NOT NULL,
  `alamat` text NOT NULL,
  `verified` char(1) NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `host`
--

INSERT INTO `host` (`id_host`, `id_user`, `alamat`, `verified`) VALUES
(2, 3, 'Jl. Tenggara Medan Kota', 'Y'),
(3, 6, 'Jalan Cinta Medan Baru', 'Y'),
(6, 8, 'jauh banget deh', 'N'),
(7, 9, 'Jauh banget jalan Conjuring', 'N'),
(8, 10, 'Jl. Medan Sunggal', 'N');

-- --------------------------------------------------------

--
-- Table structure for table `host_house`
--

CREATE TABLE `host_house` (
  `id_house` int(5) NOT NULL,
  `id_host` int(5) NOT NULL,
  `no_hp` varchar(20) NOT NULL,
  `email` varchar(320) NOT NULL,
  `foto` text NOT NULL,
  `terima_order` char(1) NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(15) NOT NULL,
  `user_level` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama`, `username`, `password`, `user_level`) VALUES
(1, 'sity fadia', 'fadia', 'fadia', 1),
(2, 'arsya', 'arsya', 'arsya', 3),
(3, 'Putri Pet House', 'putri', 'putri', 2),
(4, 'haya', 'haya', 'haya', 1),
(5, 'ara', 'ara', 'ara', 1),
(6, 'Haya Pet House', 'sity', 'sity', 2),
(8, 'felis catus lovers', 'asdasd', '123', 2),
(9, 'Mahmud Pet House', 'mhmd', '123', 2),
(10, 'Mahmud Pet House', 'mhmd', '123', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `host`
--
ALTER TABLE `host`
  ADD PRIMARY KEY (`id_host`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `host`
--
ALTER TABLE `host`
  MODIFY `id_host` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
