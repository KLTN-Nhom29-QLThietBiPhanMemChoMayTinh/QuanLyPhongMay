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
	public NhanVien layNVTheoMa(Long maNV) {
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
	public void xoa(Long maNV) {
	    Optional<NhanVien> nhanVienOptional = nhanVienRepository.findById(maNV);
	    if (nhanVienOptional.isPresent()) {
	        NhanVien nhanVien = nhanVienOptional.get();
	        TaiKhoan taiKhoan = nhanVien.getTaiKhoan();  
	        nhanVienRepository.delete(nhanVien);
	        userRepository.delete(taiKhoan);
	    }
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
