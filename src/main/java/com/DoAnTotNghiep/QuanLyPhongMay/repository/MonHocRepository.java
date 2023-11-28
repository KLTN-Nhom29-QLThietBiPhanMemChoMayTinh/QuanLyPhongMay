package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHoc;
@Repository
public interface MonHocRepository extends JpaRepository<MonHoc, Long>{

}
