package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.Quyen;

public interface QuyenService {
	
	public Quyen layQuyenTheoMa(Long maQuyen);

	public List<Quyen> layDSQuyen();

	public void xoa(Long maQuyen);

	public Quyen luu(Quyen quyen);
}
