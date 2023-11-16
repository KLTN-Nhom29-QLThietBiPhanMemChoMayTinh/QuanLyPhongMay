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
import com.DoAnTotNghiep.QuanLyPhongMay.service.MayTinhService;

@RestController
@CrossOrigin
public class MayTinhController {
	
	@Autowired
    private MayTinhService mayTinhService;

    @PostMapping("/LuuMayTinh")
    public MayTinh luu(@RequestBody MayTinh mayTinh){
    	System.out.println(mayTinh);
        return mayTinhService.luu(mayTinh);
    }

    @GetMapping("/DSMayTinh")
    public List<MayTinh> layDSMayTinh(){
        return mayTinhService.layDSMayTinh();
    }

    @DeleteMapping("/XoaMayTinh/{maMay}")
    public String xoa(@PathVariable Long maMay){
    	mayTinhService.xoa(maMay);
        return "Đã xoá quyền " + maMay;
    }
    @GetMapping("/MayTinh/{maMay}")
  	public MayTinh layMayTinhTheoMa(@PathVariable Long maMay){
  	      return mayTinhService.layMayTinhTheoMa(maMay);
  	}
}
