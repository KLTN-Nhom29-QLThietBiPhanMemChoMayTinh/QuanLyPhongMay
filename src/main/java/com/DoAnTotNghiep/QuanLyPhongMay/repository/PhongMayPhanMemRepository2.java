package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMemPK;

@Repository
public interface PhongMayPhanMemRepository2 extends JpaRepository<PhongMayPhanMem, PhongMayPhanMemPK> {
	public	List<PhongMayPhanMem> findByStatus(boolean status);
}
