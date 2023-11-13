package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;

public interface PhongMayPhanMemService {
	public List<PhongMayPhanMem> layDSMHPMTheoMa(Long maPhong);

	public void xoa(Long maPhong, Long maPhanMem);

	public PhongMayPhanMem luu(PhongMayPhanMem phongMayPhanMem);
	
	public List<PhongMayPhanMem> layDanhSachPhongMayPhanMem();

	public List<PhongMayPhanMem> layDSPMPM(Long maPhong);
}
