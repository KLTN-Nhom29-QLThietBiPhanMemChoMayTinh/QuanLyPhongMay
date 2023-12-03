package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;

public interface TangService {
	public Tang layTangTheoMa(Long maTang);

	public List<Tang> layDSTang();

	public void xoa(Long maTang);

	public Tang luu(Tang tang);
	
	public List<Tang> layTangTheoToaNha(Long maToaNha); 
	
	public Long tinhSoLuongTangTheoMaToaNha(Long maToaNha);
	public List<PhongMay> layDSPhongMayTheoTang(Long maTang);
	public List<LichTruc> layDSLichTrucTheoTang(Long maTang);

}
