package com.DoAnTotNghiep.QuanLyPhongMay.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.CaThucHanh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.GhiChu;
import com.DoAnTotNghiep.QuanLyPhongMay.service.GhiChuService;

@RestController
@CrossOrigin
public class GhiChuController {
	 @Autowired
	    private GhiChuService ghiChuService;
	 @PostMapping("/LuuGhiChu")
	    public GhiChu luu(@RequestBody GhiChu ghiChu){
	        return ghiChuService.luu(ghiChu);
	    }
	 @GetMapping("/DSGhiChu")
	    public List<GhiChu> layDSGhiChu(){
	        return ghiChuService.layDSGhiChu();
	    }
	 @GetMapping("/DSGhiChuTheoNgaySua/{ngaySua}")
	    public ResponseEntity<List<GhiChu>> layDSGhiChuTheoNgaySua(
	            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date ngaySua) {
	        List<GhiChu> dsCGhiChu = ghiChuService.layDSGhiChuTheoNgaySua(ngaySua);
	        return new ResponseEntity<>(dsCGhiChu, HttpStatus.OK);
	    }
	 @GetMapping("/DSGhiChuTheoNgayBaoLoi/{ngayBaoLoi}")
	    public ResponseEntity<List<GhiChu>> layDSGhiChuTheoNgayBaoLoi(
	            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date ngayBaoLoi) {
	        List<GhiChu> dsCGhiChu = ghiChuService.layDSGhiChuTheoNgayBaoLoi(ngayBaoLoi);
	        return new ResponseEntity<>(dsCGhiChu, HttpStatus.OK);
	    }
	 @GetMapping("/GhiChu/{maGhiChu}")
	    public GhiChu layGhiChuTheoMa(@PathVariable Long maGhiChu){
	        return ghiChuService.layGhiChuTheoMa(maGhiChu);
	    }
//	    @GetMapping("/DSGhiChuTheoPhongMay/{maPhong}")
//	    public ResponseEntity<List<GhiChu>> layDSGhiChuTheoPhongMay(@PathVariable Long maPhong) {
//	        List<GhiChu> dsCGhiChu = ghiChuService.layDSGhiChuTheoPhongMay(maPhong);
//	        
//	        if (dsCGhiChu.isEmpty()) {
//	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	        }
//
//	        return new ResponseEntity<>(dsCGhiChu, HttpStatus.OK);
//	    }
	    @PutMapping("/CapNhatGhiChu/{maGhiChu}")
	    public GhiChu capNhat(@PathVariable Long maGhiChu, @RequestBody GhiChu ghiChu){
	        GhiChu existingGhiChu = ghiChuService.layGhiChuTheoMa(maGhiChu);
	        if (existingGhiChu != null) {
	        	existingGhiChu.setNgayBaoLoi(ghiChu.getNgayBaoLoi());
	        	existingGhiChu.setNgaySua(ghiChu.getNgaySua());
	            existingGhiChu.setNoiDung(ghiChu.getNoiDung());
	            existingGhiChu.setPhongMay(ghiChu.getPhongMay());
	         

	            return ghiChuService.capNhat(existingGhiChu);
	        } else {
	            return null;
	        }
	    }
	    
	    @DeleteMapping("/XoaGhiChu/{maGhiChu}")
	    public String xoa(@PathVariable Long maGhiChu){
	    	ghiChuService.xoa(maGhiChu);
	        return "Đã xoá chức vụ " + maGhiChu;
	    }
}
