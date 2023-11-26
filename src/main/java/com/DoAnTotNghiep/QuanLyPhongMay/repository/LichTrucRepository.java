package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;

public interface LichTrucRepository extends JpaRepository<LichTruc, Long> {
	List<LichTruc> findByTang_MaTang(Long maTang);

	@Query("SELECT DISTINCT lichTruc.tang FROM LichTruc lichTruc WHERE MONTH(lichTruc.ngayTruc) = MONTH(CURRENT_DATE) AND YEAR(lichTruc.ngayTruc) = YEAR(CURRENT_DATE)")
	List<Tang> findTangChuaCoNhanVienTrucTrongThang();

}
