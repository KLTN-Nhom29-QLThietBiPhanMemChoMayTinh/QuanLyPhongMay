package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ThietBiMay;
@Repository
public interface ThietBiMayRepository extends JpaRepository<ThietBiMay, Long>{
	public List<ThietBiMay> findByStatus(boolean status);
}
