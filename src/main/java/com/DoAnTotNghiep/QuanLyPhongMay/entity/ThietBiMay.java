package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "thiet_bi_may")
public class ThietBiMay {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_thiet_bi")
    private Long maThietBi;

    @Column(name = "ten_thiet_bi")
    private String tenThietBi;

    @Column(name = "tuoi_tho")
    private double tuoiTho;

	@Column(name = "ngay_cai_dat", columnDefinition = "DATETIME")
	private Date ngayCaiDat;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "ma_may")
    private MayTinh mayTinh;

    
	public Date getNgayCaiDat() {
		return ngayCaiDat;
	}


	public void setNgayCaiDat(Date ngayCaiDat) {
		this.ngayCaiDat = ngayCaiDat;
	}


	@ManyToOne
	@JoinColumn(name = "ma_loai", nullable = false)
	private LoaiThietBi loaiThietBi;


	public Long getMaThietBi() {
		return maThietBi;
	}


	public void setMaThietBi(Long maThietBi) {
		this.maThietBi = maThietBi;
	}


	public String getTenThietBi() {
		return tenThietBi;
	}


	public void setTenThietBi(String tenThietBi) {
		this.tenThietBi = tenThietBi;
	}


	public double getTuoiTho() {
		return tuoiTho;
	}


	public void setTuoiTho(double tuoiTho) {
		this.tuoiTho = tuoiTho;
	}


	public MayTinh getMayTinh() {
		return mayTinh;
	}


	public void setMayTinh(MayTinh mayTinh) {
		this.mayTinh = mayTinh;
	}


	public LoaiThietBi getLoaiThietBi() {
		return loaiThietBi;
	}


	public void setLoaiThietBi(LoaiThietBi loaiThietBi) {
		this.loaiThietBi = loaiThietBi;
	}


	public ThietBiMay(Long maThietBi, String tenThietBi, double tuoiTho, Date ngayCaiDat, MayTinh mayTinh,
			LoaiThietBi loaiThietBi) {
		super();
		this.maThietBi = maThietBi;
		this.tenThietBi = tenThietBi;
		this.tuoiTho = tuoiTho;
		this.ngayCaiDat = ngayCaiDat;
		this.mayTinh = mayTinh;
		this.loaiThietBi = loaiThietBi;
	}


	public ThietBiMay() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "ThietBiMay [maThietBi=" + maThietBi + ", tenThietBi=" + tenThietBi + ", tuoiTho=" + tuoiTho
				+ ", ngayCaiDat=" + ngayCaiDat + ", mayTinh=" + mayTinh + ", loaiThietBi=" + loaiThietBi + "]";
	}
	
	
    
}
