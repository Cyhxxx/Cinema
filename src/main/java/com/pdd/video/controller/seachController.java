package com.pdd.video.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdd.video.vo.PageInfo;
import com.pdd.video.vo.SeachClass;

@Controller
@Scope("prototype")
public class seachController {
	@Autowired
	private HttpSolrClient solrServer;
	
	@RequestMapping("/seach.html")
	public String seach(String kw,@RequestParam(required=false)Integer pageIndex,ModelMap map){
		pageIndex=pageIndex==null?1:pageIndex;
		int pageSize=30;
		SolrQuery query=new SolrQuery();
         try {
        	query.set("q", "*"+kw+"*");
        	query.set("df", "videoName");
        	query.setStart((pageIndex-1)*pageSize);
        	query.setRows(pageSize);
        	QueryResponse response=solrServer.query(query);
        	List<SeachClass> movieList=response.getBeans(SeachClass.class);
        	SolrDocumentList sdl=response.getResults();
        	PageInfo page=new PageInfo();
        	page.setPageSize(pageSize);
        	page.setTotal(sdl.getNumFound());
        	page.setPageIndex(pageIndex);
        	map.put("PageInfo", page);
        	map.put("seachData", movieList);
        	map.put("keyWord", kw);
		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "seach";
	}
	
	@RequestMapping("/seach_keyWord")
	@ResponseBody
	public Object seachKeyword(String js_keyword,String callback){
		SolrQuery query=new SolrQuery();
		query.set("q", "*"+js_keyword+"*");
    	query.set("df", "videoName");
    	query.set("fl", "videoName");
    	QueryResponse response=null;
		try {
			response = solrServer.query(query);
		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	List<SeachClass> movieList=response.getBeans(SeachClass.class);
		return movieList;
	}
}
