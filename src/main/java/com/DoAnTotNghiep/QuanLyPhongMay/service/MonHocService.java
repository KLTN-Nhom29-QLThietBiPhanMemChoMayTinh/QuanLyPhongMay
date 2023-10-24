package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHoc;

public interface MonHocService {
	public MonHoc layMonHocTheoMa(Long maMon);

	public List<MonHoc> layDSMonHoc();

	public void xoa(Long maMon);

	public MonHoc luu(MonHoc monHoc);
}
