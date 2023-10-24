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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.Quyen;
import com.DoAnTotNghiep.QuanLyPhongMay.service.QuyenService;

@RestController
@CrossOrigin
public class QuyenController {
	
	@Autowired
    private QuyenService quyenService;

    @PostMapping("/LuuQuyen")
    public Quyen luu(@RequestBody Quyen quyen){
        return quyenService.luu(quyen);
    }

    @GetMapping("/DSQuyen")
    public List<Quyen> layDSQuyen(){
        return quyenService.layDSQuyen();
    }

    @DeleteMapping("/XoaQuyen/{maQuyen}")
    public String xoa(@PathVariable Long maQuyen){
        quyenService.xoa(maQuyen);
        return "Đã xoá quyền " + maQuyen;
    }

}
