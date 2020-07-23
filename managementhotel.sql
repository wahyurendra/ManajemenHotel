-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 23, 2020 at 01:52 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `managementhotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id_customer` int(11) NOT NULL,
  `kode_customer` varchar(10) NOT NULL COMMENT 'Kode Pengunjung',
  `no_identitas` varchar(20) NOT NULL COMMENT 'Nomor Identitas',
  `nama_customer` varchar(255) NOT NULL COMMENT 'Nama Pengunjung',
  `alamat` varchar(255) NOT NULL COMMENT 'Alamat',
  `jenis_kelamin` varchar(50) NOT NULL COMMENT 'Jenis Kelamin',
  `no_telp` varchar(20) NOT NULL COMMENT 'Nomor Telepon',
  `email` varchar(50) NOT NULL COMMENT 'E-Mail'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id_customer`, `kode_customer`, `no_identitas`, `nama_customer`, `alamat`, `jenis_kelamin`, `no_telp`, `email`) VALUES
(1, 'AH-Cust-1', '123456789', 'Tejo Wulan', 'Jakarta', 'Laki-laki', '08785465', 'mail@mail.com');

--
-- Triggers `customer`
--
DELIMITER $$
CREATE TRIGGER `getAI` BEFORE INSERT ON `customer` FOR EACH ROW SET NEW.kode_customer =CONCAT('AH-Cust-',(SELECT AUTO_INCREMENT FROM information_schema.TABLES WHERE TABLE_SCHEMA='hotel' AND TABLE_NAME='customer'))
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `id_kamar` int(11) NOT NULL,
  `no_kamar` varchar(10) NOT NULL COMMENT 'Nomor Kamar',
  `tipe_bed` varchar(50) NOT NULL COMMENT 'Tipe Tempat Tidur',
  `tipe_kamar` varchar(50) NOT NULL COMMENT 'Tipe Kamar',
  `occupied` int(11) NOT NULL COMMENT 'Status Kamar',
  `harga` int(11) NOT NULL COMMENT 'Harga'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`id_kamar`, `no_kamar`, `tipe_bed`, `tipe_kamar`, `occupied`, `harga`) VALUES
(7, '101', 'Single Bed', 'Standard Room', 1, 565000),
(8, '102', 'Single Bed', 'Standard Room', 1, 565000),
(9, '103', 'Single Bed', 'Standard Room', 1, 565000),
(10, '104', 'Double Bed', 'Standard Room', 1, 724000),
(11, '105', 'Double Bed', 'Standard Room', 1, 724000),
(12, '106', 'Double Bed', 'Standard Room', 1, 724000),
(13, '107', 'Twin Bed', 'Standard Room', 0, 618000),
(14, '108', 'Twin Bed', 'Standard Room', 1, 618000),
(15, '109', 'Twin Bed', 'Standard Room', 1, 618000),
(16, '110', 'Family Bed', 'Standard Room', 0, 883000),
(17, '111', 'Family Bed', 'Standard Room', 1, 883000),
(18, '112', 'Family Bed', 'Standard Room', 0, 883000),
(19, '201', 'Single Bed', 'Superior Room', 1, 828000),
(20, '202', 'Single Bed', 'Superior Room', 1, 828000),
(21, '203', 'Single Bed', 'Superior Room', 1, 828000),
(22, '204', 'Double Bed', 'Superior Room', 1, 987000),
(23, '205', 'Double Bed', 'Superior Room', 1, 987000),
(24, '206', 'Double Bed', 'Superior Room', 1, 987000),
(25, '207', 'Twin Bed', 'Superior Room', 0, 881000),
(26, '208', 'Twin Bed', 'Superior Room', 1, 881000),
(27, '209', 'Twin Bed', 'Superior Room', 1, 881000),
(28, '210', 'Family Bed', 'Superior Room', 1, 1146000),
(29, '211', 'Family Bed', 'Superior Room', 1, 1146000),
(30, '212', 'Family Bed', 'Superior Room', 1, 1146000),
(31, '301', 'Single Bed', 'Deluxe Room', 1, 1091000),
(32, '302', 'Single Bed', 'Deluxe Room', 1, 1091000),
(33, '303', 'Single Bed', 'Deluxe Room', 1, 1091000),
(34, '304', 'Double Bed', 'Deluxe Room', 1, 1250000),
(35, '305', 'Double Bed', 'Deluxe Room', 1, 1250000),
(36, '306', 'Double Bed', 'Deluxe Room', 0, 1250000),
(37, '307', 'Twin Bed', 'Deluxe Room', 1, 1144000),
(38, '308', 'Twin Bed', 'Deluxe Room', 1, 1144000),
(39, '309', 'Twin Bed', 'Deluxe Room', 1, 1144000),
(40, '310', 'Family Bed', 'Deluxe Room', 1, 1409000),
(41, '311', 'Family Bed', 'Deluxe Room', 1, 1409000),
(42, '312', 'Family Bed', 'Deluxe Room', 1, 1409000),
(43, '401', 'Single Bed', 'Junior Suite Room', 1, 1453000),
(44, '402', 'Single Bed', 'Junior Suite Room', 1, 1453000),
(45, '403', 'Single Bed', 'Junior Suite Room', 1, 1453000),
(46, '404', 'Double Bed', 'Junior Suite Room', 0, 1612000),
(47, '405', 'Double Bed', 'Junior Suite Room', 1, 1612000),
(48, '406', 'Double Bed', 'Junior Suite Room', 1, 1612000),
(49, '407', 'Twin Bed', 'Junior Suite Room', 1, 1506000),
(50, '408', 'Twin Bed', 'Junior Suite Room', 1, 1506000),
(51, '409', 'Twin Bed', 'Junior Suite Room', 1, 1506000),
(52, '410', 'Family Bed', 'Junior Suite Room', 1, 1771000),
(53, '411', 'Family Bed', 'Junior Suite Room', 1, 1771000),
(54, '412', 'Family Bed', 'Junior Suite Room', 1, 1771000),
(55, '501', 'Single Bed', 'Suite Room', 1, 1815000),
(56, '502', 'Single Bed', 'Suite Room', 0, 1815000),
(57, '503', 'Single Bed', 'Suite Room', 1, 1815000),
(58, '504', 'Double Bed', 'Suite Room', 1, 1974000),
(59, '505', 'Double Bed', 'Suite Room', 0, 1974000),
(60, '506', 'Double Bed', 'Suite Room', 1, 1974000),
(61, '507', 'Twin Bed', 'Suite Room', 1, 1868000),
(62, '508', 'Twin Bed', 'Suite Room', 1, 1868000),
(63, '509', 'Twin Bed', 'Suite Room', 1, 1868000),
(64, '510', 'Family Bed', 'Suite Room', 1, 2133000),
(65, '511', 'Family Bed', 'Suite Room', 1, 2133000),
(66, '512', 'Family Bed', 'Suite Room', 1, 2133000),
(67, '601', 'Single Bed', 'Presidential Suite', 1, 2177000),
(68, '602', 'Single Bed', 'Presidential Suite', 1, 2177000),
(69, '603', 'Single Bed', 'Presidential Suite', 1, 2177000),
(70, '604', 'Double Bed', 'Presidential Suite', 1, 2336000),
(71, '605', 'Double Bed', 'Presidential Suite', 0, 2336000),
(72, '606', 'Double Bed', 'Presidential Suite', 1, 2336000),
(73, '607', 'Twin Bed', 'Presidential Suite', 1, 2230000),
(74, '608', 'Twin Bed', 'Presidential Suite', 1, 2230000),
(75, '609', 'Twin Bed', 'Presidential Suite', 1, 2230000),
(76, '610', 'Family Bed', 'Presidential Suite', 0, 2495000),
(77, '611', 'Family Bed', 'Presidential Suite', 1, 2495000),
(78, '612', 'Family Bed', 'Presidential Suite', 1, 2495000),
(79, '113', 'Single Bed', 'Standard Room', 1, 1231132);

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `id_recept` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `kode_recept` varchar(10) NOT NULL COMMENT 'Kode Resepsionis',
  `nama_recept` varchar(255) NOT NULL COMMENT 'Nama Resepsionis',
  `tmp_lahir` varchar(255) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `no_telp` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`id_recept`, `username`, `password`, `kode_recept`, `nama_recept`, `tmp_lahir`, `tgl_lahir`, `jenis_kelamin`, `alamat`, `no_telp`) VALUES
(1, 'ardhito_p', '81dc9bdb52d04dc20036dbd8313ed055', 'L001', 'Ardhito Pranoto', 'Surabaya', '1996-03-26', 'Laki-laki', 'Jl. Watu Kodok No.05 ', '081234567890'),
(5, 'cokicoki', '81dc9bdb52d04dc20036dbd8313ed055', 'L005', 'Coki Sihotang', 'Tangerang', '1995-07-21', 'Laki-laki', 'Jl. Mobil Balap No.27', '083210987654');

-- --------------------------------------------------------

--
-- Table structure for table `reservasi`
--

CREATE TABLE `reservasi` (
  `id_reservasi` int(11) NOT NULL,
  `kode_customer` varchar(10) NOT NULL,
  `no_kamar` varchar(10) NOT NULL,
  `tgl_checkin` date NOT NULL COMMENT 'Tanggal Check-in',
  `tgl_checkout` date NOT NULL COMMENT 'Tanggal Check-out',
  `kode_recept` varchar(10) NOT NULL,
  `status_reservasi` int(11) NOT NULL COMMENT 'Status'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservasi`
