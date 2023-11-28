package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;
@Repository
public interface MayTinhRepository extends JpaRepository<MayTinh, Long>{

}
