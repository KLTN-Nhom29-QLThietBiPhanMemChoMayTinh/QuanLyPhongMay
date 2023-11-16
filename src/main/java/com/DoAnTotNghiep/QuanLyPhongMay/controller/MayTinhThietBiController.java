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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
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
    	mayTinhThietBiService.xoa(maMay,maThietBi);
        return "Đã xoá quyền " + maMay + "Đã xoá quyền" +maThietBi;
    }
    @GetMapping("/DanhSachMayTinhThietBi")
    public List<MayTinhThietBi> layDanhSachMayTinhThietBi() {
        return mayTinhThietBiService.layDanhSachMayTinhThietBi();
    }

}
