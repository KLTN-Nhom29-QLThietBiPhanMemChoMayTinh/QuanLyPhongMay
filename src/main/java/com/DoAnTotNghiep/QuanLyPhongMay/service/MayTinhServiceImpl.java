package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.MayTinhRepository;
@Service
public class MayTinhServiceImpl implements MayTinhService{

	@Autowired
	private  MayTinhRepository mayTinhRepository;
	@Autowired 
	private  MayTinhThietBiService  mayTinhThietBiService;
	@Override
	public MayTinh layMayTinhTheoMa(Long maMay) {
		MayTinh mayTinh = null;
		Optional<MayTinh> kq = mayTinhRepository.findById(maMay);
		try {
			mayTinh = kq.get();
			return mayTinh;
		} catch (Exception e) {
			return mayTinh;
		}
	}
	@Override
	public List<MayTinh> findByTrangThai(String trangThai) {
        return mayTinhRepository.findByTrangThai(trangThai);
    }
	@Override
    public List<MayTinh> layDSMayTinhTheoMaPhong(Long maPhong) {
        return mayTinhRepository.findByPhongMay_MaPhong(maPhong);
    }
	@Override
	public List<MayTinh> layDSMayTinh() {
		return mayTinhRepository.findAll();
	}

	@Override
	public void xoa(Long maMay) {
	    mayTinhThietBiService.xoaTheoMaMay(maMay);
	    mayTinhRepository.deleteById(maMay);
	}


	@Override
	public MayTinh luu(MayTinh mayTinh) {
		return mayTinhRepository.save(mayTinh);
	}
	

}
