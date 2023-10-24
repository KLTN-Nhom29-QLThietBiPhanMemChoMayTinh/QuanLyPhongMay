package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(PhongMayPhanMemPK.class)
@Table(name = "phongmay_phanmem")
public class PhongMayPhanMem {

    @Id
    @ManyToOne
    @JoinColumn(name = "ma_phong")
    private PhongMay phongMay;
    @Id
    @ManyToOne
    @JoinColumn(name = "ma_phanmem")
    private PhanMem phanMem;

    @Column(name = "ngay_cai_dat")
    private Date ngayCaiDat;

	public PhongMay getPhongMay() {
		return phongMay;
	}

	public void setPhongMay(PhongMay phongMay) {
		this.phongMay = phongMay;
	}

	public PhanMem getPhanMem() {
		return phanMem;
	}

	public void setPhanMem(PhanMem phanMem) {
		this.phanMem = phanMem;
	}

	public Date getNgayCaiDat() {
		return ngayCaiDat;
	}

	public void setNgayCaiDat(Date ngayCaiDat) {
		this.ngayCaiDat = ngayCaiDat;
	}

	public PhongMayPhanMem(PhongMay phongMay, PhanMem phanMem, Date ngayCaiDat) {
		super();
		this.phongMay = phongMay;
		this.phanMem = phanMem;
		this.ngayCaiDat = ngayCaiDat;
	}

	public PhongMayPhanMem() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PhongMayPhanMem [phongMay=" + phongMay + ", phanMem=" + phanMem + ", ngayCaiDat=" + ngayCaiDat + "]";
	}
    
    
   
}
