package com.pdd.video.vo;

import org.apache.solr.client.solrj.beans.Field;

public class SeachClass {
	@Field("vid")
	private String vid;
	@Field("cover")
	private String cover;
	@Field("videoName")
	private String videoName;
	@Field("duration")
	private String duration;
	@Field("tostarInfo")
	private String tostarInfo;
	@Field("score")
	private String score;
	@Field("playerurl")
	private String playerurl;
	@Field("publishTime")
	private String publishTime;
	@Field("lastupdateinfo")
	private String lastupdateinfo;
	@Field("mtName")
	private String mtName;
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
	public String getPlayerurl() {
		return playerurl;
	}
	public void setPlayerurl(String playerurl) {
		this.playerurl = playerurl;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public String getLastupdateinfo() {
		return lastupdateinfo;
	}
	public void setLastupdateinfo(String lastupdateinfo) {
		this.lastupdateinfo = lastupdateinfo;
	}
	public String getMtName() {
		return mtName;
	}
	public void setMtName(String mtName) {
		this.mtName = mtName;
	}
}
