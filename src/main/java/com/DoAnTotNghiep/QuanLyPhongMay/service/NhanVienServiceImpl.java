package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.NhanVien;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.NhanVienRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.UserRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService {

	@Autowired
	private NhanVienRepository nhanVienRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public NhanVien layNVTheoMa(String maNV) {
		NhanVien nhanVien = null;
		Optional<NhanVien> kq = nhanVienRepository.findById(maNV);
		try {
			nhanVien = kq.get();
			return nhanVien;
		} catch (Exception e) {
			return nhanVien;
		}
	}

	@Override
	public List<NhanVien> layDSNV() {
		return nhanVienRepository.findAll();
	}

	@Transactional
	public void xoa(String maNV) {
		Optional<TaiKhoan> kq = userRepository.findById(maNV);			
		TaiKhoan taiKhoan = kq.get();
		userRepository.deleteById(taiKhoan.getMaTK());
	}


	@Override
	public NhanVien luu(NhanVien nhanVien) {
		if(nhanVien.getTaiKhoan() != null) {
			Optional<TaiKhoan> kq = userRepository.findById(nhanVien.getTaiKhoan().getMaTK());			
			TaiKhoan tk = kq.get();
			nhanVien.setTaiKhoan(tk);
		}
		return nhanVienRepository.save(nhanVien);
	}
}
