package com.DoAnTotNghiep.QuanLyPhongMay.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tang")
public class Tang {
	 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_tang")
    private Long maTang;
	
	@Column(name = "ten_tang", columnDefinition = "nvarchar(50)", nullable = false)
	private String tenTang;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "ma_toanha")
	private ToaNha toaNha;

	public Long getMaTang() {
		return maTang;
	}

	public void setMaTang(Long maTang) {
		this.maTang = maTang;
	}

	public String getTenTang() {
		return tenTang;
	}

	public void setTenTang(String tenTang) {
		this.tenTang = tenTang;
	}

	public ToaNha getToaNha() {
		return toaNha;
	}

	public void setToaNha(ToaNha toaNha) {
		this.toaNha = toaNha;
	}

	public Tang(Long maTang, String tenTang, ToaNha toaNha) {
		super();
		this.maTang = maTang;
		this.tenTang = tenTang;
		this.toaNha = toaNha;
	}

	public Tang() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return String.format("Tang [maTang=%d, tenTang=%s, toaNha=%d]",
                maTang, tenTang, toaNha != null ? toaNha.getMaToaNha() : "null");
    }

	
}
