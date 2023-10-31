package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.GiaoVien;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.GiaoVienRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.UserRepository;

@Service
public class GiaoVienServiceImpl implements GiaoVienService{

	@Autowired
	private GiaoVienRepository giaoVienRepository;

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public GiaoVien layGVTheoMa(String maGiaoVien) {
		GiaoVien giaoVien = null;
		Optional<GiaoVien> kq = giaoVienRepository.findById(maGiaoVien);
		try {
			giaoVien = kq.get();
			return giaoVien;
		} catch (Exception e) {
			return giaoVien;
		}
	}

	@Override
	public List<GiaoVien> layDSGV() {
		return giaoVienRepository.findAll();
	}


	@Transactional
	public void xoa(String maGiaoVien) {
		Optional<TaiKhoan> kq = userRepository.findById(maGiaoVien);			
		TaiKhoan taiKhoan = kq.get();
		userRepository.deleteById(taiKhoan.getMaTK());
	}

	@Override
	public GiaoVien luu(GiaoVien giaoVien) {
		if(giaoVien.getTaiKhoan() != null) {
			Optional<TaiKhoan> kq = userRepository.findById(giaoVien.getTaiKhoan().getMaTK());			
			TaiKhoan tk = kq.get();
			giaoVien.setTaiKhoan(tk);
		}
		return giaoVienRepository.save(giaoVien);
	}

}
