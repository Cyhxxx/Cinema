package com.pdd.video.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pdd.video.vo.Video;

public class RequestUtils {
	
	public static String getIqiVid(String urls) throws Exception{
		String vid=null;
		Map<String, String> hreads=new HashMap<String, String>();
		hreads.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.167 Safari/537.36");
		Document doc=Jsoup.connect(urls).headers(hreads).get();
		Pattern pattern=Pattern.compile("tvId:(.*),");
		Matcher match=pattern.matcher(doc.toString());
		if(match.find()){
			vid=match.group(1);
		}
		return vid;
	}
	public static List<Video> getHuyaVideo(String vid) throws Exception{
		List<Video> video_list=new ArrayList<>();
		String Api_url="http://v-api-play.huya.com/?r=vhuyaplay%2Fvideo&vid="+vid+"&_="+new Date().getTime();
		String Content=HttpClientUtilsForAppV2.get(Api_url, new String[]{"User-Agent=Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1"});
		JSONObject obj=JSON.parseObject(Content);
		JSONObject result=obj.getJSONObject("result");
		JSONArray array=result.getJSONArray("items");
		for (int i = 0; i < array.size(); i++) {
			JSONObject items=array.getJSONObject(i);
			if(items.getString("definition").equals("350")){
				Video video=new Video();
				video.setOrderId(1);
				video.setName("模糊");
				video.setType("auto");
				video.setUrl(items.getJSONObject("transcode").getJSONArray("urls").getString(0));
				video_list.add(video);
			}
			if(items.getString("definition").equals("1000")){
				Video video=new Video();
				video.setOrderId(2);
				video.setName("标准");
				video.setType("auto");
				video.setUrl(items.getJSONObject("transcode").getJSONArray("urls").getString(0));
				video_list.add(video);
			}
			if(items.getString("definition").equals("1300")){
				Video video=new Video();
				video.setOrderId(3);
				video.setName("高清");
				video.setType("auto");
				video.setUrl(items.getJSONObject("transcode").getJSONArray("urls").getString(0));
				video_list.add(video);
			}
			if(items.getString("definition").equals("yuanhua")){
				Video video=new Video();
				video.setOrderId(4);
				video.setName("超清");
				video.setType("auto");
				video.setUrl(items.getJSONObject("transcode").getJSONArray("urls").getString(0));
				video_list.add(video);
			}
		}
		//按照清晰度排序
		Collections.sort(video_list);
		return video_list;
	}
}
