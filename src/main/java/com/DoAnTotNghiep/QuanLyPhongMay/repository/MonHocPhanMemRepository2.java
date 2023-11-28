package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMemPK;

@Repository
public interface MonHocPhanMemRepository2 extends JpaRepository<MonHocPhanMem, MonHocPhanMemPK>{
	
}

