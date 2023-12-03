package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
@Repository
public interface PhongMayRepository extends JpaRepository<PhongMay, Long>{
	public List<PhongMay> findByTrangThai(String trangThai);

	public List<PhongMay> findByTang_MaTang(Long maTang);
}
