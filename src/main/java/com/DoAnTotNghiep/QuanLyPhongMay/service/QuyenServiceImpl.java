package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.Quyen;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.QuyenRepository;

@Service
public class QuyenServiceImpl implements QuyenService{

	@Autowired
	private  QuyenRepository quyenRepository;
	
	@Override
	public Quyen layQuyenTheoMa(Long maQuyen) {
		return null;
	}

	@Override
	public List<Quyen> layDSQuyen() {
		return quyenRepository.findAll();
	}

	@Override
	public void xoa(Long maQuyen) {
		quyenRepository.deleteById(maQuyen);
	}

	@Override
	public Quyen luu(Quyen quyen) {
		return quyenRepository.save(quyen);
	}
}
