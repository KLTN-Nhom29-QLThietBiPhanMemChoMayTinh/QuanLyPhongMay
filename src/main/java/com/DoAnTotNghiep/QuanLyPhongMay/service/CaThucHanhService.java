package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;

public interface CaThucHanhService {
	public CaThucHanh layCaThucHanhTheoMa(Long maCaThucHanh);

	public List<CaThucHanh> layDSCaThucHanh();

	public void xoa(Long maCaThucHanh);

	public CaThucHanh luu(CaThucHanh caThucHanh);
}
