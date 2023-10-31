package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.NhanVien;

public interface NhanVienService {
	public NhanVien layNVTheoMa(String maNV);

	public List<NhanVien> layDSNV();

	public void xoa(String maNV);

	public NhanVien luu(NhanVien nhanVien);
}
