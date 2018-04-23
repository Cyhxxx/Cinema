package com.pdd.video.bean;

import java.util.Date;

public class Movie {
	private String vid; //id
	private String cover; //封面
	private String videoName; //电影名称
	private String duration; //时长
	private String tostarInfo; //封面主演
	private String score; //评分
	private String sourceUrl; //源站地址
	private MainType mtid; //主分类
	private String director; //导演
	private String watch; //看点
	private String description; //电影剧情简介
	private Date PublishTime; //发布时间
	private Date CrawlerTime; //爬取时间
	private String performerInfo;// 演员信息  xxx 饰 xxx
	private String keywords; //关键字
	private String metadescription; //电影介绍
	private String PlayerUrl;//播放页面
	private String lastUpdateInfo;//最后更新信息
	private String publishTimeStr;
	public String getPublishTimeStr() {
		return publishTimeStr;
	}
	public void setPublishTimeStr(String publishTimeStr) {
		this.publishTimeStr = publishTimeStr;
	}
	public String getLastUpdateInfo() {
		return lastUpdateInfo;
	}
	public void setLastUpdateInfo(String lastUpdateInfo) {
		this.lastUpdateInfo = lastUpdateInfo;
	}
	public String getPlayerUrl() {
		return PlayerUrl;
	}
	public void setPlayerUrl(String playerUrl) {
		PlayerUrl = playerUrl;
	}
	public String getVid() {
		return vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTostarInfo() {
		return tostarInfo;
	}
	public void setTostarInfo(String tostarInfo) {
		this.tostarInfo = tostarInfo;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public MainType getMtid() {
		return mtid;
	}
	public void setMtid(MainType mtid) {
		this.mtid = mtid;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getWatch() {
		return watch;
	}
	public void setWatch(String watch) {
		this.watch = watch;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPublishTime() {
		return PublishTime;
	}
	public void setPublishTime(Date publishTime) {
		PublishTime = publishTime;
	}
	public Date getCrawlerTime() {
		return CrawlerTime;
	}
	public void setCrawlerTime(Date crawlerTime) {
		CrawlerTime = crawlerTime;
	}
	public String getPerformerInfo() {
		return performerInfo;
	}
	public void setPerformerInfo(String performerInfo) {
		this.performerInfo = performerInfo;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getMetadescription() {
		return metadescription;
	}
	public void setMetadescription(String metadescription) {
		this.metadescription = metadescription;
	}
}
