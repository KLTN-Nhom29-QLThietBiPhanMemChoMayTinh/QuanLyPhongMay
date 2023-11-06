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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ToaNha;
import com.DoAnTotNghiep.QuanLyPhongMay.service.ToaNhaService;

@RestController
@CrossOrigin
public class ToaNhaController {
	
	@Autowired
    private ToaNhaService toaNhaService;

    @PostMapping("/LuuToaNha")
    public ToaNha luu(@RequestBody ToaNha toaNha){
        return toaNhaService.luu(toaNha);
    }

    @GetMapping("/DSToaNha")
    public List<ToaNha> layDSToaNha(){
        return toaNhaService.layDSToaNha();
    }

    @DeleteMapping("/XoaToaNha/{maToaNha}")
    public String xoa(@PathVariable Long maToaNha){
        toaNhaService.xoa(maToaNha);
        return "Đã xoá quyền " + maToaNha;
    }

}
