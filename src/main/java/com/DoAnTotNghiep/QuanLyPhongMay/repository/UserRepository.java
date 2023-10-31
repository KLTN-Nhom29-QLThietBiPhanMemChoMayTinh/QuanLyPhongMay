package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;

public interface UserRepository extends JpaRepository<TaiKhoan, String> {

	TaiKhoan findByTenDangNhap(String tenDangNhap);
}