package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayPhanMemRepository;

@Service
public class PhongMayPhanMemServiceImpl implements PhongMayPhanMemService{

	@Autowired
	private PhongMayPhanMemRepository phongMayPhanMemRepository;
	
	@Override
	public List<PhongMayPhanMem> layDSMHPMTheoMa(Long maPhong) {
		return phongMayPhanMemRepository.layDSPMPMTheoMa(maPhong);
	}
	@Override
	public void xoa(Long maPhong, Long maPhanMem) {
		phongMayPhanMemRepository.xoa(maPhong, maPhanMem);
	}

	@Override
	public PhongMayPhanMem luu(PhongMayPhanMem phongMayPhanMem) {
		return phongMayPhanMemRepository.luu(phongMayPhanMem);
	}

	@Override
	public List<PhongMayPhanMem> layDSPMPM(Long maPhong) {
		return phongMayPhanMemRepository.layDSPMPM(maPhong);
	}

}
