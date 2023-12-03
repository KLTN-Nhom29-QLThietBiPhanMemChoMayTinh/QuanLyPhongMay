package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.MonHocPhanMemRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.MonHocPhanMemRepository2;

@Service
public class MonHocPhanMemServiceImpl implements MonHocPhanMemService{

	@Autowired
	private  MonHocPhanMemRepository monHocPhanMemRepository;
	@Autowired
	private MonHocPhanMemRepository2 monHocPhanMemRepository2;
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
		return monHocPhanMemRepository2.save(monHocPhanMem);
	}

	@Override
	public List<MonHocPhanMem> layDSMHPM(Long maMon) {
		return monHocPhanMemRepository.layDSMHPM(maMon);
	}

	@Override
	public List<MonHocPhanMem> layDanhSachMonHocPhanMem() {
	    return monHocPhanMemRepository.layDanhSachMonHocPhanMem();
	}


	@Override
	@Transactional
	public void xoaTheoMaPhanMem(Long maPhanMem) {
		monHocPhanMemRepository2.XoaTheoMaPhanMem(maPhanMem);
		
	}

	@Override
	@Transactional
	public void xoaTheoMaMon(Long maMon) {
		monHocPhanMemRepository2.XoaTheoMaMon(maMon);	
	}


}
