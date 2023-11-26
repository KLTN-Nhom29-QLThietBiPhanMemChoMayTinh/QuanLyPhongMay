create database QuanLyPhongMay;
drop database QuanLyPhongMay;
use QuanLyPhongMay;
-- Thêm 2 quyền
INSERT INTO quyen (ten_quyen) VALUES ('Người quản lý');
INSERT INTO quyen (ten_quyen) VALUES ('Giáo viên');
INSERT INTO quyen (ten_quyen) VALUES ('Nhân viên');
-- Thêm 2 chức vụ
INSERT INTO chuc_vu (ten_cv) VALUES ('Nhân viên quản lý');
INSERT INTO chuc_vu (ten_cv) VALUES ('Nhân viên hỗ trợ');
-- Thêm 2 khoa
INSERT INTO khoa (ten_khoa) VALUES ('Công nghệ thông tin');
INSERT INTO khoa (ten_khoa) VALUES ('Tài chính kế toán');
-- Thêm 3 tài khoản và 3 người dùng
INSERT INTO tai_khoan (ma_tk, ten_dang_nhap, mat_khau, ma_quyen) VALUES ('NV001', 'nhanvien1', '123456A', 1);
INSERT INTO nhan_vien (ma_nv,ten_nv, email, sdt, ma_cv) VALUES ('NV001','Nguyen Van A', 'email1@example.com', '123456789', 1);
INSERT INTO tai_khoan (ma_tk, ten_dang_nhap, mat_khau, ma_quyen) VALUES ('GV001', 'giaovien1', '123456A', 2);
INSERT INTO giao_vien (ma_gv,ho_ten, email,hoc_vi ,so_dien_thoai, ma_khoa) VALUES ('GV001','Pham Thi B', 'email1@example.com', 'Giáo sư','123456789', 1);
INSERT INTO tai_khoan (ma_tk, ten_dang_nhap, mat_khau, ma_quyen) VALUES ('NV002', 'nhanvien2', '123456A', 3);
INSERT INTO nhan_vien (ma_nv,ten_nv, email, sdt, ma_cv) VALUES ('NV002','Nguyen Toan C', 'email1@example.com', '123456789', 2);	
INSERT INTO tai_khoan (ma_tk, ten_dang_nhap, mat_khau, ma_quyen) VALUES ('GV002', 'giaovien2', '123456A', 2);
INSERT INTO giao_vien (ma_gv,ho_ten, email,hoc_vi ,so_dien_thoai, ma_khoa) VALUES ('GV002','Pham Nguyen AB', 'email1@example.com', 'Giáo sư','123456789', 1);

-- Thêm 4 phần mềm
INSERT INTO phan_mem (mo_ta, ngay_cai_dat, phien_ban, ten_phanmem, trang_thai, tuoi_tho) VALUES
('Phần mềm phát triển ứng dụng Java', '2023-11-20 10:00:00', '4.0', 'Eclipse', 1, 2.5),
('IDE cho phát triển ứng dụng C++', '2023-11-20 14:30:00', '2022', 'Visual Studio', 1, 3.0),
('Phần mềm soạn thảo văn bản', '2023-11-21 08:45:00', '3.1', 'Microsoft Word', 1, 4.5);
INSERT INTO phan_mem (mo_ta, ngay_cai_dat, phien_ban, ten_phanmem, trang_thai, tuoi_tho)
VALUES 
  ('Phần mềm lập trình Android Studio', '2023-01-01 12:00:00', '3.0', 'Android Studio', 1, 2.5),
  ('Phần mềm thiết kế UML - Visual Paradigm', '2023-01-02 14:30:00', '15.0', 'Visual Paradigm', 1, 3.0),
  ('Phần mềm quản lý cơ sở dữ liệu - MySQL Workbench', '2023-01-03 10:45:00', '8.0', 'MySQL Workbench', 1, 2.8),
  ('Trình soạn thảo code - Visual Studio Code', '2023-01-04 08:15:00', '1.60', 'Visual Studio Code', 1, 1.5),
  ('Phần mềm quản lý cơ sở dữ liệu - DBeaver', '2023-01-05 16:00:00', '7.0', 'DBeaver', 1, 2.7);
