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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LoaiThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.service.LoaiThietBiService;

@RestController
@CrossOrigin
public class LoaiThietBiController {
	
	@Autowired
    private LoaiThietBiService loaiThietBiService;

    @PostMapping("/LuuLoaiThietBi")
    public LoaiThietBi luu(@RequestBody LoaiThietBi loaiThietBi){
        return loaiThietBiService.luu(loaiThietBi);
    }

    @GetMapping("/DSLoaiThietBi")
    public List<LoaiThietBi> layDSLoaiThietBi(){
        return loaiThietBiService.layDSLoaiThietBi();
    }

    @DeleteMapping("/XoaLoaiThietBi/{maLoaiThietBi}")
    public String xoa(@PathVariable Long maLoai){
    	loaiThietBiService.xoa(maLoai);
        return "Đã xoá quyền " + maLoai;
    }

}
