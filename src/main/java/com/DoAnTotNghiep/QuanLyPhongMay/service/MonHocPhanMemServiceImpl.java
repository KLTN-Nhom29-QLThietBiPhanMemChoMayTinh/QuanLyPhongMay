package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.MonHocPhanMemRepository;

@Service
public class MonHocPhanMemServiceImpl implements MonHocPhanMemService{

	@Autowired
	private MonHocPhanMemRepository monHocPhanMemRepository;
	
	@Override
	public List<MonHocPhanMem> layDSMHPMTheoMa(Long maMon) {
		return monHocPhanMemRepository.layDSMHPMTheoMa(maMon);
	}
	
	@Override
	public void xoa(Long maMon, Long maPhanMem) {
		monHocPhanMemRepository.xoa(maMon, maPhanMem);
	}

	@Override
	public MonHocPhanMem luu(MonHocPhanMem monHocPhanMem) {
		return monHocPhanMemRepository.luu(monHocPhanMem);
	}

	@Override
	public List<MonHocPhanMem> layDSMHPM(Long maMon) {
		return monHocPhanMemRepository.layDSMHPM(maMon);
	}

}
