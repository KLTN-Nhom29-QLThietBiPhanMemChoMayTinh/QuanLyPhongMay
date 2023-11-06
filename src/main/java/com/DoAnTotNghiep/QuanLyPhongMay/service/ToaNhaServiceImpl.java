package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ToaNha;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.ToaNhaRepository;

@Service
public class ToaNhaServiceImpl implements ToaNhaService{
	@Autowired
	private ToaNhaRepository toaNhaRepository;
	@Override
	public ToaNha layToaNhaTheoMa(Long maToaNha) {
		ToaNha toaNha = null;
		Optional<ToaNha> kq = toaNhaRepository.findById(maToaNha);
		try {
			toaNha = kq.get();
			return toaNha;
		} catch (Exception e) {
			return toaNha;
		}
	}

	@Override
	public List<ToaNha> layDSToaNha() {
		return toaNhaRepository.findAll();
	}

	@Override
	public void xoa(Long maToaNha) {
		toaNhaRepository.deleteById(maToaNha);
		
	}

	@Override
	public ToaNha luu(ToaNha toaNha) {
		return toaNhaRepository.save(toaNha);
	}

}
