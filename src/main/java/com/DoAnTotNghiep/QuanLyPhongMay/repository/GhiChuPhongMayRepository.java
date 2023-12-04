package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChuPhongMay;
@Repository
public interface GhiChuPhongMayRepository extends JpaRepository<GhiChuPhongMay, Long>{
	public List<GhiChuPhongMay> findByNgayBaoLoi( @Temporal(TemporalType.DATE) Date ngayBaoLoi);
	public List<GhiChuPhongMay> findByNgaySua( @Temporal(TemporalType.DATE) Date ngaySua);
	public List<GhiChuPhongMay> findByPhongMay_MaPhong(Long maPhong);
	public List<GhiChuPhongMay> findByPhongMay_MaPhongOrderByNgayBaoLoiDesc(Long maPhong);

}
