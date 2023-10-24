package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;

import java.util.Date;
import java.util.List;

@Repository
public interface CaThucHanhRepository extends JpaRepository<CaThucHanh, Long> {

    // Phương thức để lấy danh sách CaThucHanh theo ngày thực hành
    List<CaThucHanh> findByNgayThucHanh(Date ngayThucHanh);
}