--

INSERT INTO `reservasi` (`id_reservasi`, `kode_customer`, `no_kamar`, `tgl_checkin`, `tgl_checkout`, `kode_recept`, `status_reservasi`) VALUES
(1, 'AH-Cust-1', '605', '2020-04-14', '2020-04-16', 'L001', 1),
(2, 'AH-Cust-1', '610', '2020-04-14', '2020-04-16', 'L001', 1);

-- --------------------------------------------------------

--
-- Table structure for table `super_admin`
--

CREATE TABLE `super_admin` (
  `id_admin` int(11) NOT NULL,
  `kode_admin` varchar(10) NOT NULL,
  `nama_admin` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `salt` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `super_admin`
--

INSERT INTO `super_admin` (`id_admin`, `kode_admin`, `nama_admin`, `username`, `password`, `salt`) VALUES
(1, 'A001', 'Admin', 'admin', 'a38eb7764a0f13ea1175102f6e58a2abf46551059d7a9a27d30f428f8bdab811', '4xqvdxkax4');

-- --------------------------------------------------------

--
-- Stand-in structure for view `view_reservasi`
-- (See below for the actual view)
--
CREATE TABLE `view_reservasi` (
`id_reservasi` int(11)
,`kode_customer` varchar(10)
,`nama_customer` varchar(255)
,`no_telp` varchar(20)
,`no_kamar` varchar(10)
,`tgl_checkin` date
,`tgl_checkout` date
,`nama_recept` varchar(255)
,`status_reservasi` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `view_reservasi_full`
-- (See below for the actual view)
--
CREATE TABLE `view_reservasi_full` (
`id_reservasi` int(11)
,`kode_customer` varchar(10)
,`no_identitas` varchar(20)
,`nama_customer` varchar(255)
,`alamat` varchar(255)
,`jenis_kelamin` varchar(50)
,`no_telp` varchar(20)
,`email` varchar(50)
,`no_kamar` varchar(10)
,`tipe_bed` varchar(50)
,`tipe_kamar` varchar(50)
,`harga` int(11)
,`tgl_checkin` date
,`tgl_checkout` date
,`status_reservasi` int(11)
,`kode_recept` varchar(10)
,`nama_recept` varchar(255)
);

-- --------------------------------------------------------

--
-- Structure for view `view_reservasi`
--
DROP TABLE IF EXISTS `view_reservasi`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_reservasi`  AS  select `reservasi`.`id_reservasi` AS `id_reservasi`,`customer`.`kode_customer` AS `kode_customer`,`customer`.`nama_customer` AS `nama_customer`,`customer`.`no_telp` AS `no_telp`,`kamar`.`no_kamar` AS `no_kamar`,`reservasi`.`tgl_checkin` AS `tgl_checkin`,`reservasi`.`tgl_checkout` AS `tgl_checkout`,`receptionist`.`nama_recept` AS `nama_recept`,`reservasi`.`status_reservasi` AS `status_reservasi` from (((`customer` join `kamar`) join `reservasi`) join `receptionist`) where `reservasi`.`kode_customer` = `customer`.`kode_customer` and `reservasi`.`no_kamar` = `kamar`.`no_kamar` and `reservasi`.`kode_recept` = `receptionist`.`kode_recept` WITH CASCADED CHECK OPTION ;

-- --------------------------------------------------------

--
-- Structure for view `view_reservasi_full`
--
DROP TABLE IF EXISTS `view_reservasi_full`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_reservasi_full`  AS  select `reservasi`.`id_reservasi` AS `id_reservasi`,`customer`.`kode_customer` AS `kode_customer`,`customer`.`no_identitas` AS `no_identitas`,`customer`.`nama_customer` AS `nama_customer`,`customer`.`alamat` AS `alamat`,`customer`.`jenis_kelamin` AS `jenis_kelamin`,`customer`.`no_telp` AS `no_telp`,`customer`.`email` AS `email`,`kamar`.`no_kamar` AS `no_kamar`,`kamar`.`tipe_bed` AS `tipe_bed`,`kamar`.`tipe_kamar` AS `tipe_kamar`,`kamar`.`harga` AS `harga`,`reservasi`.`tgl_checkin` AS `tgl_checkin`,`reservasi`.`tgl_checkout` AS `tgl_checkout`,`reservasi`.`status_reservasi` AS `status_reservasi`,`receptionist`.`kode_recept` AS `kode_recept`,`receptionist`.`nama_recept` AS `nama_recept` from (((`customer` join `kamar`) join `reservasi`) join `receptionist`) where `reservasi`.`kode_customer` = `customer`.`kode_customer` and `reservasi`.`no_kamar` = `kamar`.`no_kamar` and `reservasi`.`kode_recept` = `receptionist`.`kode_recept` WITH CASCADED CHECK OPTION ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_customer`),
  ADD UNIQUE KEY `kode_customer` (`kode_customer`) USING BTREE;

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`id_kamar`),
  ADD UNIQUE KEY `no_kamar` (`no_kamar`) USING BTREE;

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`id_recept`),
  ADD UNIQUE KEY `kode_recept` (`kode_recept`);

--
-- Indexes for table `reservasi`
--
ALTER TABLE `reservasi`
  ADD PRIMARY KEY (`id_reservasi`),
  ADD KEY `no_kamar` (`no_kamar`),
  ADD KEY `kode_recept` (`kode_recept`),
  ADD KEY `kode_customer` (`kode_customer`) USING BTREE;

--
-- Indexes for table `super_admin`
--
ALTER TABLE `super_admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id_customer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `kamar`
--
ALTER TABLE `kamar`
  MODIFY `id_kamar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=80;

--
-- AUTO_INCREMENT for table `receptionist`
--
ALTER TABLE `receptionist`
  MODIFY `id_recept` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `reservasi`
--
ALTER TABLE `reservasi`
  MODIFY `id_reservasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `super_admin`
--
ALTER TABLE `super_admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reservasi`
--
ALTER TABLE `reservasi`
  ADD CONSTRAINT `reservasi_ibfk_1` FOREIGN KEY (`kode_customer`) REFERENCES `customer` (`kode_customer`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservasi_ibfk_2` FOREIGN KEY (`no_kamar`) REFERENCES `kamar` (`no_kamar`),
  ADD CONSTRAINT `reservasi_ibfk_3` FOREIGN KEY (`kode_recept`) REFERENCES `receptionist` (`kode_recept`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
