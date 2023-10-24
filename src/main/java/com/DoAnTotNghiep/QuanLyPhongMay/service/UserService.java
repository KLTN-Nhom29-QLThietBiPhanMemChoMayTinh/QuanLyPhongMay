package com.DoAnTotNghiep.QuanLyPhongMay.service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;

public interface UserService {
	TaiKhoan createUser(TaiKhoan nguoiDung);
    TaiKhoan findByTenDangNhap(String tenDangNhap);
}