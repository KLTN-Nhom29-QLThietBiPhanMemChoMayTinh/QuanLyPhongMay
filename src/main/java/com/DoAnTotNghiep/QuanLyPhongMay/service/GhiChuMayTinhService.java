package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.Date;
import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChuPhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChuMayTinh;

public interface GhiChuMayTinhService {
	public GhiChuMayTinh layGhiChuTheoMa(Long maGhiChuMT);

	public List<GhiChuMayTinh> layDSGhiChu();
	public void xoa(Long maGhiChuMT);
	public GhiChuMayTinh capNhat(GhiChuMayTinh ghiChuMayTinh);
	public GhiChuMayTinh luu(GhiChuMayTinh ghiChuMayTinh);
	public List<GhiChuMayTinh> layDSGhiChuTheoNgaySua(Date ngaySua);
	public List<GhiChuMayTinh> layDSGhiChuTheoNgayBaoLoi(Date ngayBaoLoi);
	public List<GhiChuMayTinh> layDSGhiChuTheoMayTinh(Long maMay);
	public GhiChuMayTinh layGhiChuGanNhatTheoMayTinh(Long maMay);
	public void xoaTheoMaMay(Long maMay);
}
