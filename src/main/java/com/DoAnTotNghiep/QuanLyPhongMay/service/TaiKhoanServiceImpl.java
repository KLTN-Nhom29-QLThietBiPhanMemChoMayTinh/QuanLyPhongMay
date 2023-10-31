package com.DoAnTotNghiep.QuanLyPhongMay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.TaiKhoanRepository;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService{
	
	@Autowired
	private TaiKhoanRepository taiKhoanRepository;

	@Override
	public void xoa(String maTK) {
		taiKhoanRepository.deleteById(maTK);
	}

	@Override
	public TaiKhoan luu(TaiKhoan taiKhoan) {
		return taiKhoanRepository.save(taiKhoan);
	}

}
