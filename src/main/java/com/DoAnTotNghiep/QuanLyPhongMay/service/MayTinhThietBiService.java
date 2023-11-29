package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBi;

public interface MayTinhThietBiService {
	public List<MayTinhThietBi> layDSMTTBTheoMa(Long maMay);

	public void xoa(Long maMay, Long maThietBi);

	public MayTinhThietBi luu(MayTinhThietBi mayTinhThietBi);
	public void xoaTheoMaMay(Long maMay);
	public List<MayTinhThietBi> findByStatus(boolean status);
	public List<MayTinhThietBi> layDanhSachMayTinhThietBi();
	public List<MayTinhThietBi> layDSMTTBTheoMaThietBi(Long maThietBi);
	public List<MayTinhThietBi> layDSMTTB(Long maMay);
	public MayTinhThietBi updateMayTinhThietBi(MayTinhThietBi mayTinhThietBi);
}
