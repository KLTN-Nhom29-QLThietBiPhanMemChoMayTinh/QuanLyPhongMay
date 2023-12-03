package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChu;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayRepository;

@Service
public class PhongMayServiceImpl implements PhongMayService{
	@PersistenceContext
    private EntityManager entityManager;
	 @Autowired
	 private PhongMayService phongMayService;
	 @Autowired
	 private MayTinhService mayTinhService;
	 @Autowired
	 private PhongMayPhanMemService phongMayPhanMemService;
	 @Autowired
	 private CaThucHanhService  caThucHanhService;

	@Autowired
	private  PhongMayRepository phongMayRepository;
	@Autowired
	private GhiChuService ghiChuService;
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
		List<GhiChu> dsGhiChu = ghiChuService.layDSGhiChuTheoPhongMay(maPhong);
		List<MayTinh> danhSachMayTinh = mayTinhService.layDSMayTinhTheoMaPhong(maPhong);
        List<PhongMayPhanMem> danhSachPhongMayPhanMem = phongMayPhanMemService.layDSPMPM(maPhong);
        List<CaThucHanh> danhSachCaThucHanh = caThucHanhService.layDSCaThucHanhTheoMaPhong(maPhong);

        for (MayTinh mayTinh : danhSachMayTinh) {
            mayTinhService.xoa(mayTinh.getMaMay());
        }

        for (CaThucHanh caThucHanh : danhSachCaThucHanh) {
            caThucHanhService.xoa(caThucHanh.getMaCa());
        }

        for (PhongMayPhanMem phongMayPhanMem : danhSachPhongMayPhanMem) {
            phongMayPhanMemService.xoa(maPhong, phongMayPhanMem.getPhanMem().getMaPhanMem());
        }   
	    for (GhiChu ghiChu : dsGhiChu) {
            ghiChuService.xoa(ghiChu.getMaGhiChu());
        }	
	    entityManager.flush();
        entityManager.clear();
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

	public List<PhongMay> layPhongMayTheoMaTang(Long maTang) {
	    return phongMayRepository.findByTang_MaTang(maTang);
	}

}
