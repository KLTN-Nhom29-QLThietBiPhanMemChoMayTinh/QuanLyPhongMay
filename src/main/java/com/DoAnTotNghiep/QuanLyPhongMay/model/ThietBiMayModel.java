package com.DoAnTotNghiep.QuanLyPhongMay.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LoaiThietBi;

public class ThietBiMayModel {
	private Long maThietBi;
	private String tenThietBi;
	private double tuoiTho;
	private Date ngayCaiDat;
	// true: dang su dung
	// false : bi hỏng
	private boolean status = true;
	private LoaiThietBi loaiThietBi;
	private boolean trangThaiTbi;
	//
	public Long getMaThietBi() {
		return maThietBi;
	}
	public void setMaThietBi(Long maThietBi) {
		this.maThietBi = maThietBi;
	}
	public String getTenThietBi() {
		return tenThietBi;
	}
	public void setTenThietBi(String tenThietBi) {
		this.tenThietBi = tenThietBi;
	}
	public double getTuoiTho() {
		return tuoiTho;
	}
	public void setTuoiTho(double tuoiTho) {
		this.tuoiTho = tuoiTho;
	}
	public Date getNgayCaiDat() {
		return ngayCaiDat;
	}
	public void setNgayCaiDat(Date ngayCaiDat) {
		this.ngayCaiDat = ngayCaiDat;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LoaiThietBi getLoaiThietBi() {
		return loaiThietBi;
	}
	public void setLoaiThietBi(LoaiThietBi loaiThietBi) {
		this.loaiThietBi = loaiThietBi;
	}
	public boolean isTrangThaiTbi() {
		return trangThaiTbi;
	}
	public void setTrangThaiTbi(boolean trangThaiTbi) {
		this.trangThaiTbi = trangThaiTbi;
	}
	public ThietBiMayModel(Long maThietBi, String tenThietBi, double tuoiTho, Date ngayCaiDat, boolean status,
			LoaiThietBi loaiThietBi, boolean trangThaiTbi) {
		super();
		this.maThietBi = maThietBi;
		this.tenThietBi = tenThietBi;
		this.tuoiTho = tuoiTho;
		this.ngayCaiDat = ngayCaiDat;
		this.status = status;
		this.loaiThietBi = loaiThietBi;
		this.trangThaiTbi = trangThaiTbi;
	}
	public ThietBiMayModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ThietBiMayModel [maThietBi=" + maThietBi + ", tenThietBi=" + tenThietBi + ", tuoiTho=" + tuoiTho
				+ ", ngayCaiDat=" + ngayCaiDat + ", status=" + status + ", loaiThietBi=" + loaiThietBi
				+ ", trangThaiTbi=" + trangThaiTbi + "]";
	}
	
}
