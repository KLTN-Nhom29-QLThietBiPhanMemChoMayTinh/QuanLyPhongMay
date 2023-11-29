package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;

@Repository
public interface CaThucHanhRepository extends JpaRepository<CaThucHanh, Long> {
	public List<CaThucHanh> findByNgayThucHanh( @Temporal(TemporalType.DATE) Date ngayThucHanh);
	public List<CaThucHanh> findByMonHoc_MaMon(Long maMon);
	public List<CaThucHanh> findByPhongMay_MaPhong(Long maPhong);
}

