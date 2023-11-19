package com.DoAnTotNghiep.QuanLyPhongMay.model;

import java.util.Date;
import java.util.List;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.ThietBiMay;

public class MayTinhModel {
	private Long maMay;
	private String trangThai = "Đang hoạt động";
	private String moTa;
	private Date ngayLapDat;
	private PhongMay phongMay;
	private List<ThietBiMayModel> thietBiMays;
	//
	public Long getMaMay() {
		return maMay;
	}
	public void setMaMay(Long maMay) {
		this.maMay = maMay;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public Date getNgayLapDat() {
		return ngayLapDat;
	}
	public void setNgayLapDat(Date ngayLapDat) {
		this.ngayLapDat = ngayLapDat;
	}
	public PhongMay getPhongMay() {
		return phongMay;
	}
	public void setPhongMay(PhongMay phongMay) {
		this.phongMay = phongMay;
	}
	public List<ThietBiMayModel> getThietBiMays() {
		return thietBiMays;
	}
	public void setThietBiMays(List<ThietBiMayModel> thietBiMays) {
		this.thietBiMays = thietBiMays;
	}
	public MayTinhModel(Long maMay, String trangThai, String moTa, Date ngayLapDat, PhongMay phongMay,
			List<ThietBiMayModel> thietBiMays) {
		super();
		this.maMay = maMay;
		this.trangThai = trangThai;
		this.moTa = moTa;
		this.ngayLapDat = ngayLapDat;
		this.phongMay = phongMay;
		this.thietBiMays = thietBiMays;
	}
	public MayTinhModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MayTinhModel [maMay=" + maMay + ", trangThai=" + trangThai + ", moTa=" + moTa + ", ngayLapDat="
				+ ngayLapDat + ", phongMay=" + phongMay + ", thietBiMays=" + thietBiMays + "]";
	}


}
