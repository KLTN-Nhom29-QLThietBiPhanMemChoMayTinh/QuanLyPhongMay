package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;

@Repository
public interface PhongMayPhanMemRepository {
	public List<PhongMayPhanMem> layDSPMPMTheoMa(Long maPhong);

	public void xoa(Long maPhong, Long maPhanMem);

	public PhongMayPhanMem luu(PhongMayPhanMem phongMayPhanMem);
	
	public List<PhongMayPhanMem> layDanhSachPhongMayPhanMem();

	public List<PhongMayPhanMem> layDSPMPMTheoMaPhanMem(Long maPhanMem);
	public List<PhongMayPhanMem> layDSPMPM(Long maPhong);
}
