package com.DoAnTotNghiep.QuanLyPhongMay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.service.PhongMayService;

@RestController
@CrossOrigin
public class PhongMayController {
    
    @Autowired
    private PhongMayService phongMayService;

    @PostMapping("/LuuPhongMay")
    public PhongMay luu(@RequestBody PhongMay phongMay){
        return phongMayService.luu(phongMay);
    }

    @GetMapping("/DSPhongMay")
    public List<PhongMay> layDSPhongMay(){
        return phongMayService.layDSPhongMay();
    }
    
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
