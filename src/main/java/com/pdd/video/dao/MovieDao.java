package com.pdd.video.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pdd.video.bean.Movie;

public interface MovieDao {
	List<Movie> getRecommendMovie();
	List<Movie> getRecommendTV();
	List<Movie> getVideoByType(@Param("mainType")String mainType,@Param("subType")String subType);
}
