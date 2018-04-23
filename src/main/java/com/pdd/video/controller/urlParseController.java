package com.pdd.video.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdd.video.utils.RequestUtils;
import com.pdd.video.vo.Video;

@Controller
@Scope("prototype")
public class urlParseController {
	
	@RequestMapping("/iqyUrlParse")
	@ResponseBody
	public Object iqiyi(String url){
		Map<String, String> map=new HashMap<String, String>();
		try {
			String code=RequestUtils.getIqiVid(url);
			map.put("Code", code);
			map.put("status", "success");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("Code", -1+"");
			map.put("status", "Error");
		}
		return map;
	}
	
	@RequestMapping("/huyaParse")
	@ResponseBody
	public Object huya(String vid){
		Map<String, Object> map=new HashMap<String, Object>();
		vid=vid.replace("_huya", "");
		try {
			List<Video> video_list=RequestUtils.getHuyaVideo(vid);
			map.put("Code", "200");
			map.put("status", "success");
			map.put("VideoList", video_list);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("Code", -1+"");
			map.put("status", "Error");
		}
		return map;
	}
}
