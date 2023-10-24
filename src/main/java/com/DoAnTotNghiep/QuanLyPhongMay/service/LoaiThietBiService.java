package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LoaiThietBi;

public interface LoaiThietBiService {
	public LoaiThietBi layLoaiThietBiTheoMa(Long maLoai);

	public List<LoaiThietBi> layDSLoaiThietBi();

	public void xoa(Long maLoai);

	public LoaiThietBi luu(LoaiThietBi loaiThietBi);
}
