package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.ToaNha;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhanMemRepository;

@Service
public class PhanMemServiceImpl implements PhanMemService{
	@Autowired
	private GhiChuPhongMayService ghiChuPhongMayService;
	@Autowired
	private PhongMayPhanMemService phongMayPhanMemService;
	@Autowired
	private MonHocPhanMemService monHocPhanMemService;
	@Autowired
	private  PhanMemRepository phanMemRepository;
	
	@Override
	public PhanMem layPhanMemTheoMa(Long maPhanMem) {
		PhanMem phanMem = null;
		Optional<PhanMem> kq = phanMemRepository.findById(maPhanMem);
		try {
			phanMem = kq.get();
			return phanMem;
		} catch (Exception e) {
			return phanMem;
		}
	}

	@Override
	public List<PhanMem> layDSPhanMem() {
		return phanMemRepository.findAll();
	}

	@Override
    @Transactional
	public void xoa(Long maPhanMem) {
		phongMayPhanMemService.XoaTheoMaPhanMem(maPhanMem);
		monHocPhanMemService.xoaTheoMaPhanMem(maPhanMem);
		phanMemRepository.deleteById(maPhanMem);
	}

	@Override
	public PhanMem luu(PhanMem phanMem) {
		return phanMemRepository.save(phanMem);
	}

	@Override
	public List<PhanMem> findByTrangThai(boolean trangThai) {
		 return phanMemRepository.findByTrangThai(trangThai);
	}

}
