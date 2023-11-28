package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PhanMem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_phanmem")
	private Long maPhanMem;
	@Column(name = "ten_phanmem", columnDefinition = "nvarchar(100)", nullable = false)
	private String tenPhanMem;
	@Column(name = "trang_thai", columnDefinition = "boolean default true")
	private boolean trangThai;
	@Column(name = "mo_ta", columnDefinition = "nvarchar(500)")
	private String moTa;
	@Column(name = "phien_ban")
	private String phienBan;
	@Column(name = "tuoi_tho")
	private double tuoiTho;
	@Column(name = "ngay_cai_dat")
	private Date ngayCaiDat;

	public Long getMaPhanMem() {
		return maPhanMem;
	}


	public double getTuoiTho() {
		return tuoiTho;
	}

	public void setTuoiTho(double tuoiTho) {
		this.tuoiTho = tuoiTho;
	}

	public void setMaPhanMem(Long maPhanMem) {
		this.maPhanMem = maPhanMem;
	}

	public String getTenPhanMem() {
		return tenPhanMem;
	}

	public void setTenPhanMem(String tenPhanMem) {
		this.tenPhanMem = tenPhanMem;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getPhienBan() {
		return phienBan;
	}

	public void setPhienBan(String phienBan) {
		this.phienBan = phienBan;
	}

	public Date getNgayCaiDat() {
		return ngayCaiDat;
	}

	public void setNgayCaiDat(Date ngayCaiDat) {
		this.ngayCaiDat = ngayCaiDat;
	}

	

	public PhanMem(Long maPhanMem, String tenPhanMem, boolean trangThai, String moTa, String phienBan, double tuoiTho,
			Date ngayCaiDat) {
		super();
		this.maPhanMem = maPhanMem;
		this.tenPhanMem = tenPhanMem;
		this.trangThai = trangThai;
		this.moTa = moTa;
		this.phienBan = phienBan;
		this.tuoiTho = tuoiTho;
		this.ngayCaiDat = ngayCaiDat;
	}

	public PhanMem() {
		super();
	}


	@Override
	public String toString() {
		return "PhanMem [maPhanMem=" + maPhanMem + ", tenPhanMem=" + tenPhanMem + ", trangThai=" + trangThai + ", moTa="
				+ moTa + ", phienBan=" + phienBan + ", tuoiTho=" + tuoiTho + ", ngayCaiDat=" + ngayCaiDat + "]";
	}
	
}
