package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "nhan_vien")
public class NhanVien {
	
	@Id
	@Column(name = "ma_nv")
	private String maNV;

	@Column(name = "ten_nv", columnDefinition = "nvarchar(100)", nullable = false)
	private String tenNV;
	
	@Column(name = "email", columnDefinition = "nvarchar(100)")
	private String email;

	@Column(name = "sdt", columnDefinition = "varchar(10)")
	private String sDT;

	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "ma_cv", nullable = false)
	private ChucVu chucVu;
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "ma_nv")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private TaiKhoan taiKhoan;
	

	public NhanVien(String maNV, String tenNV, String email, String sDT) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.email = email;
		this.sDT = sDT;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getsDT() {
		return sDT;
	}

	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	
	public ChucVu getChucVu() {
		return chucVu;
	}

	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public NhanVien() {
	}

	public NhanVien(String maNV, String tenNV, String gioiTinh, String email, String soCMND, String sDT,
			String duongDanHinh, ChucVu chucVu, TaiKhoan taiKhoan) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.email = email;
		this.sDT = sDT;
		this.chucVu = chucVu;
		this.taiKhoan = taiKhoan;
	}

	@Override
	public String toString() {
	    return String.format("NhanVien [maNV=%s, tenNV=%s, email=%s, sDT=%s, chucVu=%s, taiKhoan=%s]",
	        maNV, tenNV, email, sDT, chucVu != null ? chucVu.getTenCV() : "null",
	        taiKhoan != null ? taiKhoan.getMaTK() : "null");
	}

	
}
