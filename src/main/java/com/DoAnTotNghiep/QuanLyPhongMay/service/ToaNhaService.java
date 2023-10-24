package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ToaNha;

public interface ToaNhaService {
	public ToaNha layToaNhaTheoMa(Long maToaNha);

	public List<ToaNha> layDSToaNha();

	public void xoa(Long maToaNha);

	public ToaNha luu(ToaNha toaNha);
}
