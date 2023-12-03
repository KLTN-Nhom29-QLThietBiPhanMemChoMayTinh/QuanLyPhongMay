package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayPhanMemRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayPhanMemRepository2;

@Service
public class PhongMayPhanMemServiceImpl implements PhongMayPhanMemService{

	@Autowired
	private PhongMayPhanMemRepository phongMayPhanMemRepository;
	@Autowired
	private PhongMayPhanMemRepository2 phongMayPhanMemRepository2;
	@Override
	public List<PhongMayPhanMem> layDSPMPMTheoMa(Long maPhong) {
		return phongMayPhanMemRepository.layDSPMPMTheoMa(maPhong);
	}
	
	@Override
	public PhongMayPhanMem luu(PhongMayPhanMem phongMayPhanMem) {
		return phongMayPhanMemRepository.luu(phongMayPhanMem);
	}

	@Override
	public List<PhongMayPhanMem> layDSPMPM(Long maPhong) {
		return phongMayPhanMemRepository.layDSPMPM(maPhong);
	}
	@Override
	public List<PhongMayPhanMem> layDanhSachPhongMayPhanMem() {
		return phongMayPhanMemRepository.layDanhSachPhongMayPhanMem();
	}
	@Override
	public List<PhongMayPhanMem> layDSPMPMTheoMaPhanMem(Long maPhanMem) {
		return phongMayPhanMemRepository.layDSPMPMTheoMaPhanMem(maPhanMem);
	}
	@Override
	public List<PhongMayPhanMem> findByStatus(boolean status) {
		return phongMayPhanMemRepository2.findByStatus(status);
	}
	@Override
	@Transactional
	public void XoaTheoMaPhanMem(Long maPhanMem) {
		phongMayPhanMemRepository2.XoaTheoMaPhanMem(maPhanMem);
	}
	@Override
	@Transactional
	public void xoa(Long maPhong, Long maPhanMem) {
		phongMayPhanMemRepository.xoa(maPhong, maPhanMem);
	}

}
