package com.DoAnTotNghiep.QuanLyPhongMay.entity;
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
    @Column(name = "trang_thai")
    private String trangThai;
    @Column(name = "mo_ta")
    private String moTa;
    @Column(name = "phien_ban")
    private String phienBan;
	public Long getMaPhanMem() {
		return maPhanMem;
	}
	public String getPhienBan() {
		return phienBan;
	}
	public void setPhienBan(String phienBan) {
		this.phienBan = phienBan;
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
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public PhanMem(Long maPhanMem, String tenPhanMem, String trangThai, String moTa, String phienBan) {
		super();
		this.maPhanMem = maPhanMem;
		this.tenPhanMem = tenPhanMem;
		this.trangThai = trangThai;
		this.moTa = moTa;
		this.phienBan = phienBan;
	}
	public PhanMem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PhanMem [maPhanMem=" + maPhanMem + ", tenPhanMem=" + tenPhanMem + ", trangThai=" + trangThai + ", moTa="
				+ moTa + ", phienBan=" + phienBan + "]";
	}
    

}
