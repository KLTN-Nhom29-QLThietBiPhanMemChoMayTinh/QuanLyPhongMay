package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;

@Repository
public interface MonHocPhanMemRepository{
	public List<MonHocPhanMem> layDSMHPMTheoMa(Long maMon);

	public void xoa(Long maMon, Long maPhanMem);

	public MonHocPhanMem luu(MonHocPhanMem monHocPhanMem);
	
	public List<MonHocPhanMem> layDanhSachMonHocPhanMem();
	
	public List<MonHocPhanMem> layDSMHPM(Long maMon);
}

