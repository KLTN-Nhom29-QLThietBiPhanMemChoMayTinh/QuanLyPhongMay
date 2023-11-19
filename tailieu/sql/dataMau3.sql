-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: quanly.c5us7fdyarum.ap-southeast-1.rds.amazonaws.com    Database: QuanLyPhongMay
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '';

--
-- Dumping data for table `ca_thuc_hanh`
--

LOCK TABLES `ca_thuc_hanh` WRITE;
/*!40000 ALTER TABLE `ca_thuc_hanh` DISABLE KEYS */;
/*!40000 ALTER TABLE `ca_thuc_hanh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `chuc_vu`
--

INSERT INTO `chuc_vu` VALUES (1,'Nhân viên quản lý'),(2,'Nhân viên hỗ trợ');


--
-- Dumping data for table `giao_vien`
--

INSERT INTO `giao_vien` VALUES ('GV001','email1@example.com','giaoVien1','Giáo sư','123456789',1);


--
-- Dumping data for table `khoa`
--


INSERT INTO `khoa` VALUES (1,'Công nghệ thông tin'),(2,'Tài chính kế toán'),(3,'Công nghệ thông tin'),(4,'Tài chính kế toán');


--
-- Dumping data for table `lich_truc`
--

INSERT INTO `lich_truc` VALUES (1,'2023-10-31 00:00:00.000000','6','14','NV003',3),(2,'2023-10-31 00:00:00.000000','14','22','NV004',3),(3,'2023-10-31 00:00:00.000000','6','14','NV005',3),(4,NULL,'14','22','NV004',NULL),(5,NULL,'14','22','NV005',NULL),(6,NULL,'14','22','NV005',NULL),(7,NULL,'14','22','NV005',NULL),(8,NULL,'14','22','NV001',NULL);


--
-- Dumping data for table `loai_thiet_bi`
--

INSERT INTO `loai_thiet_bi` VALUES (1,'Bàn phím'),(2,'Màn hình'),(3,'Chuột'),(4,'Loa');


--
-- Dumping data for table `may_tinh`
--

INSERT INTO `may_tinh` VALUES (1,'Máy H3M001','2023-10-25 00:00:00.000000','Đang hoạt động',1),(2,'Máy H3M002','2023-10-26 00:00:00.000000','Đang hoạt động',1),(3,'Máy H3M044','2023-10-27 00:00:00.000000','Đã hỏng',2),(4,'Máy H3M024','2023-10-28 00:00:00.000000','Đã hỏng',2);


--
-- Dumping data for table `mon_hoc`
--

INSERT INTO `mon_hoc` VALUES (1,'2023-10-01 00:00:00.000000','2023-11-30 00:00:00.000000','Lập trình C++'),(2,'2023-10-15 00:00:00.000000','2023-12-15 00:00:00.000000','Lập trình Python'),(3,'2023-11-01 00:00:00.000000','2024-01-31 00:00:00.000000','Lập trình Java'),(4,'2023-11-15 00:00:00.000000','2024-02-28 00:00:00.000000','Lập trình Web');


--
-- Dumping data for table `monhoc_phanmem`
--

INSERT INTO `monhoc_phanmem` VALUES (1,1),(2,2),(3,3),(4,4);


--
-- Dumping data for table `nhan_vien`
--


INSERT INTO `nhan_vien` VALUES ('NV001','email1@example.com','123456789','Nguyễn văn A',1),('NV002','email1@example.com','123456789','NhanVien2',2),('NV003','email3@example.com','0951753002','Nhân văn Viên 3',2),('NV004','email4@example.com','0951753004','Nhân văn Viên 4',2),('NV005','email5@example.com','0951753005','Nhân văn Viên 5',2);

--
-- Dumping data for table `phan_mem`
--

INSERT INTO `phan_mem` VALUES (1,'Môi trường phát triển tích hợp (IDE) phổ biến cho các ứng dụng Windows','2019','Visual Studio','Đang hoạt động'),(2,'Môi trường phát triển tích hợp (IDE) được sử dụng chủ yếu cho phát triển Java','2021-09','Eclipse','Đang hoạt động'),(3,'Môi trường phát triển tích hợp (IDE) cho nhiều ngôn ngữ lập trình','2021.3','IntelliJ IDEA','Đang hoạt động'),(4,'Một mã nguồn mở, nhẹ và mạnh mẽ cho phát triển ứng dụng web','1.61','Visual Studio Code','Đang hoạt động'),(5,'Môi trường phát triển tích hợp (IDE) phổ biến cho các ứng dụng Windows','2019','Visual Studio','Đang hoạt động'),(6,'Môi trường phát triển tích hợp (IDE) được sử dụng chủ yếu cho phát triển Java','2021-09','Eclipse','Đang hoạt động'),(7,'Môi trường phát triển tích hợp (IDE) cho nhiều ngôn ngữ lập trình','2021.3','IntelliJ IDEA','Đang hoạt động'),(8,'Một mã nguồn mở, nhẹ và mạnh mẽ cho phát triển ứng dụng web','1.61','Visual Studio Code','Đang hoạt động');


--
-- Dumping data for table `phong_may`
--

INSERT INTO `phong_may` VALUES (1,'Phòng máy 1',30,'Lab 101','Trống',1),(2,'Phòng máy 2',25,'Lab 102','Trống',1),(3,'Phòng máy 3',20,'Lab 201','Trống',2),(4,'Phòng máy 4',15,'Lab 202','Trống',5),(5,'Phòng máy 1',30,'Lab 301','Trống',3),(6,'Phòng máy 2',25,'Lab 302','Trống',4),(7,'Phòng máy 3',20,'Lab 201','Trống',3),(8,'Phòng máy 4',15,'Lab 202','Trống',5);


--
-- Dumping data for table `phongmay_phanmem`
--

INSERT INTO `phongmay_phanmem` VALUES (1,1,'2023-10-25 00:00:00.000000'),(1,3,'2023-10-25 00:00:00.000000'),(2,1,'2023-10-26 00:00:00.000000'),(2,2,'2023-10-26 00:00:00.000000'),(2,3,'2023-10-25 00:00:00.000000'),(2,4,'2023-10-27 00:00:00.000000'),(3,2,'2023-10-28 00:00:00.000000'),(3,3,'2023-10-27 00:00:00.000000'),(3,4,'2023-10-27 00:00:00.000000'),(4,1,'2023-10-26 00:00:00.000000'),(4,2,'2023-10-28 00:00:00.000000'),(4,4,'2023-10-28 00:00:00.000000');

--
-- Dumping data for table `quyen`
--

INSERT INTO `quyen` VALUES (1,'Người quản lý'),(2,'Giáo viên'),(3,'Nhân viên');


--
-- Dumping data for table `tai_khoan`
--

INSERT INTO `tai_khoan` VALUES ('GV001','123456A','giaovien1',2),('NV001','123456A','nhanvien1',1),('NV002','123456A','nhanvien2',3),('NV003','123456A','nhanvien3',3),('NV004','123456A','nhanvien4',3),('NV005','123456A','nhanvien5',3);


--
-- Dumping data for table `tang`
--

INSERT INTO `tang` VALUES (1,'Tầng 1',1),(2,'Tầng 2',1),(3,'Tầng 1',2),(4,'Tầng 2',2),(5,'Tầng 1',3),(6,'Tầng 2',3),(7,'Tầng 1',4),(8,'Tầng 2',4);


--
-- Dumping data for table `thiet_bi_may`
--

INSERT INTO `thiet_bi_may` VALUES (1,'2023-10-25 00:00:00','Bàn phím Logitech K780',2.5,1,1),(2,'2023-10-26 00:00:00','Màn hình Dell Ultrasharp U2719D',3,2,2),(3,'2023-10-27 00:00:00','Chuột Microsoft Ergonomic Mouse',1.5,3,3),(4,'2023-10-28 00:00:00','Loa Logitech Z623',2,4,4);


--
-- Dumping data for table `toa_nha`
--

INSERT INTO `toa_nha` VALUES (1,'Toà nhà A'),(2,'Toà nhà B'),(3,'Toà nhà C'),(4,'Toà nhà D'),(5,'Toà nhà E'),(6,'Toà nhà F'),(7,'Toà nhà F1'),(8,'Toà nhà F2');



SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-06  7:43:47
