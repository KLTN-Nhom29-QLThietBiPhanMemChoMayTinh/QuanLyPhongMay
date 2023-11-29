package com.DoAnTotNghiep.QuanLyPhongMay.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.model.PhongMayModel;
import com.DoAnTotNghiep.QuanLyPhongMay.service.CaThucHanhService;
import com.DoAnTotNghiep.QuanLyPhongMay.service.MayTinhService;
import com.DoAnTotNghiep.QuanLyPhongMay.service.PhongMayPhanMemService;
import com.DoAnTotNghiep.QuanLyPhongMay.service.PhongMayService;

@RestController
@CrossOrigin
public class PhongMayController {
	
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

    @PostMapping("/LuuPhongMay")
    public PhongMay luu(@RequestBody PhongMay phongMay){
        return phongMayService.luu(phongMay);
    }

    @GetMapping("/DSPhongMay")
    public List<PhongMay> layDSPhongMay(){
        return phongMayService.layDSPhongMay();
    }
    
    //
    @GetMapping("/DSPhongMay2")
    public ResponseEntity<?> layDSPhongMay2(){
    	List<PhongMay> lstPhongMay = phongMayService.layDSPhongMay();
    	List<PhongMayModel> mayModels = new ArrayList<>();
    	
    	for (PhongMay phongMay : lstPhongMay) {
    		List<PhanMem> lstPhanMems = new ArrayList<>();
    		List<PhongMayPhanMem> lstPhongMayPhanMems = phongMayPhanMemService.layDSPMPM(phongMay.getMaPhong());
    		
    		for (PhongMayPhanMem mayPhanMem : lstPhongMayPhanMems) {
				lstPhanMems.add(mayPhanMem.getPhanMem());
			}
    		
    		PhongMayModel model = new PhongMayModel();
    		model.setMaPhong(phongMay.getMaPhong());
    		model.setMayTinhs(phongMay.getMayTinhs());
    		model.setMoTa(phongMay.getMoTa());
    		model.setPhanMems(lstPhanMems);
    		model.setSoMay(phongMay.getSoMay());
    		model.setTang(phongMay.getTang());
    		model.setTenPhong(phongMay.getTenPhong());
    		model.setTrangThai(phongMay.getTrangThai());
    		
    		mayModels.add(model);
		}
    			
        return ResponseEntity.ok(mayModels);
    }
    //
    
    @GetMapping("/PhongMay/{maPhong}")
    public PhongMay layPhongMayTheoMa(@PathVariable Long maPhong){
        return phongMayService.layPhongMayTheoMa(maPhong);
    }

    @DeleteMapping("/XoaPhongMay/{maPhong}")
    @Transactional
    public String xoa(@PathVariable Long maPhong) {

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
            entityManager.flush();
            entityManager.clear();
            phongMayService.xoa(maPhong);

            return "Đã xoá " + maPhong;
        
    }

   
   
    @PutMapping("/CapNhatPhongMay/{maPhong}")
    public PhongMay capNhatTheoMa(@PathVariable Long maPhong, @RequestBody PhongMay phongMay){
        return phongMayService.capNhatTheoMa(maPhong, phongMay);
    }
}
