package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;

@Repository
public class PhongMayPhanMemRepositoryImpl implements PhongMayPhanMemRepository{

	private EntityManager entityManager;
	
	
	
	public PhongMayPhanMemRepositoryImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<PhongMayPhanMem> layDSMHPMTheoMa(Long maPhong) {
		Query query = entityManager.createQuery("from phongmay_phanmem where ma_phong=:maPhong");
		query.setParameter("ma_phong", maPhong);
		return query.getResultList();
	}

	@Override
	public void xoa(Long maPhong, Long maPhanMem) {
		Query query = entityManager.createNativeQuery("delete from phongmay_phanmem where ma_phong = " + maPhong + " and ma_phanmem = '" + maPhanMem + "'");
    	query.executeUpdate();
	}

	@Override
	public PhongMayPhanMem luu(PhongMayPhanMem phongMayPhanMem) {
		return entityManager.merge(phongMayPhanMem);
	}

	@Override
	public List<PhongMayPhanMem> layDSMHPM(Long maPhong) {
		Query query = entityManager.createNativeQuery("SELECT * FROM phongmay_phanmem WHERE ma_phong = " + maPhong, PhongMayPhanMem.class);
		return query.getResultList();
	}
    
}
