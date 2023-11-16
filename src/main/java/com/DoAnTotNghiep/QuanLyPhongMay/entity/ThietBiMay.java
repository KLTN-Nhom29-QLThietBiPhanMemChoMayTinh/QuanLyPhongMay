package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "thiet_bi_may")
public class ThietBiMay {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_thiet_bi")
	private Long maThietBi;

	@Column(name = "ten_thiet_bi")
	private String tenThietBi;

	@Column(name = "tuoi_tho")
	private double tuoiTho;

	@Column(name = "ngay_cai_dat", columnDefinition = "DATETIME")
	private Date ngayCaiDat;

	// true: dang su dung
	// false : bi hỏng
	@JoinColumn(name = "status", columnDefinition = "boolean default true")
	private boolean status = true;

	@ManyToOne
	@JoinColumn(name = "ma_loai", nullable = false)
	private LoaiThietBi loaiThietBi;

	public boolean isStatus() {
		return status;
	}

	public ThietBiMay(Long maThietBi, String tenThietBi, double tuoiTho, Date ngayCaiDat, boolean status,
			LoaiThietBi loaiThietBi) {
		super();
		this.maThietBi = maThietBi;
		this.tenThietBi = tenThietBi;
		this.tuoiTho = tuoiTho;
		this.ngayCaiDat = ngayCaiDat;
		this.status = status;
		this.loaiThietBi = loaiThietBi;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ThietBiMay(Long maThietBi, String tenThietBi, double tuoiTho, Date ngayCaiDat, LoaiThietBi loaiThietBi) {
		super();
		this.maThietBi = maThietBi;
		this.tenThietBi = tenThietBi;
		this.tuoiTho = tuoiTho;
		this.ngayCaiDat = ngayCaiDat;
		this.loaiThietBi = loaiThietBi;
	}

	public Date getNgayCaiDat() {
		return ngayCaiDat;
	}

	public void setNgayCaiDat(Date ngayCaiDat) {
		this.ngayCaiDat = ngayCaiDat;
	}

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

	public LoaiThietBi getLoaiThietBi() {
		return loaiThietBi;
	}

	public void setLoaiThietBi(LoaiThietBi loaiThietBi) {
		this.loaiThietBi = loaiThietBi;
	}

	public ThietBiMay(Long maThietBi, String tenThietBi, double tuoiTho, LoaiThietBi loaiThietBi) {
		super();
		this.maThietBi = maThietBi;
		this.tenThietBi = tenThietBi;
		this.tuoiTho = tuoiTho;
		this.loaiThietBi = loaiThietBi;
	}

	public ThietBiMay() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ThietBiMay [maThietBi=" + maThietBi + ", tenThietBi=" + tenThietBi + ", tuoiTho=" + tuoiTho
				+ ", ngayCaiDat=" + ngayCaiDat + ", status=" + status + ", loaiThietBi=" + loaiThietBi + "]";
	}

}
