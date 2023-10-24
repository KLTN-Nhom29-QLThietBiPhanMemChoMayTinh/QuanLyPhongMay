package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.TangRepository;

@Service
public class TangServiceImpl implements TangService{


	@Autowired
	private TangRepository tangRepository;
	
	@Override
	public Tang layTangTheoMa(Long maTang) {
		Tang tang = null;
		Optional<Tang> kq = tangRepository.findById(maTang);
		try {
			tang = kq.get();
			return tang;
		} catch (Exception e) {
			return tang;
		}
	}

	@Override
	public List<Tang> layDSTang() {
		return tangRepository.findAll();
	}

	@Override
	public void xoa(Long maTang) {
		tangRepository.deleteById(maTang);
	}

	@Override
	public Tang luu(Tang tang) {
		return tangRepository.save(tang);
	}


}
