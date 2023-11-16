package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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


}
