package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;

@Repository
public interface LichTrucRepository extends JpaRepository<LichTruc, Long>{
    public List<LichTruc> findByTang_MaTang(Long maTang);

    @Query("SELECT tang FROM Tang tang WHERE tang NOT IN " +
            "(SELECT DISTINCT lichTruc.tang FROM LichTruc lichTruc " +
            "WHERE MONTH(lichTruc.ngayTruc) = MONTH(CURRENT_DATE) AND YEAR(lichTruc.ngayTruc) = YEAR(CURRENT_DATE))")
    public List<Tang> findTangChuaCoNhanVienTrucTrongThang();

    public LichTruc save(LichTruc lichTruc);
}

