package com.DoAnTotNghiep.QuanLyPhongMay.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "toa_nha")
public class ToaNha {
	 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_toanha")
    private Long maToaNha;
	
	@Column(name = "ten_toanha", columnDefinition = "nvarchar(50)", nullable = false)
	private String tenToaNha;

	  @Column(name = "so_tang")
	  private int soTang;
	
	public Long getMaToaNha() {
		return maToaNha;
	}

	public void setMaToaNha(Long maToaNha) {
		this.maToaNha = maToaNha;
	}

	public String getTenToaNha() {
		return tenToaNha;
	}

	public void setTenToaNha(String tenToaNha) {
		this.tenToaNha = tenToaNha;
	}

	public int getSoTang() {
		return soTang;
	}

	public void setSoTang(int soTang) {
		this.soTang = soTang;
	}

	public ToaNha(Long maToaNha, String tenToaNha, int soTang) {
		super();
		this.maToaNha = maToaNha;
		this.tenToaNha = tenToaNha;
		this.soTang = soTang;
	}

	public ToaNha() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ToaNha [maToaNha=" + maToaNha + ", tenToaNha=" + tenToaNha + ", soTang=" + soTang + "]";
	}


}

