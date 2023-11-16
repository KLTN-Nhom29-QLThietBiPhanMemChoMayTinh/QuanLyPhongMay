package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;

@Repository
public interface MayTinhThietBiRepository {
	public List<MayTinhThietBi> layDSMTTBheoMa(Long maMay);

	public void xoa(Long maMay, Long maThietBi);

	public MayTinhThietBi luu(MayTinhThietBi mayTinhThietBi);
	
	public List<MayTinhThietBi> layDanhSachMayTinhThietBi();

	public List<MayTinhThietBi> layDSMTTB(Long maMay);
}
