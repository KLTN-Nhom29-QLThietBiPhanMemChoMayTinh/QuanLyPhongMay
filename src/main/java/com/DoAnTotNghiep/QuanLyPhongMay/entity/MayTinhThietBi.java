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
@IdClass(MayTinhThietBiPK.class)
@Table(name = "maytinh_thietbi")
public class MayTinhThietBi {
	@Id
	@ManyToOne
	@JoinColumn(name = "ma_may")
	private MayTinh mayTinh;
	@Id
	@ManyToOne
	@JoinColumn(name = "ma_thiet_bi")
	private ThietBiMay thietBi;

	@JoinColumn(name = "status", columnDefinition = "boolean default true")
	private boolean status = true;

	public MayTinhThietBi(MayTinh mayTinh, ThietBiMay thietBi, boolean status) {
		super();
		this.mayTinh = mayTinh;
		this.thietBi = thietBi;
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public MayTinh getMayTinh() {
		return mayTinh;
	}

	public void setMayTinh(MayTinh mayTinh) {
		this.mayTinh = mayTinh;
	}

	public ThietBiMay getThietBi() {
		return thietBi;
	}

	public void setThietBi(ThietBiMay thietBi) {
		this.thietBi = thietBi;
	}

	public MayTinhThietBi(MayTinh mayTinh, ThietBiMay thietBi) {
		super();
		this.mayTinh = mayTinh;
		this.thietBi = thietBi;
	}

	public MayTinhThietBi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MayTinhThietBi [mayTinh=" + mayTinh + ", thietBi=" + thietBi + "]";
	}

}
