package com.pdd.video.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.pdd.video.bean.Movie;
import com.pdd.video.vo.jsonData;

@Service
public interface MovieService {
	List<Movie> getRecommendMovie();
	List<Movie> getRecommendTV();
	jsonData<Movie> getVideoByType(String mainType,String subType,Integer pageIndex);
}
