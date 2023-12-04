package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChuPhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.CaThucHanhRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.GhiChuPhongMayRepository;
@Service
public class GhiChuPhongMayServiceImpl implements GhiChuPhongMayService{
	@Autowired
	private  GhiChuPhongMayRepository ghiChuPhongMayRepository ;
	
	@Override
	public GhiChuPhongMay layGhiChuTheoMa(Long maGhiChu) {
		GhiChuPhongMay ghiChuPhongMay = null;
		Optional<GhiChuPhongMay> kq = ghiChuPhongMayRepository.findById(maGhiChu);
		try {
			ghiChuPhongMay = kq.get();
			return ghiChuPhongMay;
		} catch (Exception e) {
			return ghiChuPhongMay;
		}
	}
	
	@Override
	@Transactional
	public void xoa(Long maGhiChu) {
		ghiChuPhongMayRepository.deleteById(maGhiChu);
		
	}
	
	@Override
	public GhiChuPhongMay luu(GhiChuPhongMay ghiChuPhongMay) {
		return ghiChuPhongMayRepository.save(ghiChuPhongMay);
	}
	
	@Override
	public List<GhiChuPhongMay> layDSGhiChu() {
		return ghiChuPhongMayRepository.findAll();
	}
	@Override
	public GhiChuPhongMay capNhat(GhiChuPhongMay ghiChuPhongMay) {
		 return ghiChuPhongMayRepository.save(ghiChuPhongMay);
	}
	@Override
	public List<GhiChuPhongMay> layDSGhiChuTheoNgaySua(Date ngaySua) {
		return ghiChuPhongMayRepository.findByNgaySua(ngaySua);
	}
	@Override
	public List<GhiChuPhongMay> layDSGhiChuTheoNgayBaoLoi(Date ngayBaoLoi) {
		return ghiChuPhongMayRepository.findByNgayBaoLoi(ngayBaoLoi);
	}
	@Override
	public List<GhiChuPhongMay> layDSGhiChuTheoPhongMay(Long maPhong) {
		return ghiChuPhongMayRepository.findByPhongMay_MaPhong(maPhong);
	}
	 @Override
	    public GhiChuPhongMay layGhiChuGanNhatTheoPhongMay(Long maPhong) {
	        List<GhiChuPhongMay> dsGhiChu = ghiChuPhongMayRepository.findByPhongMay_MaPhongOrderByNgayBaoLoiDesc(maPhong);
	        return dsGhiChu.isEmpty() ? null : dsGhiChu.get(0);
	    }
}
