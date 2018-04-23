package com.pdd.video.vo;

import java.util.List;

public class jsonData<T> {
	private List<T> data;
	private PageInfo page;
	
	public PageInfo getPage() {
		return page;
	}
	public void setPage(PageInfo page) {
		this.page = page;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
}
