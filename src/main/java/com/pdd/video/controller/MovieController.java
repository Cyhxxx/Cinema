package com.pdd.video.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdd.video.bean.Movie;
import com.pdd.video.bean.SubType;
import com.pdd.video.service.MovieService;
import com.pdd.video.service.TypeService;
import com.pdd.video.vo.jsonData;

@Controller
@Scope("prototype")
public class MovieController {
	
	@Autowired
	private MovieService ms;
	@Autowired
	private TypeService ts;
	
	@RequestMapping(value={"/","/WEB-INF/index/index.html"})
	public String getIndex(ModelMap map){
		List<Movie> Movie=ms.getRecommendMovie();
		List<Movie> TV=ms.getRecommendTV();
		map.put("RecommendMovie", Movie);
		map.put("RecommendTV", TV);
		return "index";
	}
	
	@RequestMapping("/list")
	public String getList(String mainType,String subType,Integer pageIndex,ModelMap map){
		pageIndex=pageIndex==null?1:pageIndex;
		pageIndex=pageIndex.toString().trim().isEmpty()?1:pageIndex;
		List<SubType> VideosubType=ts.getSubType(mainType);
		jsonData<Movie> jsonData=ms.getVideoByType(mainType, subType,pageIndex);
		map.put("VideosubType", VideosubType);
		map.put("Videos", jsonData.getData());
		map.put("VideoType", mainType);
		map.put("VideoParamSubType", subType);
		map.put("PageInfo", jsonData.getPage());
		return "list";
	}
	
	@RequestMapping("/Recommend")
	@ResponseBody
	public List<Movie> getRecommend(){
		List<Movie> Movie=ms.getRecommendMovie();
		return Movie;
	}
}
