package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChu;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.CaThucHanhRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.GhiChuRepository;
@Service
public class GhiChuServiceImpl implements GhiChuService{
	@Autowired
	private  GhiChuRepository ghiChuRepository ;
	
	@Override
	public GhiChu layGhiChuTheoMa(Long maGhiChu) {
		GhiChu ghiChu = null;
		Optional<GhiChu> kq = ghiChuRepository.findById(maGhiChu);
		try {
			ghiChu = kq.get();
			return ghiChu;
		} catch (Exception e) {
			return ghiChu;
		}
	}

	@Override
	public void xoa(Long maGhiChu) {
		ghiChuRepository.deleteById(maGhiChu);
		
	}
	
	@Override
	public GhiChu luu(GhiChu ghiChu) {
		return ghiChuRepository.save(ghiChu);
	}
	
	@Override
	public List<GhiChu> layDSGhiChu() {
		return ghiChuRepository.findAll();
	}
	@Override
	public GhiChu capNhat(GhiChu ghiChu) {
		 return ghiChuRepository.save(ghiChu);
	}
	@Override
	public List<GhiChu> layDSGhiChuTheoNgaySua(Date ngaySua) {
		return ghiChuRepository.findByNgaySua(ngaySua);
	}
	@Override
	public List<GhiChu> layDSGhiChuTheoNgayBaoLoi(Date ngayBaoLoi) {
		return ghiChuRepository.findByNgayBaoLoi(ngayBaoLoi);
	}
	@Override
	public List<GhiChu> layDSGhiChuTheoPhongMay(Long maPhong) {
		return ghiChuRepository.findByPhongMay_MaPhong(maPhong);
	}
	 @Override
	    public GhiChu layGhiChuGanNhatTheoPhongMay(Long maPhong) {
	        List<GhiChu> dsGhiChu = ghiChuRepository.findByPhongMay_MaPhongOrderByNgayBaoLoiDesc(maPhong);
	        return dsGhiChu.isEmpty() ? null : dsGhiChu.get(0);
	    }
}
