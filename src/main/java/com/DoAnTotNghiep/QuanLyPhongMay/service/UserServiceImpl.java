package com.DoAnTotNghiep.QuanLyPhongMay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private  UserRepository userRepository;

	@Override
	public TaiKhoan createUser(TaiKhoan nguoiDung) {
		return userRepository.save(nguoiDung);
	}

	@Override
	public TaiKhoan findByTenDangNhap(String tenDangNhap) {
		return userRepository.findByTenDangNhap(tenDangNhap);

	}

}