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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ThietBiMay;
import com.DoAnTotNghiep.QuanLyPhongMay.service.ThietBiMayService;

@RestController
@CrossOrigin
public class ThietBiController {
    
    @Autowired
    private ThietBiMayService thietBiMayService;

    @PostMapping("/LuuThietBiMay")
    public ThietBiMay luu(@RequestBody ThietBiMay thietBiMay){
        return thietBiMayService.luu(thietBiMay);
    }

    @GetMapping("/DSThietBiMay")
    public List<ThietBiMay> layDSThietBiMay(){
        return thietBiMayService.layDSThietBiMay();
    }
    @GetMapping("DSThietBiMaytheoTrangThai/{status}")
    public List<ThietBiMay> getThietBiMaysByStatus(@PathVariable boolean  status) {
        return thietBiMayService.findByStatus(status);
    }
    @GetMapping("/ThietBiMay/{maThietBi}")
    public ThietBiMay layThietBiMayTheoMa(@PathVariable Long maThietBi){
        return thietBiMayService.layThietBiMayTheoMa(maThietBi);
    }

    @DeleteMapping("/XoaThietBiMay/{maThietBi}")
    public String xoa(@PathVariable Long maThietBi){
    	thietBiMayService.xoa(maThietBi);
        return "Đã xoá chức vụ " + maThietBi;
    }
}
