package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBiPK;

@Repository
public interface MayTinhThietBiRepository2 extends JpaRepository<MayTinhThietBi, MayTinhThietBiPK>{
	@Modifying
	@Transactional
	@Query("DELETE FROM MayTinhThietBi mttb WHERE mttb.mayTinh.maMay = :maMay")
	public void xoaTheoMaMay(@Param("maMay") Long maMay);
	
	public List<MayTinhThietBi> findByStatus(boolean status);
}
