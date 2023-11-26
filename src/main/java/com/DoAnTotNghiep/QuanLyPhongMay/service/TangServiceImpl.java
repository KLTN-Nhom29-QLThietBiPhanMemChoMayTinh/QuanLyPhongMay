package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.TangRepository;

@Service
public class TangServiceImpl implements TangService{


	@Autowired
	private TangRepository tangRepository;
	@Autowired
    private LichTrucService lichTrucService;
	
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
	        List<LichTruc> dsLichTruc = lichTrucService.layLichTrucTheoMaTang(maTang);
	        for (LichTruc lichTruc : dsLichTruc) {
	            lichTrucService.xoa(lichTruc.getMaLich());
	        }
	        tangRepository.deleteById(maTang);
	    }

	@Override
	public Tang luu(Tang tang) {
		return tangRepository.save(tang);
	}

	 @Override
	    public List<Tang> layTangTheoToaNha(Long maToaNha) {
	        return tangRepository.findByToaNha_MaToaNha(maToaNha);
	 }
	 
	 @Override
	 public Long tinhSoLuongTangTheoMaToaNha(Long maToaNha) {
		    return tangRepository.countByToaNha_MaToaNha(maToaNha);
	}

}
