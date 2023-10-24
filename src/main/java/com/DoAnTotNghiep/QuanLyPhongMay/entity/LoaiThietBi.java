package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loai_thiet_bi")
public class LoaiThietBi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_loai")
    private Long maLoai;
    @Column(name="ten_loai")
    private String tenLoai;
	public Long getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(Long maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public LoaiThietBi(Long maLoai, String tenLoai) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
	}
	public LoaiThietBi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoaiThietBi [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
	}
    
}
