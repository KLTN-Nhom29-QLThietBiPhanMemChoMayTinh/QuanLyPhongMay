package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhanMem;

public interface PhanMemService {
	public PhanMem layPhanMemTheoMa(Long maPhanMem);

	public List<PhanMem> layDSPhanMem();

	public void xoa(Long maPhanMem);

	public PhanMem luu(PhanMem phanMem);

}
