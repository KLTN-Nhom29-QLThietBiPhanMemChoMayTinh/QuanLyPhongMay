package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;

@Repository
public interface TangRepository extends JpaRepository<Tang, Long>{

	public List<Tang> findByToaNha_MaToaNha(Long maToaNha);

	public	Long countByToaNha_MaToaNha(Long maToaNha);

}
