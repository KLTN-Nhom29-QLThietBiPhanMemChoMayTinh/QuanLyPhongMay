package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.MayTinhThietBiRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayPhanMemRepository;

@Service
public class MayTinhThietBiServiceImpl implements MayTinhThietBiService{

	@Autowired
	private MayTinhThietBiRepository mayTinhThietBiRepository;
	
	@Override
	public List<MayTinhThietBi> layDSMTTBTheoMa(Long maMay) {
		return mayTinhThietBiRepository.layDSMTTBheoMa(maMay);
	}
	@Override
	public void xoa(Long maMay, Long maThietBi) {
		mayTinhThietBiRepository.xoa(maMay, maThietBi);
	}

	@Override
	public MayTinhThietBi luu(MayTinhThietBi mayTinhThietBi) {
		return mayTinhThietBiRepository.luu(mayTinhThietBi);
	}

	@Override
	public List<MayTinhThietBi> layDSMTTB(Long maMay) {
		return mayTinhThietBiRepository.layDSMTTB(maMay);
	}
	@Override
	public List<MayTinhThietBi> layDanhSachMayTinhThietBi() {
		return mayTinhThietBiRepository.layDanhSachMayTinhThietBi();
	}

}
