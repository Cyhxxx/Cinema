package com.pdd.video.bean;

import java.util.Date;

public class MainType {
	private Integer mtid; //id
	private String mtName; //分类名称
	private Date createTime; //创建时间
	public Integer getMtid() {
		return mtid;
	}
	public void setMtid(Integer mtid) {
		this.mtid = mtid;
	}
	public String getMtName() {
		return mtName;
	}
	public void setMtName(String mtName) {
		this.mtName = mtName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
