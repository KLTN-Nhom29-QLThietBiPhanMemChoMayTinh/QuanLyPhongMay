package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayPhanMemRepository2;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayRepository;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.TangRepository;

@Service
public class TangServiceImpl implements TangService{

	@Autowired
	private PhongMayRepository phongMayRepository;
	@Autowired
	private  TangRepository tangRepository;
	@Autowired
    private  LichTrucService lichTrucService;
	@Autowired
	private PhongMayService phongMayService;
	
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
	public List<PhongMay> layDSPhongMayTheoTang(Long maTang) {
	    return phongMayService.layPhongMayTheoMaTang(maTang);
	}

	@Override
	public List<LichTruc> layDSLichTrucTheoTang(Long maTang) {
	    return lichTrucService.layLichTrucTheoMaTang(maTang);
	}

	@Override
	public List<Tang> layDSTang() {
		return tangRepository.findAll();
	}

	
	@Override
	@Transactional
	public void xoa(Long maTang) {
        List<PhongMay> danhSachPhongMay = phongMayRepository.findByTang_MaTang(maTang);

        for (PhongMay phongMay : danhSachPhongMay) {
          
            List<LichTruc> dsLichTruc = lichTrucService.layLichTrucTheoMaTang(maTang);

            // Xoá từng lịch trực liên quan
            for (LichTruc lichTruc : dsLichTruc) {
                lichTrucService.xoa(lichTruc.getMaLich());
            }

            // Xoá phòng máy
            phongMayService.xoa(phongMay.getMaPhong());
        }

        // Sau khi xoá tất cả phòng máy và lịch trực, tiến hành xoá tầng
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
