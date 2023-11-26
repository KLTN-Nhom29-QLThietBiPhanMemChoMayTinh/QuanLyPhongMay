package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.GiaoVien;

public interface GiaoVienService {

	public GiaoVien layGVTheoMa(String maGiaoVien);

	public List<GiaoVien> layDSGV();

	public void xoa(String maGiaoVien);
	
	public GiaoVien capNhat(GiaoVien giaoVien);
	
	public GiaoVien luu(GiaoVien giaoVien);
}
