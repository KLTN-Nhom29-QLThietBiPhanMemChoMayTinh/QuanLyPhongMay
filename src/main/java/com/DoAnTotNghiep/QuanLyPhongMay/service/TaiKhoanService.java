package com.DoAnTotNghiep.QuanLyPhongMay.service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;

public interface TaiKhoanService {
	public void xoa(Long maTK);
	public TaiKhoan luu(TaiKhoan taiKhoan);
}
