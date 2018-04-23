package com.pdd.video.bean;

import java.util.Date;

public class SubType {
	private Integer mtSubid; //id
	private String mtSubName; //子分类
	private Date createTime; //创建时间
	public Integer getMtSubid() {
		return mtSubid;
	}
	public void setMtSubid(Integer mtSubid) {
		this.mtSubid = mtSubid;
	}
	public String getMtSubName() {
		return mtSubName;
	}
	public void setMtSubName(String mtSubName) {
		this.mtSubName = mtSubName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
