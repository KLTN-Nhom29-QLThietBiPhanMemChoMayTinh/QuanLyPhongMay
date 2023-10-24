package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.Khoa;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.KhoaRepository;


@Service
public class KhoaServiceImpl implements KhoaService{

	@Autowired
	private KhoaRepository khoaRepository;

	
	@Override
	public Khoa layKhoaTheoMa(Long maKhoa) {
		Khoa khoa = null;
		Optional<Khoa> kq = khoaRepository.findById(maKhoa);
		try {
			khoa = kq.get();
			return khoa;
		} catch (Exception e) {
			return khoa;
		}
	}

	@Override
	public List<Khoa> layDSKhoa() {
		return khoaRepository.findAll();
	}


	@Transactional
	public void xoa(Long maKhoa) {
	   khoaRepository.deleteById(maKhoa);
	}

	@Override
	public Khoa luu(Khoa khoa) {
		return khoaRepository.save(khoa);
	}

}
