package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.MayTinhThietBiRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.MayTinhThietBiRepository2;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayPhanMemRepository;

@Service
public class MayTinhThietBiServiceImpl implements MayTinhThietBiService{

	@Autowired
	private  MayTinhThietBiRepository mayTinhThietBiRepository;
	@Autowired
    private MayTinhThietBiRepository2 mayTinhThietBiRepository2;
	
	@Override
	public List<MayTinhThietBi> layDSMTTBTheoMa(Long maMay) {
		return mayTinhThietBiRepository.layDSMTTBheoMa(maMay);
	}
	@Override
	@Transactional
	public void xoa(Long maMay, Long maThietBi) {
		mayTinhThietBiRepository.xoa(maMay, maThietBi);
	}
	@Override
	@Transactional
	public void xoaTheoMaMay(Long maMay) {
	    mayTinhThietBiRepository2.xoaTheoMaMay(maMay);
	}
	@Override
	@Transactional
	public void xoaTheoMaThietBi(Long maThietBi) {
	    mayTinhThietBiRepository2.xoaTheoMaThietBi(maThietBi);
	}

	@Override
	public MayTinhThietBi luu(MayTinhThietBi mayTinhThietBi) {
		return mayTinhThietBiRepository2.save(mayTinhThietBi);
	}

	@Override
	public List<MayTinhThietBi> layDSMTTB(Long maMay) {
		return mayTinhThietBiRepository.layDSMTTB(maMay);
	}
	@Override
	public List<MayTinhThietBi> layDanhSachMayTinhThietBi() {
		return mayTinhThietBiRepository.layDanhSachMayTinhThietBi();
	}
	@Override
	public List<MayTinhThietBi> layDSMTTBTheoMaThietBi(Long maThietBi) {
		return mayTinhThietBiRepository.layDSMTTBheoMaThietBi(maThietBi);
	}
	@Override
    public MayTinhThietBi updateMayTinhThietBi(MayTinhThietBi mayTinhThietBi) {
		 return mayTinhThietBiRepository2.save(mayTinhThietBi);
    }
	@Override
	public List<MayTinhThietBi> findByStatus(boolean status) {
		return mayTinhThietBiRepository2.findByStatus(status);
	}
}
