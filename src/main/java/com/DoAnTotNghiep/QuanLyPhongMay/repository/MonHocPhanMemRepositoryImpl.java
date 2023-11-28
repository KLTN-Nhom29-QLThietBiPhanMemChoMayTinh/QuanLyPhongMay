package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMem;

@Repository
public class MonHocPhanMemRepositoryImpl  implements MonHocPhanMemRepository{

	private EntityManager entityManager;
	
	public MonHocPhanMemRepositoryImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<MonHocPhanMem> layDSMHPMTheoMa(Long maMon) {
		Query query = entityManager.createQuery("from monhoc_phanmem where ma_mon=:maMon");
		query.setParameter("maMon", maMon);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void xoa(Long maMon, Long maPhanMem) {
		Query query = entityManager.createNativeQuery("delete from monhoc_phanmem where ma_mon = " + maMon + " and ma_phanmem = '" + maPhanMem + "'");
    	query.executeUpdate();
		
	}

	@Override
	@Transactional
	public MonHocPhanMem luu(MonHocPhanMem monHocPhanMem) {
		return entityManager.merge(monHocPhanMem);
	}

	@Override
	@Transactional
	public List<MonHocPhanMem> layDSMHPM(Long maMon) {
		Query query = entityManager.createNativeQuery("SELECT * FROM monhoc_phanmem  WHERE ma_mon = " + maMon, MonHocPhanMem.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public List<MonHocPhanMem> layDanhSachMonHocPhanMem() {
		Query query = entityManager.createQuery("SELECT mhpm FROM MonHocPhanMem mhpm");
	    return query.getResultList();
	}

}

