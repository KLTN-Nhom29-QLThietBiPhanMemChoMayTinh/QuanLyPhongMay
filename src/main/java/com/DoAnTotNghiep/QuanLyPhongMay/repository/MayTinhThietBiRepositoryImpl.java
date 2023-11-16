package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;

@Repository
public class MayTinhThietBiRepositoryImpl implements MayTinhThietBiRepository{

	private EntityManager entityManager;
	
	
	public MayTinhThietBiRepositoryImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<MayTinhThietBi> layDSMTTBheoMa(Long maMay) {
		Query query = entityManager.createQuery("FROM maytinh_thietbi WHERE ma_may = :maMay");
		query.setParameter("maMay", maMay);
		return query.getResultList();
	}

	@Override
	public void xoa(Long maMay, Long maThietBi) {
		Query query = entityManager.createNativeQuery("delete from maytinh_thietbi where ma_may = " + maMay + " and ma_thiet_bi = '" + maThietBi + "'");
    	query.executeUpdate();
	}

	@Override
	public MayTinhThietBi luu(MayTinhThietBi mayTinhThietBi) {
		return entityManager.merge(mayTinhThietBi);
	}

	@Override
	public List<MayTinhThietBi> layDSMTTB(Long maMay) {
		Query query = entityManager.createNativeQuery("SELECT * FROM maytinh_thietbi WHERE ma_may = " + maMay, MayTinhThietBi.class);
		return query.getResultList();
	}
	@Override
	public List<MayTinhThietBi> layDanhSachMayTinhThietBi() {
	    Query query = entityManager.createQuery("SELECT mttb FROM MayTinhThietBi mttb");
	    return query.getResultList();
	}

}
