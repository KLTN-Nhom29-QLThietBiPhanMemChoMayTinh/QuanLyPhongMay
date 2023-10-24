package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class MonHocPhanMemPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long monHoc;
	private Long phanMem;
	@Override
	public int hashCode() {
		return Objects.hash(monHoc, phanMem);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MonHocPhanMemPK other = (MonHocPhanMemPK) obj;
		return Objects.equals(monHoc, other.monHoc) && Objects.equals(phanMem, other.phanMem);
	}
	public MonHocPhanMemPK() {
	}
	

}
