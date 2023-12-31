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
import com.DoAnTotNghiep.QuanLyPhongMay.service.ChucVuService;

@RestController
@CrossOrigin
public class ChucVuController {
    
    @Autowired
    private ChucVuService chucVuService;

    @PostMapping("/LuuChucVu")
    public ChucVu luu(@RequestBody ChucVu chucVu){
        return chucVuService.luu(chucVu);
    }

    @GetMapping("/DSChucVu")
    public List<ChucVu> layDSDV(){
        return chucVuService.layDSCV();
    }
    
    @GetMapping("/ChucVu/{maCV}")
    public ChucVu layCVTheoMa(@PathVariable Long maCV){
        return chucVuService.layCVTheoMa(maCV);
    }

    @DeleteMapping("/XoaChucVu/{maCV}")
    public String xoa(@PathVariable Long maCV){
        chucVuService.xoa(maCV);
        return "Đã xoá chức vụ " + maCV;
    }
}
