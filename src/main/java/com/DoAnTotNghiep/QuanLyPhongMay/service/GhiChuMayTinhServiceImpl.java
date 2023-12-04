package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChuPhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChuMayTinh;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.CaThucHanhRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.GhiChuMayTinhRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.GhiChuPhongMayRepository;
@Service
public class GhiChuMayTinhServiceImpl implements GhiChuMayTinhService{
	@Autowired
	private  GhiChuMayTinhRepository ghiChuMayTinhRepository ;
	
	@Override
	public GhiChuMayTinh layGhiChuTheoMa(Long maGhiChuMT) {
		GhiChuMayTinh ghiChuMayTinh = null;
		Optional<GhiChuMayTinh> kq = ghiChuMayTinhRepository.findById(maGhiChuMT);
		try {
			ghiChuMayTinh = kq.get();
			return ghiChuMayTinh;
		} catch (Exception e) {
			return ghiChuMayTinh;
		}
	}

	@Override
	@Transactional
	public void xoa(Long maGhiChuMT) {
		ghiChuMayTinhRepository.deleteById(maGhiChuMT);
		
	}
	@Override
	@Transactional
    public void xoaTheoMaMay(Long maMay) {
        List<GhiChuMayTinh> dsGhiChuMayTinh = ghiChuMayTinhRepository.findByMayTinh_MaMay(maMay);
        for (GhiChuMayTinh ghiChuMayTinh : dsGhiChuMayTinh) {
            ghiChuMayTinhRepository.delete(ghiChuMayTinh);
        }
    }

	@Override
	public GhiChuMayTinh luu(GhiChuMayTinh ghiChuMayTinh) {
		return ghiChuMayTinhRepository.save(ghiChuMayTinh);
	}
	
	@Override
	public List<GhiChuMayTinh> layDSGhiChu() {
		return ghiChuMayTinhRepository.findAll();
	}
	@Override
	public GhiChuMayTinh capNhat(GhiChuMayTinh ghiChuMayTinh) {
		 return ghiChuMayTinhRepository.save(ghiChuMayTinh);
	}
	@Override
	public List<GhiChuMayTinh> layDSGhiChuTheoNgaySua(Date ngaySua) {
		return ghiChuMayTinhRepository.findByNgaySua(ngaySua);
	}
	@Override
	public List<GhiChuMayTinh> layDSGhiChuTheoNgayBaoLoi(Date ngayBaoLoi) {
		return ghiChuMayTinhRepository.findByNgayBaoLoi(ngayBaoLoi);
	}
	@Override
	public List<GhiChuMayTinh> layDSGhiChuTheoMayTinh(Long maMay){
		return ghiChuMayTinhRepository.findByMayTinh_MaMay(maMay);
	}
	 @Override
		public GhiChuMayTinh layGhiChuGanNhatTheoMayTinh(Long maMay) {
	        List<GhiChuMayTinh> dsGhiChuMayTinh = ghiChuMayTinhRepository.findByMayTinh_MaMayOrderByNgayBaoLoiDesc(maMay);
	        return dsGhiChuMayTinh.isEmpty() ? null : dsGhiChuMayTinh.get(0);
	    }
}
