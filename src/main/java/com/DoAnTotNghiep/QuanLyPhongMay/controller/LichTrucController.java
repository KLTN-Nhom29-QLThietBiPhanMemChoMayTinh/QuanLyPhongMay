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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ChucVu;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;
import com.DoAnTotNghiep.QuanLyPhongMay.service.ChucVuService;
import com.DoAnTotNghiep.QuanLyPhongMay.service.LichTrucService;

@RestController
@CrossOrigin
public class LichTrucController {
    
    @Autowired
    private LichTrucService lichTrucService;

    @PostMapping("/LuuLichTruc")
    public LichTruc luu(@RequestBody LichTruc lichTruc){
        return lichTrucService.luu(lichTruc);
    }

    @GetMapping("/DSLichTruc")
    public List<LichTruc> layDSLT(){
        return lichTrucService.layDSLT();
    }
    
    @GetMapping("/LichTruc/{maLT}")
    public LichTruc layLTTheoMa(@PathVariable Long maLich){
        return lichTrucService.layLTTheoMa(maLich);
    }

    @DeleteMapping("/XoaLichTruc/{maLich}")
    public String xoa(@PathVariable Long maLich){
    	lichTrucService.xoa(maLich);
        return "Đã xoá chức vụ " + maLich;
    }
}
