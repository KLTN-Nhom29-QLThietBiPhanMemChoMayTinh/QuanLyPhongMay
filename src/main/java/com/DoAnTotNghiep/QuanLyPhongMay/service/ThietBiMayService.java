package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ThietBiMay;

public interface ThietBiMayService {
	public ThietBiMay layThietBiMayTheoMa(Long maThietBi);

	public List<ThietBiMay> layDSThietBiMay();

	public void xoa(Long maThietBi);

	public ThietBiMay luu(ThietBiMay thietBiMay);
}
