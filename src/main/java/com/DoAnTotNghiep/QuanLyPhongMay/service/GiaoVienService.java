package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.GiaoVien;

public interface GiaoVienService {

	public GiaoVien layGVTheoMa(Long maGiaoVien);

	public List<GiaoVien> layDSGV();

	public void xoa(Long maGiaoVien);

	public GiaoVien luu(GiaoVien giaoVien);
}
