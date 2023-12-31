package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.CaThucHanhRepository;
@Service
public class CaThucHanhServiceImpl implements CaThucHanhService{
	@Autowired
	private  CaThucHanhRepository caThucHanhRepository;
	
	@Override
	public CaThucHanh layCaThucHanhTheoMa(Long maCaThucHanh) {
		CaThucHanh caThucHanh = null;
		Optional<CaThucHanh> kq = caThucHanhRepository.findById(maCaThucHanh);
		try {
			caThucHanh = kq.get();
			return caThucHanh;
		} catch (Exception e) {
			return caThucHanh;
		}
	}
	 @Override
	 public List<CaThucHanh> layDSCaThucHanhTheoNgay(Date ngayThucHanh) {
	        return caThucHanhRepository.findByNgayThucHanh(ngayThucHanh);
	}
	@Override
	public List<CaThucHanh> layDSCaThucHanh() {
		return caThucHanhRepository.findAll();
	}

	@Override
	public void xoa(Long maCaThucHanh) {
		caThucHanhRepository.deleteById(maCaThucHanh);
		
	}
	@Override
    public List<CaThucHanh> layDSCaThucHanhTheoMonHoc(Long maMon) {
        return caThucHanhRepository.findByMonHoc_MaMon(maMon);
    }
	 @Override
	    public CaThucHanh capNhat(CaThucHanh caThucHanh) {
	        return caThucHanhRepository.save(caThucHanh);
	    }
	@Override
	public CaThucHanh luu(CaThucHanh caThucHanh) {
		return caThucHanhRepository.save(caThucHanh);
	}
	@Override
	public List<CaThucHanh> layDSCaThucHanhTheoMaPhong(Long maPhong) {
		return caThucHanhRepository.findByPhongMay_MaPhong(maPhong);
	}

}
