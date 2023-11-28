package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ghi_chu")
public class GhiChu {
	//Ghi chú:( mã ghi chú, mã phòng, ngày báo lỗi,ngày sửa, nội dung)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_ghichu")
    private Long maGhiChu;

    @Column(name = "noi_dung", columnDefinition = "nvarchar(50)")
    private String noiDung;

    @ManyToOne
	@JoinColumn(name = "ma_phong")
	private PhongMay phongMay;

    @Column(name = "ngay_bao_loi")
    @Temporal(TemporalType.DATE)
    private Date ngayBaoLoi;

    @Column(name = "ngay_sua")
    @Temporal(TemporalType.DATE)
    private Date ngaySua;

	public Long getMaGhiChu() {
		return maGhiChu;
	}

	
	public void setMaGhiChu(Long maGhiChu) {
		this.maGhiChu = maGhiChu;
	}


	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public PhongMay getPhongMay() {
		return phongMay;
	}

	public void setPhongMay(PhongMay phongMay) {
		this.phongMay = phongMay;
	}

	public Date getNgayBaoLoi() {
		return ngayBaoLoi;
	}

	public void setNgayBaoLoi(Date ngayBaoLoi) {
		this.ngayBaoLoi = ngayBaoLoi;
	}

	public Date getNgaySua() {
		return ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	public GhiChu(Long maGhiChu, String noiDung, PhongMay phongMay, Date ngayBaoLoi, Date ngaySua) {
		super();
		this.maGhiChu = maGhiChu;
		this.noiDung = noiDung;
		this.phongMay = phongMay;
		this.ngayBaoLoi = ngayBaoLoi;
		this.ngaySua = ngaySua;
	}
	
	@Override
	public String toString() {
	    return String.format("GhiChu [maGhiChu=%d, noiDung=%s, phongMay=%d, ngayBaoLoi=%tF, ngaySua=%tF]",
	            maGhiChu, noiDung, phongMay != null ? phongMay.getTenPhong() : "null",
	            ngayBaoLoi, ngaySua);
	}

}
