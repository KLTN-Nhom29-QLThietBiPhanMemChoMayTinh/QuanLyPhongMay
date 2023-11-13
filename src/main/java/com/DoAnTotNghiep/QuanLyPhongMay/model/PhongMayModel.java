package com.DoAnTotNghiep.QuanLyPhongMay.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.MayTinh;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhanMem;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.PhongMay;

public class PhongMayModel {
	private Long maPhong;
    private String tenPhong;
    private int soMay;
    private String moTa;
    private String trangThai= "Trống";
	private Tang tang;
	private List<PhanMem> phanMems = new ArrayList<>();
	private List<MayTinh> mayTinhs;
	public Long getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(Long maPhong) {
		this.maPhong = maPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public int getSoMay() {
		return soMay;
	}
	public void setSoMay(int soMay) {
		this.soMay = soMay;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public Tang getTang() {
		return tang;
	}
	public void setTang(Tang tang) {
		this.tang = tang;
	}
	public List<PhanMem> getPhanMems() {
		return phanMems;
	}
	public void setPhanMems(List<PhanMem> phanMems) {
		this.phanMems = phanMems;
	}
	public List<MayTinh> getMayTinhs() {
		return mayTinhs;
	}
	public void setMayTinhs(List<MayTinh> mayTinhs) {
		this.mayTinhs = mayTinhs;
	}
	public PhongMayModel(Long maPhong, String tenPhong, int soMay, String moTa, String trangThai, Tang tang,
			List<PhanMem> phanMems, List<MayTinh> mayTinhs) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.soMay = soMay;
		this.moTa = moTa;
		this.trangThai = trangThai;
		this.tang = tang;
		this.phanMems = phanMems;
		this.mayTinhs = mayTinhs;
	}
	public PhongMayModel(Long maPhong, String tenPhong, int soMay, String moTa, String trangThai, Tang tang,
			List<MayTinh> mayTinhs) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.soMay = soMay;
		this.moTa = moTa;
		this.trangThai = trangThai;
		this.tang = tang;
		this.mayTinhs = mayTinhs;
	}
	public PhongMayModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// 
	

}
