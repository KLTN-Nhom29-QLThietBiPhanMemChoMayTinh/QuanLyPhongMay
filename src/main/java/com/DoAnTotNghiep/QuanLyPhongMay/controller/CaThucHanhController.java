package com.DoAnTotNghiep.QuanLyPhongMay.controller;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.service.CaThucHanhService;

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
    
    @GetMapping("/DSCaThucHanhTheoNgay/{ngayThucHanh}")
    public ResponseEntity<List<CaThucHanh>> layDSCaThucHanhTheoNgay(
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date ngayThucHanh) {
        List<CaThucHanh> dsCaThucHanh = caThucHanhService.layDSCaThucHanhTheoNgay(ngayThucHanh);
        return new ResponseEntity<>(dsCaThucHanh, HttpStatus.OK);
    }

    
    @GetMapping("/CaThucHanh/{maCaThucHanh}")
    public CaThucHanh layCaThucHanhTheoMa(@PathVariable Long maCaThucHanh){
        return caThucHanhService.layCaThucHanhTheoMa(maCaThucHanh);
    }
    @GetMapping("/DSCaThucHanhTheoMonHoc/{maMon}")
    public ResponseEntity<List<CaThucHanh>> layDSCaThucHanhTheoMonHoc(@PathVariable Long maMon) {
        List<CaThucHanh> dsCaThucHanh = caThucHanhService.layDSCaThucHanhTheoMonHoc(maMon);
        
        if (dsCaThucHanh.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(dsCaThucHanh, HttpStatus.OK);
    }
    @PutMapping("/CapNhatCaThucHanh/{maCaThucHanh}")
    public CaThucHanh capNhat(@PathVariable Long maCaThucHanh, @RequestBody CaThucHanh caThucHanh){
        CaThucHanh existingCaThucHanh = caThucHanhService.layCaThucHanhTheoMa(maCaThucHanh);
        if (existingCaThucHanh != null) {
            existingCaThucHanh.setNgayThucHanh(caThucHanh.getNgayThucHanh());
            existingCaThucHanh.setTenCa(caThucHanh.getTenCa());
            existingCaThucHanh.setTietBatDau(caThucHanh.getTietBatDau());
            existingCaThucHanh.setTietKetThuc(caThucHanh.getTietKetThuc());
            existingCaThucHanh.setGiaoVien(caThucHanh.getGiaoVien());
            existingCaThucHanh.setPhongMay(caThucHanh.getPhongMay());
            existingCaThucHanh.setMonHoc(caThucHanh.getMonHoc());

            return caThucHanhService.capNhat(existingCaThucHanh);
        } else {
            return null;
        }
    }
    
    @DeleteMapping("/XoaCaThucHanh/{maCaThucHanh}")
    public String xoa(@PathVariable Long maCaThucHanh){
    	caThucHanhService.xoa(maCaThucHanh);
        return "Đã xoá chức vụ " + maCaThucHanh;
    }
}
