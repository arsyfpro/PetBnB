-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2021 at 06:19 PM
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
(7, 9, 'Jauh banget jalan Conjuring', 'Y'),
(8, 10, 'Jl. Medan Sunggal', 'Y');

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

--
-- Dumping data for table `host_house`
--

INSERT INTO `host_house` (`id_house`, `id_host`, `no_hp`, `email`, `foto`, `terima_order`) VALUES
(1, 2, '081234567890', 'putripethouse@example.com', 'host1.jpg', 'Y'),
(2, 3, '08080823456', 'email@email.com', 'host2.jpg', 'Y'),
(3, 8, '0878896545', 'mhmd@email.com', 'host3.jpg', 'Y'),
(4, 7, '12347859522', 'hosthewan@email.com', 'host4.jpg', 'N');

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `id_pesanan` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_host` int(11) NOT NULL,
  `detail_pesanan` text NOT NULL DEFAULT 'Tes Pesanan'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`id_pesanan`, `id_user`, `id_host`, `detail_pesanan`) VALUES
(1, 1, 2, 'Tes Pesanan'),
(2, 4, 2, 'Tes Pesanan'),
(3, 5, 2, 'Tes Pesanan'),
(4, 1, 2, 'Tes Pesanan');

-- --------------------------------------------------------

--
-- Table structure for table `review_rating_host`
--

CREATE TABLE `review_rating_host` (
  `id_review_rating` int(11) NOT NULL,
  `id_pesanan` int(11) NOT NULL,
  `review` text NOT NULL,
  `rating` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `review_rating_host`
--

INSERT INTO `review_rating_host` (`id_review_rating`, `id_pesanan`, `review`, `rating`) VALUES
(1, 1, 'BAGUS!!!', 5),
(2, 2, 'HEHE SUKA BANGEETT', 4),
(3, 3, 'YAA SO SO LAH!!', 3),
(4, 4, 'MANTAPP BROSKIII', 5);

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
-- Indexes for table `host_house`
--
ALTER TABLE `host_house`
  ADD PRIMARY KEY (`id_house`);

--
-- Indexes for table `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`id_pesanan`);

--
-- Indexes for table `review_rating_host`
--
ALTER TABLE `review_rating_host`
  ADD PRIMARY KEY (`id_review_rating`);

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
-- AUTO_INCREMENT for table `host_house`
--
ALTER TABLE `host_house`
  MODIFY `id_house` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `id_pesanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `review_rating_host`
--
ALTER TABLE `review_rating_host`
  MODIFY `id_review_rating` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
