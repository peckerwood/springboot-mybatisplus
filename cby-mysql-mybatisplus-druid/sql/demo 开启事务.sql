-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- 主机： 172.18.1.2
-- 生成日期： 2020-12-30 01:57:36
-- 服务器版本： 8.0.18
-- PHP 版本： 7.2.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 数据库： `demo`
--

-- --------------------------------------------------------

--
-- 表的结构 `message`
--

CREATE TABLE `message` (
  `id` int(11) NOT NULL,
  `message` varchar(512) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `message`
--

INSERT INTO `message` (`id`, `message`) VALUES
(1, 'hello0'),
(2, 'hello1'),
(3, 'hello2'),
(4, 'hello3'),
(5, 'hello4'),
(6, 'hello5'),
(7, 'hello6'),
(8, 'hello7'),
(9, 'hello8'),
(10, 'hello9'),
(11, 'hello10'),
(12, 'hello11'),
(13, 'hello12'),
(14, 'hello13'),
(15, 'hello14'),
(16, 'hello15'),
(17, 'hello16'),
(18, 'hello17'),
(19, 'hello18'),
(20, 'hello19'),
(21, 'hello20'),
(22, 'hello21'),
(23, 'hello22'),
(24, 'hello23'),
(25, 'hello24'),
(26, 'hello25'),
(27, 'hello26'),
(28, 'hello27'),
(29, 'hello28'),
(30, 'hello29'),
(31, 'hello30'),
(32, 'hello31'),
(33, 'hello32'),
(34, 'hello33'),
(35, 'hello34'),
(36, 'hello35'),
(37, 'hello36'),
(38, 'hello37'),
(39, 'hello38'),
(40, 'hello39'),
(41, 'hello40'),
(42, 'hello41'),
(43, 'hello42'),
(44, 'hello43'),
(45, 'hello44'),
(46, 'hello45'),
(47, 'hello46'),
(48, 'hello47'),
(49, 'hello48'),
(50, 'hello49'),
(51, 'hello50'),
(52, 'hello51'),
(53, 'hello52'),
(54, 'hello53'),
(55, 'hello54'),
(56, 'hello55'),
(57, 'hello56'),
(58, 'hello57'),
(59, 'hello58'),
(60, 'hello59'),
(61, 'hello60'),
(62, 'hello61'),
(63, 'hello62'),
(64, 'hello63'),
(65, 'hello64'),
(66, 'hello65'),
(67, 'hello66'),
(68, 'hello67'),
(69, 'hello68'),
(70, 'hello69'),
(71, 'hello70'),
(72, 'hello71'),
(73, 'hello72'),
(74, 'hello73'),
(75, 'hello74'),
(76, 'hello75'),
(77, 'hello76'),
(78, 'hello77'),
(79, 'hello78'),
(80, 'hello79'),
(81, 'hello80'),
(82, 'hello81'),
(83, 'hello82'),
(84, 'hello83'),
(85, 'hello84'),
(86, 'hello85'),
(87, 'hello86'),
(88, 'hello87'),
(89, 'hello88'),
(90, 'hello89'),
(91, 'hello90'),
(92, 'hello91'),
(93, 'hello92'),
(94, 'hello93'),
(95, 'hello94'),
(96, 'hello95'),
(97, 'hello96'),
(98, 'hello97'),
(99, 'hello98'),
(100, 'hello99');

-- --------------------------------------------------------

--
-- 表的结构 `order_product`
--

CREATE TABLE `order_product` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `item_count` int(11) NOT NULL DEFAULT '0',
  `price` decimal(16,2) NOT NULL DEFAULT '0.00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `order_product`
--

INSERT INTO `order_product` (`id`, `product_id`, `item_count`, `price`) VALUES
(1, 1, 1, '20.20'),
(2, 1, 1, '20.20'),
(3, 1, 1, '20.20');

-- --------------------------------------------------------

--
-- 表的结构 `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(512) NOT NULL,
  `description` varchar(512) DEFAULT NULL,
  `price` decimal(16,2) NOT NULL DEFAULT '0.00',
  `stock` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `product`
--

INSERT INTO `product` (`id`, `name`, `description`, `price`, `stock`) VALUES
(1, 'computer', 'computer description', '20.20', 997);

--
-- 转储表的索引
--

--
-- 表的索引 `message`
--
ALTER TABLE `message`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `order_product`
--
ALTER TABLE `order_product`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `message`
--
ALTER TABLE `message`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- 使用表AUTO_INCREMENT `order_product`
--
ALTER TABLE `order_product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- 使用表AUTO_INCREMENT `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
