-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2021 at 11:49 PM
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
  `harga` int(11) NOT NULL,
  `terima_order` char(1) NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `host_house`
--

INSERT INTO `host_house` (`id_house`, `id_host`, `no_hp`, `email`, `foto`, `harga`, `terima_order`) VALUES
(1, 2, '081234567890', 'putripethouse@example.com', 'host1.jpg', 100000, 'Y'),
(2, 3, '08080823456', 'email@email.com', 'host2.jpg', 120000, 'Y'),
(3, 8, '0878896545', 'mhmd@email.com', 'host3.jpg', 95000, 'Y'),
(4, 7, '12347859522', 'hosthewan@email.com', 'host4.jpg', 80000, 'N');

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `id_pesanan` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_host` int(11) NOT NULL,
  `nama_hewan` varchar(100) NOT NULL,
  `jenis` varchar(100) NOT NULL,
  `umur` int(3) NOT NULL,
  `makanan_fav_hewan` varchar(100) NOT NULL,
  `catatan` text NOT NULL,
  `layanan` varchar(15) NOT NULL,
  `check_in` varchar(10) NOT NULL,
  `check_out` varchar(10) NOT NULL,
  `voucher` varchar(100) NOT NULL DEFAULT 'N',
  `total` int(11) NOT NULL,
  `total_bayar` int(11) NOT NULL,
  `status` varchar(15) NOT NULL DEFAULT 'Belum',
  `waktu_pesan` varchar(19) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`id_pesanan`, `id_user`, `id_host`, `nama_hewan`, `jenis`, `umur`, `makanan_fav_hewan`, `catatan`, `layanan`, `check_in`, `check_out`, `voucher`, `total`, `total_bayar`, `status`, `waktu_pesan`) VALUES
(1, 1, 2, 'Coocoon', 'Kucing', 2, 'Ikan', '-', 'Normal', '16-06-2021', '17-06-2021', 'YNTKTS', 270000, 270000, 'Belum', '10-06-2021 12:40'),
(2, 4, 2, 'Bernard', 'Anjing', 2, 'Royal Canin', '-', 'Premium', '16-06-2021', '17-06-2021', 'N', 270000, 270000, 'Belum', '10-06-2021 14:33'),
(3, 5, 2, 'Abu', 'Kucing', 1, 'Whiskas Tuna', '-', 'Premium', '16-06-2021', '17-06-2021', 'N', 270000, 270000, 'Belum', '10-06-2021 14:40'),
(4, 1, 2, 'Eren Yeager', 'Anjing', 19, 'Ayam', '-', 'Pertalite', '16-06-2021', '17-06-2021', 'YNTKTS', 270000, 270000, 'Belum', '11-06-2021 11:40'),
(5, 1, 3, 'Melinda', 'Burung', 1, 'Kacang', '-', 'Premium', '14-06-2021', '16-06-2021', 'N', 270000, 270000, 'Belum', '11-06-2021 12:40'),
(6, 1, 2, 'Kola', 'Kucing', 2, 'Ikan', 'Tolong Kola selalu dimandikan dua kali ya', 'Deluxe', '16-06-2021', '18-06-2021', 'N', 260000, 260000, 'Belum', '11-06-2021 13:40'),
(7, 4, 8, 'Mendo', 'Anjing', 3, 'Ayam Cincang', '-', 'Pertalite', '13-06-2021', '14-06-2021', 'YNTKTS', 108000, 108000, 'Belum', '11-06-2021 14:40'),
(8, 4, 8, 'Melinda', 'Kucing', 2, 'Kacang Merah', '-', 'Normal', '14-06-2021', '15-06-2021', 'N', 95000, 95000, 'Belum', '11-06-2021 14:44'),
(9, 4, 8, 'Merinda', 'Hamster', 1, 'Kacang', 'hehe', 'Pertalite', '17-06-2021', '18-06-2021', 'YNTKTS', 135000, 108000, 'Belum', '12-06-2021 13:44'),
(10, 4, 8, 'Felix', 'Kucing', 2, 'asd', 'asdas', 'Pertalite', '24-06-2021', '25-06-2021', 'N', 135000, 135000, 'Selesai', '12-06-2021 14:40'),
(11, 1, 2, 'Mento', 'Kucing', 2, 'Ayam', '-', 'Premium', '17-06-2021', '18-06-2021', 'N', 115000, 115000, 'Selesai', '12-06-2021 14:44'),
(12, 1, 3, 'Messi', 'Ikan', 1, 'Kacang', '-', 'Deluxe', '15-06-2021', '16-06-2021', 'N', 150000, 150000, 'Selesai', '12-06-2021 21:49'),
(13, 1, 3, 'Kiara', 'Ayam', 2, 'cacing', '-', 'Deluxe', '16-06-2021', '17-06-2021', 'N', 150000, 150000, 'Belum', '14-06-2021 04:43');

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
(4, 4, 'MANTAPP BROSKIII', 5),
(5, 11, 'Kerenn!!', 5),
(6, 6, 'kirimm', 5),
(7, 12, 'Baguss!!!', 5);

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
(2, 'admin', 'admin', 'admin', 3),
(3, 'Putri Pet House', 'putri', 'putri', 2),
(4, 'haya', 'haya', 'haya', 1),
(5, 'ara', 'ara', 'ara', 1),
(6, 'Haya Pet House', 'sity', 'sity', 2),
(10, 'Mahmud Pet House', 'mhmd', '123', 2),
(11, 'Arsya Fikri', 'arsyf', '123456', 1),
(12, '123', '123', '123', 1),
(13, '123', '123', '123', 1);

-- --------------------------------------------------------

--
-- Table structure for table `voucher`
--

CREATE TABLE `voucher` (
  `id_voucher` int(11) NOT NULL,
  `kode` varchar(100) NOT NULL,
  `potongan` float NOT NULL,
  `aktif` enum('Y','N') NOT NULL,
  `pemakaian` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `voucher`
--

INSERT INTO `voucher` (`id_voucher`, `kode`, `potongan`, `aktif`, `pemakaian`) VALUES
(1, 'YNTKTS', 0.2, 'Y', 2),
(2, 'kktbsys', 0.1, 'Y', 1);

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
-- Indexes for table `voucher`
--
ALTER TABLE `voucher`
  ADD PRIMARY KEY (`id_voucher`);

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
  MODIFY `id_house` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `id_pesanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `review_rating_host`
--
ALTER TABLE `review_rating_host`
  MODIFY `id_review_rating` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `voucher`
--
ALTER TABLE `voucher`
  MODIFY `id_voucher` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
