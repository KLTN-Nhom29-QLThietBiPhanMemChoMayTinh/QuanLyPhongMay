package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;


public interface TangRepository extends JpaRepository<Tang, Long>{

	List<Tang> findByToaNha_MaToaNha(Long maToaNha);

	Long countByToaNha_MaToaNha(Long maToaNha);

}
