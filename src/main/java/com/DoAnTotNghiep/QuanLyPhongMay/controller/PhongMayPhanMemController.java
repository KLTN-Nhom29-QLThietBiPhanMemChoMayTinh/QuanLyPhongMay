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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMayPhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.PhongMayPhanMemRepository2;
import com.DoAnTotNghiep.QuanLyPhongMay.service.PhongMayPhanMemService;

@RestController
@CrossOrigin
public class PhongMayPhanMemController {
	
	@Autowired
    private PhongMayPhanMemService phongMayPhanMemService;

	@Autowired
	private PhongMayPhanMemRepository2 mayPhanMemRepository2;
	
    @PostMapping("/LuuPhongMayPhanMem")
    public PhongMayPhanMem luu(@RequestBody PhongMayPhanMem PhongMayPhanMem){
        return mayPhanMemRepository2.save(PhongMayPhanMem);
    }

    @GetMapping("/DSPhongMayPhanMemTheoMaPhong/{maPhong}")
    public List<PhongMayPhanMem> layDSPhongMayPhanMem(@PathVariable Long maPhong){
        return phongMayPhanMemService.layDSPMPM(maPhong);
    }
    @GetMapping("/DSPhongMayPhanMemTheoMaPhanMem/{maPhanMem}")
    public List<PhongMayPhanMem> layDSPhongMayPhanMemTheoMaPhanMem(@PathVariable Long maPhanMem){
        return phongMayPhanMemService.layDSPMPMTheoMaPhanMem(maPhanMem);
    }
    @GetMapping("DSPhongMayPhanMemtheoTrangThai/{status}")
    public List<PhongMayPhanMem> getPhongMayPhanMemsByStatus(@PathVariable boolean status) {
        return phongMayPhanMemService.findByStatus(status);
    }
    @DeleteMapping("/XoaPhongMayPhanMem/{maPhong}/{maPhanMem}")
    public String xoa(@PathVariable Long maPhong,@PathVariable Long maPhanMem){
    	phongMayPhanMemService.xoa(maPhong, maPhanMem);
//    	PhongMayPhanMem mayPhanMem = new PhongMayPhanMem();
//    	PhongMay phongMay = new PhongMay();
//    	phongMay.setMaPhong(maPhong);
//    	PhanMem phanMem = new PhanMem();
//    	phanMem.setMaPhanMem(maPhanMem);
//    	mayPhanMem.setPhanMem(phanMem);
//    	mayPhanMem.setPhongMay(phongMay);
//    	mayPhanMemRepository2.delete(mayPhanMem);
        return "Đã xoá quyền " + maPhong + "Đã xoá quyền" +maPhanMem;
    }
    
    @GetMapping("/DanhSachPhongMayPhanMem")
    public List<PhongMayPhanMem> layDanhSachPhongMayPhanMem() {
        return phongMayPhanMemService.layDanhSachPhongMayPhanMem();
    }

}