INSERT INTO phan_mem (mo_ta, ngay_cai_dat, phien_ban, ten_phanmem, trang_thai, tuoi_tho)
VALUES 
  ('Phần mềm lập trình iOS - Xcode', '2023-01-06 09:30:00', '13.0', 'Xcode', 1, 2.3),
  ('Trình duyệt web - Google Chrome', '2023-01-07 11:00:00', '98.0', 'Google Chrome', 1, 3.5),
  ('Phần mềm lập trình Java - Eclipse', '2023-01-08 13:45:00', '2021-09', 'Eclipse', 1, 2.0),
  ('Phần mềm thiết kế đồ họa - Adobe Photoshop', '2023-01-09 15:20:00', 'CC 2022', 'Adobe Photoshop', 1, 4.0),
  ('Hệ điều hành - Windows 10', '2023-01-10 17:00:00', '10', 'Windows 10', 1, 5.0),
  ('Trình duyệt web - Mozilla Firefox', '2023-01-11 08:30:00', '96.0', 'Mozilla Firefox', 1, 3.2),
  ('Phần mềm lập trình Python - PyCharm', '2023-01-12 10:15:00', '2021.2.3', 'PyCharm', 1, 2.8),
  ('Phần mềm văn phòng - Microsoft Office', '2023-01-13 12:00:00', '365', 'Microsoft Office', 1, 4.5),
  ('Trình duyệt web - Microsoft Edge', '2023-01-14 14:00:00', '98.0', 'Microsoft Edge', 1, 3.0),
  ('Phần mềm lập trình C# - Visual Studio', '2023-01-15 16:30:00', '2022', 'Visual Studio', 1, 3.5);

-- Thêm 4 toà nhà
INSERT INTO toa_nha ( ten_toanha)
VALUES ( 'Toà nhà A');
INSERT INTO toa_nha (ten_toanha)
VALUES ('Toà nhà B');
INSERT INTO toa_nha (ten_toanha)
VALUES ('Toà nhà C');
INSERT INTO toa_nha ( ten_toanha)
VALUES ('Toà nhà D');

-- Thêm 4 tầng
INSERT INTO tang (ten_tang, ma_toanha)
VALUES ('Tầng 1', 1);
INSERT INTO tang (ten_tang, ma_toanha)
VALUES ('Tầng 2', 1);
INSERT INTO tang (ten_tang, ma_toanha)
VALUES ('Tầng 1', 2);
INSERT INTO tang (ten_tang, ma_toanha)
VALUES ('Tầng 2', 2);

-- Thêm 4 phòng máy
INSERT INTO phong_may (mo_ta, so_may, ten_phong, trang_thai, ma_tang)
VALUES ('Phòng máy 1', 30, 'Lab 101', 'Trống', 1);
INSERT INTO phong_may (mo_ta, so_may, ten_phong, trang_thai, ma_tang)
VALUES ('Phòng máy 2', 25, 'Lab 102', 'Trống', 1);
INSERT INTO phong_may (mo_ta, so_may, ten_phong, trang_thai, ma_tang)
VALUES ('Phòng máy 3', 20, 'Lab 201', 'Trống', 3);
INSERT INTO phong_may (mo_ta, so_may, ten_phong, trang_thai, ma_tang)
VALUES ('Phòng máy 4', 15, 'Lab 202', 'Trống', 4);

-- Thêm dữ liệu mẫu vào bảng phongmay_phanmem
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, status)
VALUES (1, 1, 1);
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, status)
VALUES (2, 2, 0);
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, status)
VALUES (3, 3, 1);
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, status)
VALUES (1, 3, 1);
-- Thêm 4 môn học
INSERT INTO mon_hoc (ngay_bat_dau, ngay_ket_thuc, ten_mon)
VALUES ('2023-10-01', '2023-11-30', 'Lập trình C++');
INSERT INTO mon_hoc (ngay_bat_dau, ngay_ket_thuc, ten_mon)
VALUES ('2023-10-15', '2023-12-15', 'Lập trình Python');
INSERT INTO mon_hoc (ngay_bat_dau, ngay_ket_thuc, ten_mon)
VALUES ('2023-11-01', '2024-01-31', 'Lập trình Java');
INSERT INTO mon_hoc (ngay_bat_dau, ngay_ket_thuc, ten_mon)
VALUES ('2023-11-15', '2024-02-28', 'Lập trình Web');

INSERT INTO ca_thuc_hanh (ngay_thuc_hanh, ten_ca, tiet_bat_dau, tiet_ket_thuc, ma_giao_vien, ma_mon, ma_phong_may) VALUES
('2023-11-20 08:00:00', 'sáng', 1, 3, 'GV001', 1, 1),
('2023-11-20 13:30:00', 'trưa', 6, 8, 'GV002', 2, 2),
('2023-11-21 10:45:00', 'tối', 9, 11, 'GV002', 3, 3);

-- Thêm 4 máy tính
INSERT INTO may_tinh (mo_ta, ngay_lap_dat, trang_thai, ma_phong)
VALUES ('Máy H3M001', '2023-10-25', 'Đang hoạt động', 1);
INSERT INTO may_tinh (mo_ta, ngay_lap_dat, trang_thai, ma_phong)
VALUES ('Máy H3M002', '2023-10-26', 'Đang hoạt động', 1);
INSERT INTO may_tinh (mo_ta, ngay_lap_dat, trang_thai, ma_phong)
VALUES ('Máy H3M044', '2023-10-27', 'Đã hỏng', 2);
INSERT INTO may_tinh (mo_ta, ngay_lap_dat, trang_thai, ma_phong)
VALUES ('Máy H3M024', '2023-10-28', 'Đã hỏng', 2);

