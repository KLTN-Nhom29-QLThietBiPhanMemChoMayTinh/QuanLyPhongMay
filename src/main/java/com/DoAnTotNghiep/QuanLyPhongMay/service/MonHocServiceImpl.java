package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LoaiThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHoc;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.MonHocRepository;

@Service
public class MonHocServiceImpl implements MonHocService{

	@Autowired
	private MonHocRepository monHocRepository;

	@Override
	public MonHoc layMonHocTheoMa(Long maMon) {
		MonHoc monHoc = null;
		Optional<MonHoc> kq = monHocRepository.findById(maMon);
		try {
			monHoc = kq.get();
			return monHoc;
		} catch (Exception e) {
			return monHoc;
		}
	}

	@Override
	public List<MonHoc> layDSMonHoc() {
		return monHocRepository.findAll();
	}

	@Override
	public void xoa(Long maMon) {
		monHocRepository.deleteById(maMon);
	}

	@Override
	public MonHoc luu(MonHoc monHoc) {
		return monHocRepository.save(monHoc);
	}
	
	

}
