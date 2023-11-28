package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.GiaoVien;
@Repository
public interface GiaoVienRepository extends JpaRepository<GiaoVien, String>{

}
