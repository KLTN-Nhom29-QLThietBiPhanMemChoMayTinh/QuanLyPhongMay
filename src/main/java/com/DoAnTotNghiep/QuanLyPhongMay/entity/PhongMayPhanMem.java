package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@IdClass(PhongMayPhanMemPK.class)
@Table(name = "phongmay_phanmem")
public class PhongMayPhanMem {

	 	@Id
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "ma_phong")
	    private PhongMay phongMay;

	    @Id
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "ma_phanmem")
	    private PhanMem phanMem;

	    @JoinColumn(name = "status", columnDefinition = "boolean default true")
	    private boolean status;
	    
	    
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public PhongMayPhanMem(PhongMay phongMay, PhanMem phanMem, boolean status) {
		super();
		this.phongMay = phongMay;
		this.phanMem = phanMem;
		this.status = status;
	}

	public PhongMayPhanMem() {
		super();
	}

	@Override
	public String toString() {
		return "PhongMayPhanMem [phongMay=" + phongMay + ", phanMem=" + phanMem + ", status=" + status + "]";
	}

}
