package com.DoAnTotNghiep.QuanLyPhongMay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;
import com.DoAnTotNghiep.QuanLyPhongMay.service.UserService;

@RestController
@CrossOrigin
public class AuthController {

	@Autowired
	private UserService userService;

	@PostMapping("/tai_khoan")
	public TaiKhoan register(@RequestBody TaiKhoan taiKhoan) {
		if (taiKhoan.getMatKhau() != null)
			taiKhoan.setMatKhau(new BCryptPasswordEncoder().encode(taiKhoan.getMatKhau()));
		return userService.createUser(taiKhoan);
	}

	@PostMapping("/DangNhap")
	public TaiKhoan login(@RequestBody TaiKhoan taiKhoan) {

		TaiKhoan taiKhoan2 = userService.findByTenDangNhap(taiKhoan.getTenDangNhap());

		if (taiKhoan2 == null || !new BCryptPasswordEncoder().matches(taiKhoan.getMatKhau(), taiKhoan2.getMatKhau())) {

			return null;
		}

		return taiKhoan2;
	}

	@GetMapping("/tai_khoan/{tenDangNhap}")
	public TaiKhoan layTKTheo(@PathVariable String tenDangNhap) {
		return userService.findByTenDangNhap(tenDangNhap);
	}
}
