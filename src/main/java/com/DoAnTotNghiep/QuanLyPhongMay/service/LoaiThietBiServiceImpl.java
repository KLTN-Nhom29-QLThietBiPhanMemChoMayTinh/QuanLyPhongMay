package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LoaiThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.LoaiThietBiRepository;

@Service
public class LoaiThietBiServiceImpl implements LoaiThietBiService{

	@Autowired
	private LoaiThietBiRepository loaiThietBiRepository;
	
	@Override
	public LoaiThietBi layLoaiThietBiTheoMa(Long maLoai) {
		LoaiThietBi loaiThietBi = null;
		Optional<LoaiThietBi> kq = loaiThietBiRepository.findById(maLoai);
		try {
			loaiThietBi = kq.get();
			return loaiThietBi;
		} catch (Exception e) {
			return loaiThietBi;
		}
	}

	@Override
	public List<LoaiThietBi> layDSLoaiThietBi() {
		return loaiThietBiRepository.findAll();
	}

	@Override
	public void xoa(Long maLoai) {
		loaiThietBiRepository.deleteById(maLoai);
	}

	@Override
	public LoaiThietBi luu(LoaiThietBi loaiThietBi) {
		return loaiThietBiRepository.save(loaiThietBi);
	}

}
