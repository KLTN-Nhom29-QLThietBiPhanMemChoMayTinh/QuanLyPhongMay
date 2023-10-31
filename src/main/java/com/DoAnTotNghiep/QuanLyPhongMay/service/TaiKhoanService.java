package com.DoAnTotNghiep.QuanLyPhongMay.service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;

public interface TaiKhoanService {
	public void xoa(String maTK);
	public TaiKhoan luu(TaiKhoan taiKhoan);
}
