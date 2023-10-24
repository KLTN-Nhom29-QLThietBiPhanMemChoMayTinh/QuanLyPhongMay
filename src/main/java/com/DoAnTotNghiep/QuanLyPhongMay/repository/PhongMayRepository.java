package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;

public interface PhongMayRepository extends JpaRepository<PhongMay, Long>, PhongMayRepositoryCus{
	
}
