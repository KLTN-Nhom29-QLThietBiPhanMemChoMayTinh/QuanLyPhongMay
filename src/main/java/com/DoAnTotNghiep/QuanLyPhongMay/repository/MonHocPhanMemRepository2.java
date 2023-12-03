package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMemPK;

@Repository
public interface MonHocPhanMemRepository2 extends JpaRepository<MonHocPhanMem, MonHocPhanMemPK>{
	@Modifying
	@Transactional
	@Query("DELETE FROM MonHocPhanMem mhpm WHERE mhpm.phanMem.maPhanMem = :maPhanMem")
	public void XoaTheoMaPhanMem(@Param("maPhanMem") Long maPhanMem);
	@Modifying
	@Transactional
	@Query("DELETE FROM MonHocPhanMem mhpm WHERE mhpm.monHoc.maMon = :maMon")
	public void XoaTheoMaMon(@Param("maMon") Long maMon);
	
}

