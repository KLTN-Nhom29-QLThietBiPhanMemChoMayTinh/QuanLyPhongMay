package com.DoAnTotNghiep.QuanLyPhongMay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.UserRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.service.UserService;

@RestController
@CrossOrigin
public class AuthController {

	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/tai_khoan")
	public TaiKhoan register(@RequestBody TaiKhoan taiKhoan) {
		if (taiKhoan.getMatKhau() != null)
			taiKhoan.setMatKhau(new BCryptPasswordEncoder().encode(taiKhoan.getMatKhau()));
		return userService.createUser(taiKhoan);
	}

	@PutMapping("/tai_khoan")
	public ResponseEntity<?> updateTaiKhoan(@RequestBody TaiKhoan taiKhoan) {
		System.out.println(taiKhoan);
		
		return ResponseEntity.ok(taiKhoan);
		
	}

	@PostMapping("/DangNhap")
	public ResponseEntity<?> login(@RequestBody TaiKhoan taiKhoan) {
		System.out.println(taiKhoan);
		TaiKhoan taiKhoan2 = null;
		
		try {
			
			taiKhoan2 = userService.findByTenDangNhap(taiKhoan.getTenDangNhap());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Đăng nhập không thành công. Sai thông tin <Tài khoản.>");
		}

		System.out.println(taiKhoan2);
		System.out.println(new BCryptPasswordEncoder().matches(taiKhoan.getMatKhau(), taiKhoan2.getMatKhau()));
		if (taiKhoan2 == null || !new BCryptPasswordEncoder().matches(taiKhoan.getMatKhau(), taiKhoan2.getMatKhau())) {
//			return new ResponseEntity<>("Khong tim thay - "+ taiKhoan, HttpStatus.NOT_FOUND);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Đăng nhập không thành công. Sai thông tin");
		}
		
		return ResponseEntity.ok(taiKhoan2);
	}

	@GetMapping("/tai_khoan/{tenDangNhap}")
	public TaiKhoan layTKTheo(@PathVariable String tenDangNhap) {
		return userService.findByTenDangNhap(tenDangNhap);
	}
	
	@GetMapping("/DSTaiKhoan")
	public List<TaiKhoan> DsTaiKhoan() {
		return userRepository.findAll();
	}
	
}
