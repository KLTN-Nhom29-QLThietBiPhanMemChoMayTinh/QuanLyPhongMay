package com.DoAnTotNghiep.QuanLyPhongMay.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
@Repository
@SuppressWarnings("unchecked")
public class PhongMayRepositoryCusImpl implements PhongMayRepositoryCus{

	private EntityManager entityManager;
	
	@Autowired
	public PhongMayRepositoryCusImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void capNhatTrangThai(String maPhong, String trangThai) {
		Query query = entityManager.createQuery("UPDATE phong_may SET trang_thai =:trangThai WHERE ma_phong=:maPhong");
		query.setParameter("maPhong", maPhong);
		query.setParameter("trangThai", trangThai);
		query.executeUpdate();
	}

	@Override
	@Transactional
	public List<PhongMay> timPhongTheoSoMay(int soMay) {
		Query query = entityManager.createNativeQuery("select * from phong_may where so_may = " + soMay + " and trang_thai_phong like N'Trống'", PhongMay.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public List<PhongMay> layDSPTheoTrangThai(String trangThai) {
		Query query = entityManager.createNativeQuery("SELECT * FROM phong_may where trang_thai like N'" + trangThai + "'",
				PhongMay.class);
		return query.getResultList();
	}

	@Override
	public List<PhongMay> timPhongTrongTheoNgay(String ngayThucHanh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhongMay> timPhongTrongTheoPhanMem(String maPhanMem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> timMaPhongTheoTrangThai(String maPhong, String trangThai) {
		// TODO Auto-generated method stub
		return null;
	}

}
