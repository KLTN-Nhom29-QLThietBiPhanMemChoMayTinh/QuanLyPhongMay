package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.ThietBiMay;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.ThietBiMayRepository;

@Service
public class ThietBiMayServiceImpl implements ThietBiMayService{
	@Autowired 
	private  MayTinhThietBiService  mayTinhThietBiService;
	@Autowired
	private  ThietBiMayRepository thietBiMayRepository;
	@Override
	public ThietBiMay layThietBiMayTheoMa(Long maThietBi) {
		ThietBiMay thietBiMay = null;
		Optional<ThietBiMay> kq = thietBiMayRepository.findById(maThietBi);
		try {
			thietBiMay = kq.get();
			return thietBiMay;
		} catch (Exception e) {
			return thietBiMay;
		}
	}

	@Override
	public List<ThietBiMay> layDSThietBiMay() {
		return thietBiMayRepository.findAll();
	}

	@Override
	public void xoa(Long maThietBi) {
		mayTinhThietBiService.xoaTheoMaThietBi(maThietBi);
		thietBiMayRepository.deleteById(maThietBi);
	}

	@Override
	public ThietBiMay luu(ThietBiMay thietBiMay) {
		return thietBiMayRepository.save(thietBiMay);
	}

	@Override
	public List<ThietBiMay> findByStatus(boolean status) {
		return thietBiMayRepository.findByStatus(status);
	}

}
