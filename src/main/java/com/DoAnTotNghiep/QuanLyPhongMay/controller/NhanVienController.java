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

import com.DoAnTotNghiep.QuanLyPhongMay.entity.NhanVien;
import com.DoAnTotNghiep.QuanLyPhongMay.service.NhanVienService;

@RestController
@CrossOrigin
public class NhanVienController {

	@Autowired
	private NhanVienService nhanVienService;

	@GetMapping("/DSNhanVien")
	public List<NhanVien> layDSNV(){
		return nhanVienService.layDSNV();
	}

	@GetMapping("/NhanVien/{maNV}")
	public NhanVien layNVTheoMa(@PathVariable Long maNV){
		return nhanVienService.layNVTheoMa(maNV);
	}
	
	@PostMapping("/LuuNhanVien")
	public NhanVien luu(@RequestBody NhanVien nhanVien) {
		return nhanVienService.luu(nhanVien);
	}

	@DeleteMapping("/XoaNhanVien/{maNV}")
	public String xoa(@PathVariable Long maNV) {
		nhanVienService.xoa(maNV);
		return "Đã xoá nhân viên " + maNV;
	}
}
