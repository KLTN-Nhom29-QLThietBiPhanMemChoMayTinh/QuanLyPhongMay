package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.Date;
import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChuPhongMay;

public interface GhiChuPhongMayService {
	public GhiChuPhongMay layGhiChuTheoMa(Long maGhiChu);

	public List<GhiChuPhongMay> layDSGhiChu();
	public void xoa(Long maGhiChu);
	public GhiChuPhongMay capNhat(GhiChuPhongMay ghiChuPhongMay);
	public GhiChuPhongMay luu(GhiChuPhongMay ghiChuPhongMay);
	public List<GhiChuPhongMay> layDSGhiChuTheoNgaySua(Date ngaySua);
	public List<GhiChuPhongMay> layDSGhiChuTheoNgayBaoLoi(Date ngayBaoLoi);
	public List<GhiChuPhongMay> layDSGhiChuTheoPhongMay(Long maPhong);
	public GhiChuPhongMay layGhiChuGanNhatTheoPhongMay(Long maPhong);
}
