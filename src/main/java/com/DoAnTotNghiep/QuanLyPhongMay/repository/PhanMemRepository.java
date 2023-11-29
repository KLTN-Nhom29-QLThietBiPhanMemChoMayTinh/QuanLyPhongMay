package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhanMem;
@Repository
public interface PhanMemRepository extends JpaRepository<PhanMem, Long>{
	public List<PhanMem> findByTrangThai(boolean trangThai);
}
