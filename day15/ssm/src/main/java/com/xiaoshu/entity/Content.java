package com.xiaoshu.entity;

import java.io.File;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Transient;

public class Content {

	@Id
	private Integer contentid;
	@Transient
	private Integer ccid;
	private String contenttitle;
	private String contenturl;
	private File picpath;
	private Double price;
	private String status;
	private Date createtime;
	public Integer getContentid() {
		return contentid;
	}
	public void setContentid(Integer contentid) {
		this.contentid = contentid;
	}
	public Integer getCcid() {
		return ccid;
	}
	public void setCcid(Integer ccid) {
		this.ccid = ccid;
	}
	public String getContenttitle() {
		return contenttitle;
	}
	public void setContenttitle(String contenttitle) {
		this.contenttitle = contenttitle;
	}
	public String getContenturl() {
		return contenturl;
	}
	public void setContenturl(String contenturl) {
		this.contenturl = contenturl;
	}
	public File getPicpath() {
		return picpath;
	}
	public void setPicpath(File picpath) {
		this.picpath = picpath;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Content [contentid=" + contentid + ", ccid=" + ccid + ", contenttitle=" + contenttitle + ", contenturl="
				+ contenturl + ", picpath=" + picpath + ", price=" + price + ", status=" + status + ", createtime="
				+ createtime + "]";
	}
	public Content(Integer contentid, Integer ccid, String contenttitle, String contenturl, File picpath, Double price,
			String status, Date createtime) {
		super();
		this.contentid = contentid;
		this.ccid = ccid;
		this.contenttitle = contenttitle;
		this.contenturl = contenturl;
		this.picpath = picpath;
		this.price = price;
		this.status = status;
		this.createtime = createtime;
	}
	public Content() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
