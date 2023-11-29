package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;
@Repository
public interface MayTinhRepository extends JpaRepository<MayTinh, Long>{
	public  List<MayTinh> findByPhongMay_MaPhong(Long maPhong);
	public List<MayTinh> findByTrangThai(String trangThai);
}
