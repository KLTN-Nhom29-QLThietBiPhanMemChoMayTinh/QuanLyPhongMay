package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMemPK;

@Repository
public interface PhongMayPhanMemRepository2 extends JpaRepository<PhongMayPhanMem, PhongMayPhanMemPK> {
	public	List<PhongMayPhanMem> findByStatus(boolean status);
	@Modifying
	@Transactional
	@Query("DELETE FROM PhongMayPhanMem pmpm WHERE pmpm.phanMem.maPhanMem = :maPhanMem")
	public void XoaTheoMaPhanMem(@Param("maPhanMem") Long maPhanMem);
	
}
