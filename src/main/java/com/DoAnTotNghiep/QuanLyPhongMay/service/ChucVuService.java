package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ChucVu;

public interface ChucVuService {

    public ChucVu layCVTheoMa(Long maCV);

	public List<ChucVu> layDSCV();

	public void xoa(Long maCV);

	public ChucVu luu(ChucVu chucVu);
}
