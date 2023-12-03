package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.Date;
import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChu;

public interface GhiChuService {
	public GhiChu layGhiChuTheoMa(Long maGhiChu);

	public List<GhiChu> layDSGhiChu();
	public void xoa(Long maGhiChu);
	public GhiChu capNhat(GhiChu ghiChu);
	public GhiChu luu(GhiChu ghiChu);
	public List<GhiChu> layDSGhiChuTheoNgaySua(Date ngaySua);
	public List<GhiChu> layDSGhiChuTheoNgayBaoLoi(Date ngayBaoLoi);
	public List<GhiChu> layDSGhiChuTheoPhongMay(Long maPhong);
	public GhiChu layGhiChuGanNhatTheoPhongMay(Long maPhong);
}
