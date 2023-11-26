package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;

public interface LichTrucService {
	 	public LichTruc layLTTheoMa(Long maLich);

		public List<LichTruc> layDSLT();

		public void xoa(Long maLich);

		public LichTruc luu(LichTruc lichTruc);
		
		public   List<Tang> layTangChuaCoNhanVienTrucTrongThang();
		public LichTruc updateLichTruc(LichTruc lichTruc);
		public List<LichTruc> layLichTrucTheoMaTang(Long maTang); 
}
