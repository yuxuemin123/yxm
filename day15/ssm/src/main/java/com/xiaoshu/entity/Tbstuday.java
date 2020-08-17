package com.xiaoshu.entity;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

public class Tbstuday {

	@Id
	private Integer sdid;
	private String sdname;
	private String sdsex;
	private String sdhobby;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sdbirth;
	@Transient
	private Integer mid;
	public Integer getSdid() {
		return sdid;
	}
	public void setSdid(Integer sdid) {
		this.sdid = sdid;
	}
	public String getSdname() {
		return sdname;
	}
	public void setSdname(String sdname) {
		this.sdname = sdname;
	}
	public String getSdsex() {
		return sdsex;
	}
	public void setSdsex(String sdsex) {
		this.sdsex = sdsex;
	}
	public String getSdhobby() {
		return sdhobby;
	}
	public void setSdhobby(String sdhobby) {
		this.sdhobby = sdhobby;
	}
	public Date getSdbirth() {
		return sdbirth;
	}
	public void setSdbirth(Date sdbirth) {
		this.sdbirth = sdbirth;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "Tbstuday [sdid=" + sdid + ", sdname=" + sdname + ", sdsex=" + sdsex + ", sdhobby=" + sdhobby
				+ ", sdbirth=" + sdbirth + ", mid=" + mid + "]";
	}
	public Tbstuday(Integer sdid, String sdname, String sdsex, String sdhobby, Date sdbirth, Integer mid) {
		super();
		this.sdid = sdid;
		this.sdname = sdname;
		this.sdsex = sdsex;
		this.sdhobby = sdhobby;
		this.sdbirth = sdbirth;
		this.mid = mid;
	}
	public Tbstuday() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
