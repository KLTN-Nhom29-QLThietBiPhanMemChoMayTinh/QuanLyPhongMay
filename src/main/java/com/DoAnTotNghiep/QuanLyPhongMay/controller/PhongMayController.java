package com.DoAnTotNghiep.QuanLyPhongMay.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.ThietBiMay;
import com.DoAnTotNghiep.QuanLyPhongMay.model.PhongMayModel;
import com.DoAnTotNghiep.QuanLyPhongMay.service.PhongMayPhanMemService;
import com.DoAnTotNghiep.QuanLyPhongMay.service.PhongMayService;

@RestController
@CrossOrigin
public class PhongMayController {
    
    @Autowired
    private PhongMayService phongMayService;
    
    @Autowired
    private PhongMayPhanMemService phongMayPhanMemService;

    @PostMapping("/LuuPhongMay")
    public PhongMay luu(@RequestBody PhongMay phongMay){
    	System.out.println(phongMay);
    	
    	List<MayTinh> mayTinhs  = phongMay.getMayTinhs();
    	
    	for (MayTinh mayTinh : mayTinhs) {
    		System.out.println(mayTinh);
		}
//        return phongMayService.luu(phongMay);
    	return new PhongMay();
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
    public String xoa(@PathVariable Long maPhong){
    	phongMayService.xoa(maPhong);
        return "Đã xoá chức vụ " + maPhong;
    }
    @PutMapping("/CapNhatPhongMay")
    public PhongMay capNhat(@RequestBody PhongMay phongMay){
        return phongMayService.capNhat(phongMay);
    }
    
   
    @PutMapping("/CapNhatPhongMay/{maPhong}")
    public PhongMay capNhatTheoMa(@PathVariable Long maPhong, @RequestBody PhongMay phongMay){
        return phongMayService.capNhatTheoMa(maPhong, phongMay);
    }
}
