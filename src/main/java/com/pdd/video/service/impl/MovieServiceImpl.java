package com.pdd.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pdd.video.bean.Movie;
import com.pdd.video.dao.MovieDao;
import com.pdd.video.service.MovieService;
import com.pdd.video.vo.jsonData;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieDao md;
	
	@Override
	public List<Movie> getRecommendMovie() {
		return md.getRecommendMovie();
	}

	@Override
	public List<Movie> getRecommendTV() {
		return md.getRecommendTV();
	}

	@Override
	public jsonData<Movie> getVideoByType(String mainType, String subType,Integer pageIndex) {
		jsonData<Movie> jsonData=new jsonData<Movie>();
		PageHelper.startPage(pageIndex, 30,"playcount desc");
		List<Movie> newsList=md.getVideoByType(mainType, subType);
		PageInfo<Movie> pageinfo=new PageInfo<Movie>(newsList);
		jsonData.setData(pageinfo.getList());
		jsonData.setPage(new com.pdd.video.vo.PageInfo(pageinfo.getPages(), pageinfo.getTotal(), pageIndex, 10,pageinfo.getNextPage()));
		return jsonData;
	}
}
