package com.DoAnTotNghiep.QuanLyPhongMay.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class MayTinhThietBiPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long mayTinh;
	private Long thietBi;
	@Override
	public int hashCode() {
		return Objects.hash(mayTinh, thietBi);
	}
	public MayTinhThietBiPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MayTinhThietBiPK other = (MayTinhThietBiPK) obj;
		return Objects.equals(mayTinh, other.mayTinh) && Objects.equals(thietBi, other.thietBi);
	}
}
