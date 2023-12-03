package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChu;
@Repository
public interface GhiChuRepository extends JpaRepository<GhiChu, Long>{
	public List<GhiChu> findByNgayBaoLoi( @Temporal(TemporalType.DATE) Date ngayBaoLoi);
	public List<GhiChu> findByNgaySua( @Temporal(TemporalType.DATE) Date ngaySua);
	public List<GhiChu> findByPhongMay_MaPhong(Long maPhong);
	public List<GhiChu> findByPhongMay_MaPhongOrderByNgayBaoLoiDesc(Long maPhong);
}
