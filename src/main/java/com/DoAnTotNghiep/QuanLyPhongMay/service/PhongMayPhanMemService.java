package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;

public interface PhongMayPhanMemService {
	public List<PhongMayPhanMem> layDSPMPMTheoMa(Long maPhong);
	 public List<PhongMayPhanMem> findByStatus(boolean status);
	public List<PhongMayPhanMem> layDSPMPMTheoMaPhanMem(Long maPhanMem);
	
	public void xoa(Long maPhong, Long maPhanMem);

	public PhongMayPhanMem luu(PhongMayPhanMem phongMayPhanMem);
	
	public List<PhongMayPhanMem> layDanhSachPhongMayPhanMem();

	public List<PhongMayPhanMem> layDSPMPM(Long maPhong);
	public void XoaTheoMaPhanMem(Long maPhanMem);
}
