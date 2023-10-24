package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class PhongMayPhanMemPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long phongMay;
    private Long phanMem;
	@Override
	public int hashCode() {
		return Objects.hash(phongMay,phanMem);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongMayPhanMemPK other = (PhongMayPhanMemPK) obj;
		return Objects.equals(phongMay, other.phongMay) && Objects.equals(phanMem, other.phanMem);
	}
	public PhongMayPhanMemPK() {

	}
    
	
}
