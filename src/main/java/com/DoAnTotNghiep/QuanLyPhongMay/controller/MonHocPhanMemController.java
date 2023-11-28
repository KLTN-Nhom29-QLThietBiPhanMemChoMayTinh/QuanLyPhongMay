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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MonHocPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.MonHocPhanMemRepository2;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayPhanMemRepository2;
import com.DoAnTotNghiep.QuanLyPhongMay.service.MonHocPhanMemService;

@RestController
@CrossOrigin
public class MonHocPhanMemController {
	
	@Autowired
    private MonHocPhanMemService monHocPhanMemService;
	

    @PostMapping("/LuuMonHocPhanMem")
    public MonHocPhanMem luu(@RequestBody MonHocPhanMem monHocPhanMem){
        return monHocPhanMemService.luu(monHocPhanMem);
    }

    @GetMapping("/DSMonHocPhanMem/{maMon}")
    public List<MonHocPhanMem> layDSMonHocPhanMem(@PathVariable Long maMon){
        return monHocPhanMemService.layDSMHPM(maMon);
    }

    @DeleteMapping("/XoaQuyen/{maMon}/{maPhanMem}")
    public String xoa(@PathVariable Long maMon, @PathVariable Long maPhanMem){
    	monHocPhanMemService.xoa(maMon, maPhanMem);
        return "Đã xoá quyền " + maMon+"Đã xoá quyền " + maPhanMem;
    }
    
    @GetMapping("/DanhSachMonHocPhanMem")
    public List<MonHocPhanMem> layDanhSachMonHocPhanMem() {
        return monHocPhanMemService.layDanhSachMonHocPhanMem();
    }


}
