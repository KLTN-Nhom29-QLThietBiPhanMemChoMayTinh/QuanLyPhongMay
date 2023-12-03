package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMem;

public interface MonHocPhanMemService {

	public List<MonHocPhanMem> layDSMHPMTheoMa(Long maMon);

	public void xoa(Long maMon, Long maPhanMem);

	public MonHocPhanMem luu(MonHocPhanMem monHocPhanMem);
	
	public List<MonHocPhanMem> layDSMHPM(Long maMon);

	public List<MonHocPhanMem> layDanhSachMonHocPhanMem();
	
	public void xoaTheoMaPhanMem(Long maPhanMem);
	
	public void xoaTheoMaMon(Long maMon);
}
