package com.xiaoshu.entity;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class Stu {

	@Id
	private Integer sid;
	private String sname;
	private String ssex;
	private String shobby;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sbirth;
	private Integer mid;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getShobby() {
		return shobby;
	}
	public void setShobby(String shobby) {
		this.shobby = shobby;
	}
	public Date getSbirth() {
		return sbirth;
	}
	public void setSbirth(Date sbirth) {
		this.sbirth = sbirth;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", sname=" + sname + ", ssex=" + ssex + ", shobby=" + shobby + ", sbirth=" + sbirth
				+ ", mid=" + mid + "]";
	}
	public Stu(Integer sid, String sname, String ssex, String shobby, Date sbirth, Integer mid) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.shobby = shobby;
		this.sbirth = sbirth;
		this.mid = mid;
	}
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
