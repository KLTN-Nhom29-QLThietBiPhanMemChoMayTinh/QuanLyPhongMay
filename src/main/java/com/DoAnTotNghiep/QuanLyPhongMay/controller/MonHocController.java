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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHoc;
import com.DoAnTotNghiep.QuanLyPhongMay.service.MonHocService;

@RestController
@CrossOrigin
public class MonHocController {
	
	@Autowired
    private MonHocService monHocService;

    @PostMapping("/LuuMonHoc")
    public MonHoc luu(@RequestBody MonHoc monHoc){
        return monHocService.luu(monHoc);
    }

    @GetMapping("/DSMonHoc")
    public List<MonHoc> layDSMonHoc(){
        return monHocService.layDSMonHoc();
    }

    @DeleteMapping("/XoaMonHoc/{maMon}")
    public String xoa(@PathVariable Long maMon){
        monHocService.xoa(maMon);
        return "Đã xoá quyền " + maMon;
    }
    @GetMapping("/MonHoc/{maMon}")
	public MonHoc layMonHocTheoMa(@PathVariable Long maMon){
	      return monHocService.layMonHocTheoMa(maMon);
	}
}
