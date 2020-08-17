package com.xiaoshu.entity;

import javax.persistence.Id;

public class Major {

	@Id
	private Integer mid;
	private String mname;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Major [mid=" + mid + ", mname=" + mname + "]";
	}
	public Major(Integer mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
	public Major() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
