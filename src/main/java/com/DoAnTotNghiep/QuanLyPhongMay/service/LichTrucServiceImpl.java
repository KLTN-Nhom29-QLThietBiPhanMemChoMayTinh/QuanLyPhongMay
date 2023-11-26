package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.LichTrucRepository;

@Service
public class LichTrucServiceImpl implements LichTrucService {

	@Autowired
	private LichTrucRepository lichTrucRepository;

	@Override
	public LichTruc layLTTheoMa(Long maLich) {
		LichTruc lichTruc = null;
		Optional<LichTruc> kq = lichTrucRepository.findById(maLich);
		try {
			lichTruc = kq.get();
			return lichTruc;
		} catch (Exception e) {
			return lichTruc;
		}
	}

	@Override
	public List<LichTruc> layDSLT() {
		return lichTrucRepository.findAll();
	}

	@Override
	public void xoa(Long maLich) {
		lichTrucRepository.deleteById(maLich);
	}

	@Override
	public LichTruc luu(LichTruc lichTruc) {
		return lichTrucRepository.save(lichTruc);
	}

	@Override
	public List<LichTruc> layLichTrucTheoMaTang(Long maTang) {
		return lichTrucRepository.findByTang_MaTang(maTang);
	}

	@Override
	public List<Tang> layTangChuaCoNhanVienTrucTrongThang() {
		return lichTrucRepository.findTangChuaCoNhanVienTrucTrongThang();
	}
}
