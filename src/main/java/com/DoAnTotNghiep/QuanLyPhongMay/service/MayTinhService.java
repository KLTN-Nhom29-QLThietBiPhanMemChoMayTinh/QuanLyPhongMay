package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;

public interface MayTinhService {
	public MayTinh layMayTinhTheoMa(Long maMay);

	public List<MayTinh> layDSMayTinh();
	public List<MayTinh> findByTrangThai(String trangThai);
	public void xoa(Long maMay);
	  public List<MayTinh> layDSMayTinhTheoMaPhong(Long maPhong);
	public MayTinh luu(MayTinh mayTinh);
}
