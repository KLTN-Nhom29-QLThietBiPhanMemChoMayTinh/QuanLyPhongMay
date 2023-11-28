package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LoaiThietBi;
@Repository
public interface LoaiThietBiRepository extends JpaRepository<LoaiThietBi, Long>{

}
