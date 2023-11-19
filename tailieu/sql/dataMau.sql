create database QuanLyPhongMay;
use QuanLyPhongMay2;
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
INSERT INTO nhan_vien (ma_nv,ten_nv, email, sdt, ma_cv) VALUES ('NV001','Nguyễn văn A', 'email1@example.com', '123456789', 1);
INSERT INTO tai_khoan (ma_tk, ten_dang_nhap, mat_khau, ma_quyen) VALUES ('GV001', 'giaovien1', '123456A', 2);
INSERT INTO giao_vien (ma_gv,ho_ten, email,hoc_vi ,so_dien_thoai, ma_khoa) VALUES ('GV001','giaoVien1', 'email1@example.com', 'Giáo sư','123456789', 1);
INSERT INTO tai_khoan (ma_tk, ten_dang_nhap, mat_khau, ma_quyen) VALUES ('NV002', 'nhanvien2', '123456A', 3);
INSERT INTO nhan_vien (ma_nv,ten_nv, email, sdt, ma_cv) VALUES ('NV002','NhanVien2', 'email1@example.com', '123456789', 2);	
 ---
INSERT INTO tai_khoan (ma_tk, ten_dang_nhap, mat_khau, ma_quyen) VALUES ('NV003', 'nhanvien3', '123456A', 3);
INSERT INTO nhan_vien (ma_nv,ten_nv, email, sdt, ma_cv) VALUES ('NV003','Nhân văn Viên 3', 'email3@example.com', '0951753002', 2);	
INSERT INTO tai_khoan (ma_tk, ten_dang_nhap, mat_khau, ma_quyen) VALUES ('NV004', 'nhanvien4', '123456A', 3);
INSERT INTO nhan_vien (ma_nv,ten_nv, email, sdt, ma_cv) VALUES ('NV004','Nhân văn Viên 4', 'email4@example.com', '0951753004', 2);	
INSERT INTO tai_khoan (ma_tk, ten_dang_nhap, mat_khau, ma_quyen) VALUES ('NV005', 'nhanvien5', '123456A', 3);
INSERT INTO nhan_vien (ma_nv,ten_nv, email, sdt, ma_cv) VALUES ('NV005','Nhân văn Viên 5', 'email5@example.com', '0951753005', 2);	


-- Thêm 4 phần mềm
INSERT INTO phan_mem (mo_ta, phien_ban, ten_phanmem, trang_thai)
VALUES ('Môi trường phát triển tích hợp (IDE) phổ biến cho các ứng dụng Windows', '2019', 'Visual Studio', TRUE);
INSERT INTO phan_mem (mo_ta, phien_ban, ten_phanmem, trang_thai)
VALUES ('Môi trường phát triển tích hợp (IDE) được sử dụng chủ yếu cho phát triển Java', '2021-09', 'Eclipse', TRUE);
INSERT INTO phan_mem (mo_ta, phien_ban, ten_phanmem, trang_thai)
VALUES ('Môi trường phát triển tích hợp (IDE) cho nhiều ngôn ngữ lập trình', '2021.3', 'IntelliJ IDEA', TRUE);
INSERT INTO phan_mem (mo_ta, phien_ban, ten_phanmem, trang_thai)
VALUES ('Một mã nguồn mở, nhẹ và mạnh mẽ cho phát triển ứng dụng web', '1.61', 'Visual Studio Code', TRUE);

-- Thêm 4 toà nhà
INSERT INTO toa_nha (so_tang, ten_toanha)
VALUES (10, 'Toà nhà A');
INSERT INTO toa_nha (so_tang, ten_toanha)
VALUES (5, 'Toà nhà B');
INSERT INTO toa_nha (so_tang, ten_toanha)
VALUES (8, 'Toà nhà C');
INSERT INTO toa_nha (so_tang, ten_toanha)
VALUES (12, 'Toà nhà D');

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
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (1, 1, '2023-10-25');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (2, 2, '2023-10-26');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (3, 3, '2023-10-27');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (4, 4, '2023-10-28');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (1, 3, '2023-10-25');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (2, 1, '2023-10-26');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (3, 4, '2023-10-27');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (4, 2, '2023-10-28');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (2, 3, '2023-10-25');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (4, 1, '2023-10-26');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (2, 4, '2023-10-27');
INSERT INTO phongmay_phanmem (ma_phanmem, ma_phong, ngay_cai_dat)
VALUES (3, 2, '2023-10-28');

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
VALUES ('Bàn phím');
INSERT INTO loai_thiet_bi (ten_loai)
VALUES ('Màn hình');
INSERT INTO loai_thiet_bi (ten_loai)
VALUES ('Chuột');
INSERT INTO loai_thiet_bi (ten_loai)
VALUES ('Loa');

