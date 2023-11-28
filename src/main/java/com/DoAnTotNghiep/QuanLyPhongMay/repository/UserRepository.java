package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.TaiKhoan;
@Repository
public interface UserRepository extends JpaRepository<TaiKhoan, String> {

	TaiKhoan findByTenDangNhap(String tenDangNhap);
}