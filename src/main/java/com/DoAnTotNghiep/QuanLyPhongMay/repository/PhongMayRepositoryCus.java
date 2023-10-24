package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;

@Repository
public interface PhongMayRepositoryCus {
	public void capNhatTrangThai(String maPhong, String trangThai);
	public List<PhongMay> timPhongTheoSoMay(int soMay);
	public List<PhongMay> layDSPTheoTrangThai(String trangThai);
	public List<PhongMay> timPhongTrongTheoNgay(String ngayThucHanh);
	public List<PhongMay> timPhongTrongTheoPhanMem(String maPhanMem);
	public List<Object> timMaPhongTheoTrangThai(String maPhong, String trangThai);	
}
