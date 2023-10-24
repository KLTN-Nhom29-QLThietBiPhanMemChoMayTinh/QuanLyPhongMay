package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhanMem;

@Repository
public interface PhongMayPhanMemRepository {
	public List<PhongMayPhanMem> layDSMHPMTheoMa(Long maPhong);

	public void xoa(Long maPhong, Long maPhanMem);

	public PhongMayPhanMem luu(PhongMayPhanMem phongMayPhanMem);
	
	public List<PhongMayPhanMem> layDSMHPM(Long maPhong);
}
