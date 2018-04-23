package com.pdd.video.vo;

public class PageInfo {
	private long totalPages;
	private long counts;
	private long pageIndex;
	private long pageSize;
	private long nextPage;
	private long total;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public PageInfo() {
		super();
	}
	public PageInfo(long totalPages, long counts, long pageIndex, long pageSize,int nextPage) {
		super();
		this.totalPages = totalPages;
		this.counts = counts;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.nextPage = nextPage;
	}
	public long getNextPage() {
		return nextPage;
	}
	public void setNextPage(long nextPage) {
		this.nextPage = nextPage;
	}
	public long getTotalPages() {
		if(totalPages==0){
			totalPages=(int)Math.ceil((double)total/pageSize);
			return totalPages;
		}else{
			return totalPages;
		}
	}
	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}
	public long getCounts() {
		return counts;
	}
	public void setCounts(long counts) {
		this.counts = counts;
	}
	public long getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public long getPageSize() {
		return pageSize;
	}
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
}
