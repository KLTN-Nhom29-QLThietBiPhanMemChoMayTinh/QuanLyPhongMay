package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;

public interface LichTrucService {
	 	public LichTruc layLTTheoMa(Long maLich);

		public List<LichTruc> layDSLT();

		public void xoa(Long maLich);

		public LichTruc luu(LichTruc lichTruc);

}
