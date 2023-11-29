package com.DoAnTotNghiep.QuanLyPhongMay.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinhThietBi;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.ThietBiMay;
import com.DoAnTotNghiep.QuanLyPhongMay.model.MayTinhModel;
import com.DoAnTotNghiep.QuanLyPhongMay.model.ThietBiMayModel;
import com.DoAnTotNghiep.QuanLyPhongMay.service.MayTinhService;
import com.DoAnTotNghiep.QuanLyPhongMay.service.MayTinhThietBiService;
import com.DoAnTotNghiep.QuanLyPhongMay.service.PhongMayService;

@RestController
@CrossOrigin
public class MayTinhController {

	@Autowired
	private MayTinhService mayTinhService;

	@Autowired
	private PhongMayService phongMayService;

	@Autowired
	private MayTinhThietBiService mayTinhThietBiService;

	@PostMapping("/LuuMayTinh")
	public MayTinh luu(@RequestBody MayTinh mayTinh) {
		System.out.println(mayTinh);
		return mayTinhService.luu(mayTinh);
	}
	@GetMapping("/DSMayTinhtheoTrangThai/{trangThai}")
	public List<MayTinh> getMayTinhsByTrangThai(@PathVariable String trangThai) {
	    return mayTinhService.findByTrangThai(trangThai);
	}

	@GetMapping("/DSMayTinh")
	public List<MayTinh> layDSMayTinh() {
		return mayTinhService.layDSMayTinh();
	}

	@GetMapping("/DSMayTinh2")
	public ResponseEntity<?> layDSMayTinh2() {

		List<MayTinh> mayTinhs = mayTinhService.layDSMayTinh();
		List<MayTinhModel> lst = new ArrayList<>();

		for (MayTinh mayTinh : mayTinhs) {
			System.out.println(mayTinh);
			
			MayTinhModel model = new MayTinhModel();
			model.setMaMay(mayTinh.getMaMay());
			model.setMoTa(mayTinh.getMoTa());
			model.setNgayLapDat(mayTinh.getNgayLapDat());
			PhongMay phongMay = new PhongMay();
			phongMay.setMaPhong(mayTinh.getPhongMay().getMaPhong());
			phongMay.setTenPhong(mayTinh.getPhongMay().getTenPhong());
			phongMay.setTang(mayTinh.getPhongMay().getTang());
			model.setPhongMay(phongMay);
			model.setTrangThai(mayTinh.getTrangThai());

			List<ThietBiMayModel> thietBiMays = new ArrayList<>();
			List<MayTinhThietBi> lstMayTinhThietBi = mayTinhThietBiService.layDSMTTB(model.getMaMay());
			for (MayTinhThietBi mayTinhThietBi : lstMayTinhThietBi) {
				System.out.println(mayTinhThietBi);
				ThietBiMay thietBiMay = mayTinhThietBi.getThietBi();
				boolean trangThai = mayTinhThietBi.isStatus();
				ThietBiMayModel thietBiMayModel = new ThietBiMayModel();
				thietBiMayModel.setMaThietBi(thietBiMay.getMaThietBi());
				thietBiMayModel.setLoaiThietBi(thietBiMay.getLoaiThietBi());
				thietBiMayModel.setNgayCaiDat(thietBiMay.getNgayCaiDat());
				thietBiMayModel.setStatus(thietBiMay.isStatus());
				thietBiMayModel.setTenThietBi(thietBiMay.getTenThietBi());
				thietBiMayModel.setTrangThaiTbi(trangThai);
				thietBiMayModel.setTuoiTho(thietBiMay.getTuoiTho());
				//
				thietBiMays.add(thietBiMayModel);
			}
			model.setThietBiMays(thietBiMays);
			System.out.println(model);
			lst.add(model);
		}
		return ResponseEntity.ok(lst);
	}

	@DeleteMapping("/XoaMayTinh/{maMay}")
	public String xoa(@PathVariable Long maMay) {
		mayTinhService.xoa(maMay);
		return "Đã xoá quyền " + maMay;
	}

	@GetMapping("/MayTinh/{maMay}")
	public MayTinh layMayTinhTheoMa(@PathVariable Long maMay) {
		return mayTinhService.layMayTinhTheoMa(maMay);
	}
}
