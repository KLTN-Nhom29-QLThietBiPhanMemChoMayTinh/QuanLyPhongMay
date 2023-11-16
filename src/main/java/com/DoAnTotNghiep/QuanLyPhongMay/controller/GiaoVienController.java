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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.GiaoVien;
import com.DoAnTotNghiep.QuanLyPhongMay.service.GiaoVienService;

@RestController
@CrossOrigin
public class GiaoVienController {

	@Autowired
	private GiaoVienService giaoVienService;

	@GetMapping("/DSGiaoVien")
	public List<GiaoVien> layDSGV(){
		return giaoVienService.layDSGV();
	}

	@GetMapping("/GiaoVien/{maGiaoVien}")
	public GiaoVien layGVTheoMa(@PathVariable String maGiaoVien){
		return giaoVienService.layGVTheoMa(maGiaoVien);
	}
	
	@PostMapping("/LuuGiaoVien")
	public GiaoVien luu(@RequestBody GiaoVien giaoVien) {
		return giaoVienService.luu(giaoVien);
	}

	@DeleteMapping("/XoaGiaoVien/{maGiaoVien}")
	public String xoa(@PathVariable String maGiaoVien) {
		giaoVienService.xoa(maGiaoVien);
		return "Đã xoá nhân viên " + maGiaoVien;
	}
}
