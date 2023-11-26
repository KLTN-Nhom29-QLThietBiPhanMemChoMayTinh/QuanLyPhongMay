package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(MonHocPhanMemPK.class)
@Table(name = "monhoc_phanmem")
public class MonHocPhanMem {

	  @Id
	  @ManyToOne(cascade = CascadeType.ALL)

	  @JoinColumn(name = "ma_phanmem")
	  private PhanMem phanMem;
	  @Id
	  @ManyToOne(cascade = CascadeType.ALL)

	  @JoinColumn(name = "ma_mon")
	  private MonHoc monHoc;
	public PhanMem getPhanMem() {
		return phanMem;
	}
	public void setPhanMem(PhanMem phanMem) {
		this.phanMem = phanMem;
	}
	public MonHoc getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}
	public MonHocPhanMem(PhanMem phanMem, MonHoc monHoc) {
		super();
		this.phanMem = phanMem;
		this.monHoc = monHoc;
	}
	public MonHocPhanMem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MonHocPhanMem [phanMem=" + phanMem + ", monHoc=" + monHoc + "]";
	}
	
}
