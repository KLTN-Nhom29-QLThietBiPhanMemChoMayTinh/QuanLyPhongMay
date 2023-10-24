package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.Khoa;

public interface KhoaService {
	public Khoa layKhoaTheoMa(Long maKhoa);

	public List<Khoa> layDSKhoa();

	public void xoa(Long maKhoa);

	public Khoa luu(Khoa khoa);
}
