package com.DoAnTotNghiep.QuanLyPhongMay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.ThietBiMay;
import com.DoAnTotNghiep.QuanLyPhongMay.service.MayTinhThietBiService;
import com.DoAnTotNghiep.QuanLyPhongMay.service.PhongMayPhanMemService;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.MayTinhThietBiRepository2;

@RestController
@CrossOrigin
public class MayTinhThietBiController {
	
	@Autowired
    private MayTinhThietBiService mayTinhThietBiService;
	
	@Autowired
	private MayTinhThietBiRepository2 MayTinhThietBiRepository2;

    @PostMapping("/LuuMayTinhThietBi")
    public MayTinhThietBi luu(@RequestBody MayTinhThietBi mayTinhThietBi){
    	System.out.println(mayTinhThietBi);
        return MayTinhThietBiRepository2.save(mayTinhThietBi);
    }

    @GetMapping("/DSMayTinhThietBi/{maMay}")
    public List<MayTinhThietBi> layDSMayTinhThietBi(@PathVariable Long maMay){
        return mayTinhThietBiService.layDSMTTB(maMay);
    }

    @DeleteMapping("/XoaMayTinhThietBi/{maMay}/{maThietBi}")
    public String xoa(@PathVariable Long maMay,@PathVariable Long maThietBi){
    	MayTinhThietBi mayTinhThietBi = new MayTinhThietBi();
    	//
    	MayTinh mayTinh = new MayTinh();
    	mayTinh.setMaMay(maMay);
    	ThietBiMay thietBiMay = new ThietBiMay();
    	thietBiMay.setMaThietBi(maThietBi);
    	//
    	mayTinhThietBi.setMayTinh(mayTinh);
    	mayTinhThietBi.setThietBi(thietBiMay);
    	
    	MayTinhThietBiRepository2.delete(mayTinhThietBi);
        return "Đã xoá quyền " + maMay + "Đã xoá quyền" +maThietBi;
    }
    @GetMapping("/DanhSachMayTinhThietBi")
    public List<MayTinhThietBi> layDanhSachMayTinhThietBi() {
        return mayTinhThietBiService.layDanhSachMayTinhThietBi();
    }

}
