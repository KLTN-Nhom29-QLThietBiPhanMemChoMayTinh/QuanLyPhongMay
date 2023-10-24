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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;
import com.DoAnTotNghiep.QuanLyPhongMay.service.TangService;

@RestController
@CrossOrigin
public class TangController {
	
	@Autowired
    private TangService tangService;

    @PostMapping("/LuuTang")
    public Tang luu(@RequestBody Tang tang){
        return tangService.luu(tang);
    }

    @GetMapping("/DSTang")
    public List<Tang> layDSTang(){
        return tangService.layDSTang();
    }

    @DeleteMapping("/XoaTang/{maTang}")
    public String xoa(@PathVariable Long maTang){
    	tangService.xoa(maTang);
        return "Đã xoá quyền " + maTang;
    }

}
