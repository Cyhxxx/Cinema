package com.pdd.video.vo;

public class Video implements Comparable<Video>{
	private transient int orderId;
	private String name;
	private String type;
	private String url;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public int compareTo(Video o) {
		return (this.orderId>o.orderId)?-1:1;
	}
}
