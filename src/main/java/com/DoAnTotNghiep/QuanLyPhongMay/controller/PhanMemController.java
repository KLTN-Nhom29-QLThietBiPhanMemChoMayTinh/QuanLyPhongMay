package com.DoAnTotNghiep.QuanLyPhongMay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;
import com.DoAnTotNghiep.QuanLyPhongMay.service.PhanMemService;

@RestController
@CrossOrigin
public class PhanMemController {
	
	@Autowired
    private PhanMemService phanMemService;

    @PostMapping("/LuuPhanMem")
    public PhanMem luu(@RequestBody PhanMem phanMem){
        return phanMemService.luu(phanMem);
    }

    @GetMapping("/DSPhanMem")
    public List<PhanMem> layDSPhanMem(){
        return phanMemService.layDSPhanMem();
    }
    @GetMapping("/DSPhanMemtheoTrangThai/{trangThai}")
    public List<PhanMem> getPhanMemsByTrangThai(@PathVariable boolean trangThai) {
        return phanMemService.findByTrangThai(trangThai);
    }

    @DeleteMapping("/XoaPhanMem/{maPhanMem}")
    public String xoa(@PathVariable Long maPhanMem){
        phanMemService.xoa(maPhanMem);
        return "Đã xoá quyền " + maPhanMem;
    }
    @GetMapping("/PhanMem/{maPhanMem}")
    public PhanMem layTangTheoMa(@PathVariable Long maPhanMem) {
        return phanMemService.layPhanMemTheoMa(maPhanMem);
    }
}
