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
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Khoa;
import com.DoAnTotNghiep.QuanLyPhongMay.service.ChucVuService;
import com.DoAnTotNghiep.QuanLyPhongMay.service.KhoaService;

@RestController
@CrossOrigin
public class KhoaController {
    
    @Autowired
    private KhoaService khoaService;

    @PostMapping("/LuuKhoa")
    public Khoa luu(@RequestBody Khoa khoa){
        return khoaService.luu(khoa);
    }

    @GetMapping("/DSKhoa")
    public List<Khoa> layDSDV(){
        return khoaService.layDSKhoa();
    }
    
    @GetMapping("/Khoa/{maKhoa}")
    public Khoa layKhoaTheoMa(@PathVariable Long maKhoa){
        return khoaService.layKhoaTheoMa(maKhoa);
    }

    @DeleteMapping("/XoaKhoa/{maKhoa}")
    public String xoa(@PathVariable Long maKhoa){
        khoaService.xoa(maKhoa);
        return "Đã xoá khoa " + maKhoa;
    }
}
