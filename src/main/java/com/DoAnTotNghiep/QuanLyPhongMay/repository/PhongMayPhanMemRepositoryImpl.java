package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Override
	@Transactional
	public List<PhongMayPhanMem> layDSPMPMTheoMa(Long maPhong) {
		Query query = entityManager.createQuery("FROM phongmay_phanmem WHERE ma_phong = :maPhong");
		query.setParameter("maPhong", maPhong);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void xoa(Long maPhong, Long maPhanMem) {
		Query query = entityManager.createNativeQuery("delete from phongmay_phanmem where ma_phong = " + maPhong + " and ma_phanmem = " + maPhanMem + "");
    	query.executeUpdate();
	}

	@Override
	@Transactional
	public PhongMayPhanMem luu(PhongMayPhanMem phongMayPhanMem) {
		return entityManager.merge(phongMayPhanMem);
	}

	@Override
	@Transactional
	public List<PhongMayPhanMem> layDSPMPM(Long maPhong) {
		Query query = entityManager.createNativeQuery("SELECT * FROM phongmay_phanmem WHERE ma_phong = " + maPhong, PhongMayPhanMem.class);
		return query.getResultList();
	}
	@Override
	@Transactional
	public List<PhongMayPhanMem> layDanhSachPhongMayPhanMem() {
	    Query query = entityManager.createQuery("SELECT pmpm FROM PhongMayPhanMem pmpm");
	    return query.getResultList();
	}

	@Override
	@Transactional
	public List<PhongMayPhanMem> layDSPMPMTheoMaPhanMem(Long maPhanMem) {
		Query query = entityManager.createNativeQuery("SELECT * FROM phongmay_phanmem WHERE ma_phanmem = " + maPhanMem, PhongMayPhanMem.class);
		return query.getResultList();
	}

}
