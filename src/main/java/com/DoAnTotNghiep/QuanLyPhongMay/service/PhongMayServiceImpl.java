package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayRepository;

@Service
public class PhongMayServiceImpl implements PhongMayService{


	@Autowired
	private  PhongMayRepository phongMayRepository;
	
	@Override
	public PhongMay layPhongMayTheoMa(Long maPhong) {
		PhongMay phongMay = null;
		Optional<PhongMay> kq = phongMayRepository.findById(maPhong);
		try {
			phongMay = kq.get();
			return phongMay;
		} catch (Exception e) {
			return phongMay;
		}
	}
	@Override
	public List<PhongMay> findByTrangThai(String trangThai) {
        return phongMayRepository.findByTrangThai(trangThai);
    }
	@Override
	public List<PhongMay> layDSPhongMay() {
		return phongMayRepository.findAll();
	}

	@Override
	public void xoa(Long maPhong) {
		phongMayRepository.deleteById(maPhong);
	}

	@Override
	public PhongMay luu(PhongMay phongMay) {
		return phongMayRepository.save(phongMay);
	}

	@Override
	public PhongMay capNhatTheoMa(Long maPhong, PhongMay phongMay) {
	    Optional<PhongMay> phongMayDB = phongMayRepository.findById(maPhong);
	    if (phongMayDB.isPresent()) {
	        PhongMay phongMayCu = phongMayDB.get();
	        return phongMayRepository.save(phongMayCu);
	    }
	    return null;
	}



}
