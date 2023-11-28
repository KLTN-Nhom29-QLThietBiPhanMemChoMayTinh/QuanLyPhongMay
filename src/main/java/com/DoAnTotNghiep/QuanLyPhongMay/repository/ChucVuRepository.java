package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ChucVu;
@Repository
public interface ChucVuRepository extends JpaRepository<ChucVu, Long>{
    
}