-- Thêm 4 loại thiết bị máy
INSERT INTO loai_thiet_bi (ten_loai)
VALUES
  ('Chuột'),
  ('Bàn phím'),
  ('Màn hình'),
  ('Tai nghe'),
  ('Ổ cứng'),
  ('Card đồ họa'),
  ('Máy in'),
  ('Webcam'),
  ('Router'),
  ('USB');



-- Thêm thiết bị máy
INSERT INTO thiet_bi_may (ngay_cai_dat, status, ten_thiet_bi, tuoi_tho, ma_loai,so_tonkho)
VALUES
  ('2023-01-01', 1, 'Chuột Logitech MX Master 3', 3.5, 1,50),
  ('2023-02-15', 1, 'Bàn phím Corsair K95 RGB Platinum XT', 3.0, 2,50),
  ('2023-03-20', 1, 'Màn hình Dell UltraSharp U3419W', 5.0, 3,50),
  ('2023-04-10', 1, 'Tai nghe SteelSeries Arctis Pro Wireless', 2.5, 4,50),
  ('2023-05-05', 1, 'Ổ cứng SSD Samsung 970 EVO Plus 1TB', 4.0, 5,50),
  ('2023-06-18', 1, 'Card đồ họa NVIDIA GeForce RTX 3080', 4.0, 6,50),
  ('2023-07-30', 1, 'Máy in HP LaserJet Pro M404dn', 3.0, 7,50),
  ('2023-08-22', 1, 'Webcam Logitech C920 HD Pro', 2.0, 8,50),
  ('2023-09-14', 1, 'Router TP-Link Archer C7', 3.5, 9,50),
  ('2023-10-05', 1, 'USB Kingston DataTraveler 64GB', 2.0, 10,50);


INSERT INTO maytinh_thietbi (ma_may, ma_thiet_bi, status)
VALUES
  (1, 1, 1), -- Máy 1, Chuột Logitech MX Master 3
  (1, 2, 1), -- Máy 1, Bàn phím Corsair K95 RGB Platinum XT
  (1, 3, 1), -- Máy 1, Màn hình Dell UltraSharp U3419W
  (1, 4, 1), -- Máy 1, Tai nghe SteelSeries Arctis Pro Wireless
  (1, 5, 1), -- Máy 1, Ổ cứng SSD Samsung 970 EVO Plus 1TB
  (2, 6, 1), -- Máy 2, Card đồ họa NVIDIA GeForce RTX 3080
  (2, 7, 1), -- Máy 2, Máy in HP LaserJet Pro M404dn
  (2, 8, 1), -- Máy 2, Webcam Logitech C920 HD Pro
  (2, 9, 1), -- Máy 2, Router TP-Link Archer C7
  (2, 10, 1), -- Máy 2, USB Kingston DataTraveler 64GB
  (3, 1, 1), -- Máy 3, Chuột Logitech MX Master 3
  (3, 2, 1), -- Máy 3, Bàn phím Corsair K95 RGB Platinum XT
  (3, 3, 1), -- Máy 3, Màn hình Dell UltraSharp U3419W
  (3, 4, 1), -- Máy 3, Tai nghe SteelSeries Arctis Pro Wireless
  (3, 5, 1), -- Máy 3, Ổ cứng SSD Samsung 970 EVO Plus 1TB
  (4, 6, 1), -- Máy 4, Card đồ họa NVIDIA GeForce RTX 3080
  (4, 7, 1), -- Máy 4, Máy in HP LaserJet Pro M404dn
  (4, 8, 1), -- Máy 4, Webcam Logitech C920 HD Pro
  (4, 9, 1), -- Máy 4, Router TP-Link Archer C7
  (4, 10, 1); -- Máy 4, USB Kingston DataTraveler 64GB


INSERT INTO lich_truc (ngay_truc, thoi_gian_bat_dau, thoi_gian_ket_thuc, ma_nv, ma_tang) VALUES
('2023-01-11', '08:00', '12:00', 'NV001', 1),
('2023-01-02', '13:00', '17:00', 'NV002', 2),
('2023-01-04', '10:00', '15:00', 'NV001', 3),
('2023-05-04', '10:00', '15:00', 'NV001', 3),
('2023-06-04', '10:00', '15:00', 'NV001', 3),
('2023-11-04', '10:00', '15:00', 'NV001', 3),
('2023-11-04', '10:00', '15:00', 'NV001', 3),
('2023-12-04', '10:00', '15:00', 'NV001', 3),
('2023-12-04', '10:00', '15:00', 'NV001', 3),
('2023-12-04', '10:00', '15:00', 'NV001', 3),
('2023-12-04', '10:00', '15:00', 'NV001', 3),
('2023-12-04', '10:00', '15:00', 'NV001', 3),
('2023-10-04', '10:00', '15:00', 'NV001', 3);


INSERT INTO monhoc_phanmem (ma_mon, ma_phanmem)
VALUES (1, 1);
INSERT INTO monhoc_phanmem (ma_mon, ma_phanmem)
VALUES (2, 2);
INSERT INTO monhoc_phanmem (ma_mon, ma_phanmem)
VALUES (3, 3);


