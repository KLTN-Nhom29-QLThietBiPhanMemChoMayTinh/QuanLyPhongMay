package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBiPK;

@Repository
public interface MayTinhThietBiRepository2 extends JpaRepository<MayTinhThietBi, MayTinhThietBiPK>{

}
