package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.NhanVien;
@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String>{

}
