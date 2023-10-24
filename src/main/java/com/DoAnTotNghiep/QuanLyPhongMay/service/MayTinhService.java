package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;

public interface MayTinhService {
	public MayTinh layMayTinhTheoMa(Long maMay);

	public List<MayTinh> layDSMayTinh();

	public void xoa(Long maMay);

	public MayTinh luu(MayTinh mayTinh);
}
