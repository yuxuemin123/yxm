package com.xiaoshu.entity;

import javax.persistence.Id;

public class Tbmajorday {

	@Id
	private Integer mdid;
	private String mdname;
	public Integer getMdid() {
		return mdid;
	}
	public void setMdid(Integer mdid) {
		this.mdid = mdid;
	}
	public String getMdname() {
		return mdname;
	}
	public void setMdname(String mdname) {
		this.mdname = mdname;
	}
	@Override
	public String toString() {
		return "Tbmajorday [mdid=" + mdid + ", mdname=" + mdname + "]";
	}
	public Tbmajorday(Integer mdid, String mdname) {
		super();
		this.mdid = mdid;
		this.mdname = mdname;
	}
	public Tbmajorday() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
