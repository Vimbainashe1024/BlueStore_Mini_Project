-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 23, 2024 at 04:27 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db1`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `regnumber` varchar(255) NOT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `address`, `created_at`, `first_name`, `last_name`, `password`, `phone`, `regnumber`, `role`) VALUES
(1, '', '2024-10-23 09:53:00.000000', 'Charmaine Tafadzwa', 'Gombakomba', '$2a$10$EN0fkDlhNAPvztWkrg7jNeYt4gkIl.GFy6dY/EiGhc2lchS7A7inC', '0775216672', 'H230363Y', 'client'),
(3, '', '2024-10-23 12:06:26.000000', 'Charmaine Tafadzwa', 'Gombakomba', '$2a$10$DnQ0ZlSYWWv6qtHy29sGr.Tt0OG8SGNavp574YWEBPCP3bgPwAE6m', '', 'H23038P', 'client'),
(4, '', '2024-10-23 12:20:13.000000', 'Charmaine Tafadzwa', 'Gombakomba', '$2a$10$AeUk2.TkAUbdD4oZW7LKz.OStfsIBIhSOQIaNoBFF.W0Atalz8v8y', '', 'H456890L', 'client'),
(9, '', '2024-10-23 12:21:26.000000', 'Hilary', 'Gombakomba', '$2a$10$XC8L/Ix0KwMw66PFw7iQdeljlowzWFc5/0XOeLWbsChhchPt.Lgg.', '', 'H456890M', 'client'),
(10, '', '2024-10-23 15:18:07.000000', 'Hilary', 'Mun', '$2a$10$mg/uoEBSNv446UmSYTuLnO.5MMswoIQFkzUoV/q6CEV7NPCmhmxcO', '', 'H456892R', 'client'),
(11, '', '2024-10-23 15:19:01.000000', 'Hilary', 'Mun', '$2a$10$T0TbAtnB8tzO39x1zg.6M.SWvdTSMmAe7wQUtO.U6gnR.g3eH7G3O', '', 'H230787L', 'client'),
(12, '', '2024-10-23 15:44:16.000000', 'Tami', 'Chen', '$2a$10$lT91xIq4ZsIlHsCDNGw2JOgpH5y.zZImazquZ1HnzqaO7RKvYq66W', '', 'H230407R', 'client');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK1kxqaxyelno765ky6x7vrorfk` (`regnumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
