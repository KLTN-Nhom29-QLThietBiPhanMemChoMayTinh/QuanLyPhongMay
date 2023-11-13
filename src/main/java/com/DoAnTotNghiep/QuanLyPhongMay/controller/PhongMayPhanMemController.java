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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.service.PhongMayPhanMemService;

@RestController
@CrossOrigin
public class PhongMayPhanMemController {
	
	@Autowired
    private PhongMayPhanMemService phongMayPhanMemService;

    @PostMapping("/LuuPhongMayPhanMem")
    public PhongMayPhanMem luu(@RequestBody PhongMayPhanMem PhongMayPhanMem){
        return phongMayPhanMemService.luu(PhongMayPhanMem);
    }

    @GetMapping("/DSPhongMayPhanMem/{maPhong}")
    public List<PhongMayPhanMem> layDSPhongMayPhanMem(@PathVariable Long maPhong){
        return phongMayPhanMemService.layDSPMPM(maPhong);
    }

    @DeleteMapping("/XoaPhongMayPhanMem/{maPhong}/{maPhanMem}")
    public String xoa(@PathVariable Long maPhong,@PathVariable Long maPhanMem){
    	phongMayPhanMemService.xoa(maPhong,maPhanMem);
        return "Đã xoá quyền " + maPhong + "Đã xoá quyền" +maPhanMem;
    }
    @GetMapping("/DanhSachPhongMayPhanMem")
    public List<PhongMayPhanMem> layDanhSachPhongMayPhanMem() {
        return phongMayPhanMemService.layDanhSachPhongMayPhanMem();
    }

}
