package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ThietBiMay;
@Repository
public interface ThietBiRepository extends JpaRepository<ThietBiMay, Long>{

}
