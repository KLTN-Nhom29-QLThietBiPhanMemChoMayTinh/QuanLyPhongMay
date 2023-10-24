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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.ChucVu;
import com.DoAnTotNghiep.QuanLyPhongMay.service.CaThucHanhService;
import com.DoAnTotNghiep.QuanLyPhongMay.service.ChucVuService;

@RestController
@CrossOrigin
public class CaThucHanhController {
    
    @Autowired
    private CaThucHanhService caThucHanhService;

    @PostMapping("/LuuCaThucHanh")
    public CaThucHanh luu(@RequestBody CaThucHanh caThucHanh){
        return caThucHanhService.luu(caThucHanh);
    }

    @GetMapping("/DSCaThucHanh")
    public List<CaThucHanh> layDSCaThucHanh(){
        return caThucHanhService.layDSCaThucHanh();
    }
    
    @GetMapping("/CaThucHanh/{maCaThucHanh}")
    public CaThucHanh layCaThucHanhTheoMa(@PathVariable Long maCaThucHanh){
        return caThucHanhService.layCaThucHanhTheoMa(maCaThucHanh);
    }

    @DeleteMapping("/XoaCaThucHanh/{maCaThucHanh}")
    public String xoa(@PathVariable Long maCaThucHanh){
    	caThucHanhService.xoa(maCaThucHanh);
        return "Đã xoá chức vụ " + maCaThucHanh;
    }
}
