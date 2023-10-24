package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "mon_hoc")
public class MonHoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_mon")
    private Long maMon;

    @Column(name = "ten_mon")
    private String tenMon;

    @Column(name = "ngay_bat_dau")
    private Date ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private Date ngayKetThuc;
    
    @OneToMany(mappedBy = "monHoc")
    private List<CaThucHanh> caThucHanhs;

	public Long getMaMon() {
		return maMon;
	}

	public void setMaMon(Long maMon) {
		this.maMon = maMon;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public List<CaThucHanh> getCaThucHanhs() {
		return caThucHanhs;
	}

	public void setCaThucHanhs(List<CaThucHanh> caThucHanhs) {
		this.caThucHanhs = caThucHanhs;
	}

	public MonHoc(Long maMon, String tenMon, Date ngayBatDau, Date ngayKetThuc, List<CaThucHanh> caThucHanhs) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.caThucHanhs = caThucHanhs;
	}

	public MonHoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MonHoc [maMon=" + maMon + ", tenMon=" + tenMon + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc="
				+ ngayKetThuc + ", caThucHanhs=" + caThucHanhs + "]";
	}
    
    
    
}
