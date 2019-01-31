-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 31, 2019 at 03:32 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 5.6.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectuas`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `nik` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `ttl` varchar(225) NOT NULL,
  `alamat` varchar(250) NOT NULL,
  `jk` varchar(25) NOT NULL,
  `status` varchar(100) NOT NULL,
  `jabatan` varchar(100) NOT NULL,
  `status_kep` varchar(100) NOT NULL,
  `jam_kerja` varchar(100) NOT NULL,
  `tunjangan` varchar(225) NOT NULL,
  `gaji_pokok` double NOT NULL,
  `tanggal` varchar(224) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`nik`, `nama`, `ttl`, `alamat`, `jk`, `status`, `jabatan`, `status_kep`, `jam_kerja`, `tunjangan`, `gaji_pokok`, `tanggal`) VALUES
(1700320023, 'ayu aprilia', 'malang 01/04/1999', 'jln geguntur', 'Perempuan', 'menikah', 'Manager', 'tetap', '08.00-14.00', '1.700.000', 1000000, '2019-1-30 10:0'),
(1700330029, 'Zahratul Muttaqiin', 'Kabar 29.10.1999', 'jln Biola', 'Perempuan', 'Lajang', 'Manager', 'tetap', '08.00-16.00', '1.000.000', 2500000, '2019-1-31 9:14');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`nik`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pegawai`
--
ALTER TABLE `pegawai`
  MODIFY `nik` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1700330030;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
