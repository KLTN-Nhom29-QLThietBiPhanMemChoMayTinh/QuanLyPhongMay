package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;

public interface PhongMayService {
	public PhongMay layPhongMayTheoMa(Long maPhong);

	public List<PhongMay> layDSPhongMay();

	public void xoa(Long maPhong);

	public PhongMay luu(PhongMay phongMay);

}