-- Thêm 4 thiết bị máy
-- '2023-10-25',
-- INSERT INTO thiet_bi_may (ngay_cai_dat, ten_thiet_bi, tuoi_tho, ma_loai, ma_may)
-- VALUES ('2023-10-28', 'Loa Logitech Z623', 2.0, 4, 4);
INSERT INTO thiet_bi_may ( `ngay_cai_dat`, `ten_thiet_bi`, `tuoi_tho`, `ma_loai`, `status`) 
VALUES ( '2022-10-28 00:00:00', 'Logitech Z600', '26', '4', FALSE);
INSERT INTO thiet_bi_may (ngay_cai_dat, ten_thiet_bi, tuoi_tho, ma_loai, `status`)
VALUES ( '2021-10-28', 'Logitech K780', 28, 1, TRUE);
INSERT INTO thiet_bi_may ( ngay_cai_dat, ten_thiet_bi, tuoi_tho, ma_loai, `status`)
VALUES ( '2022-10-28','Dell Ultrasharp U2719D', 36, 2, TRUE);
INSERT INTO thiet_bi_may ( ngay_cai_dat, ten_thiet_bi, tuoi_tho, ma_loai, `status`)
VALUES ( '2021-10-28', 'Microsoft Ergonomic Mouse', 20, 3, TRUE);
INSERT INTO thiet_bi_may ( ngay_cai_dat, ten_thiet_bi, tuoi_tho, ma_loai, `status`)
VALUES ( '2021-12-10', 'Logitech Z623', 24, 4, TRUE);

-- Thêm 4 môn học
INSERT INTO mon_hoc (ngay_bat_dau, ngay_ket_thuc, ten_mon)
VALUES ('2023-10-01', '2023-11-30', 'Lập trình C++');
INSERT INTO mon_hoc (ngay_bat_dau, ngay_ket_thuc, ten_mon)
VALUES ('2023-10-15', '2023-12-15', 'Lập trình Python');
INSERT INTO mon_hoc (ngay_bat_dau, ngay_ket_thuc, ten_mon)
VALUES ('2023-11-01', '2024-01-31', 'Lập trình Java');
INSERT INTO mon_hoc (ngay_bat_dau, ngay_ket_thuc, ten_mon)
VALUES ('2023-11-15', '2024-02-28', 'Lập trình Web');
INSERT INTO monhoc_phanmem (ma_mon, ma_phanmem)
VALUES (1, 1);
INSERT INTO monhoc_phanmem (ma_mon, ma_phanmem)
VALUES (2, 2);
INSERT INTO monhoc_phanmem (ma_mon, ma_phanmem)
VALUES (3, 3);
INSERT INTO monhoc_phanmem (ma_mon, ma_phanmem)
VALUES (4, 4);

-- lich truc
INSERT INTO `QuanLyPhongMay`.`lich_truc` (`ma_lich`, `ngay_truc`, `thoi_gian_bat_dau`, `thoi_gian_ket_thuc`, `ma_nv`, `ma_tang`) 
VALUES ('1', '2023-10-31 00:00:00.000000', '6', '14', 'NV003', '3');


INSERT INTO `QuanLyPhongMay`.`lich_truc` (`ma_lich`, `ngay_truc`, `thoi_gian_bat_dau`, `thoi_gian_ket_thuc`, `ma_nv`, `ma_tang`) 
VALUES (2, '2023-10-31 00:00:00.000000', '14', '22', 'NV004', 3);
INSERT INTO `QuanLyPhongMay`.`lich_truc` (`ma_lich`, `ngay_truc`, `thoi_gian_bat_dau`, `thoi_gian_ket_thuc`, `ma_nv`, `ma_tang`) 
VALUES (3, '2023-10-31 00:00:00.000000', '6h', '14h', 'NV005', 3);

