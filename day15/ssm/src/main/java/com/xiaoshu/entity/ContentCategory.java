package com.xiaoshu.entity;

import java.util.Date;

import javax.persistence.Id;

public class ContentCategory {

	@Id
	private Integer ccid;
	private String categoryname;
	private String status;
	private Date createtime;
	public Integer getCcid() {
		return ccid;
	}
	public void setCcid(Integer ccid) {
		this.ccid = ccid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
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
		return "ContentCategory [ccid=" + ccid + ", categoryname=" + categoryname + ", status=" + status
				+ ", createtime=" + createtime + "]";
	}
	public ContentCategory(Integer ccid, String categoryname, String status, Date createtime) {
		super();
		this.ccid = ccid;
		this.categoryname = categoryname;
		this.status = status;
		this.createtime = createtime;
	}
	public ContentCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
