<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="referrer" content="never">
<title>gay里gay气-免费影院-去广告解析</title>
<link rel="icon" href="http://cdn.gayligayqi.com/static/img/favicon.ico">
<link rel="stylesheet" href="http://cdn.gayligayqi.com/static/css/index.css" type="text/css">
</head>
<body>
<header class="header">
	<div class="top-block">
		<div class="logo">
			<a href="/"><img src="http://cdn.gayligayqi.com/static/img/logo.jpg" width="80" height="80" style="vertical-align: middle;">
			<span style="color: green;">gay里gay气</span></a>
		</div>
		<div class="type">
				<div class="link-list">
					<a href="/list?mainType=电视剧">电视剧</a>
					<a href="/list?mainType=电影">电影</a>
					<a href="/list?mainType=综艺">综艺</a>
					<a href="/list?mainType=动漫">动漫</a>
					<a href="/list?mainType=搞笑">搞笑</a>
					<a href="/list?mainType=音乐">音乐</a>
					<a href="/list?mainType=游戏">游戏</a>
					<a href="http://pdd-java.top">pdd养成计划博客</a>
				</div>
		</div>
		<div class="weather">
			<iframe allowtransparency="true" frameborder="0" width="290" height="96" scrolling="no" src="//tianqi.2345.com/plugin/widget/index.htm?s=2&z=3&t=0&v=0&d=2&bd=0&k=000000&f=&ltf=009944&htf=cc0000&q=1&e=1&a=1&c=54511&w=290&h=96&align=right"></iframe>
		</div>		
	</div>
</header>
<div class="seach">
		<div class="seach-top">
			<img src="http://cdn.gayligayqi.com/static/img/logo.jpg" width="80" height="80" style="vertical-align: middle;">
			<span style="color: green;">gay里gay气</span>
		</div>
		<div class="seach-buttom" style="position: relative;">
			<form action="/seach.html" method="get" id="seach-form" autocomplete="off">
				<input type='text' name="kw" id="keyword-input" placeholder="请输入要观看的影视名称" oninput="Js_seach(this)"/><button type="submit">搜一搜</button>
			</form>
			<div class="seach-keyword">
				<ul>
				</ul>
			</div>
		</div>
	</div>
<section class="main">
	<div class="Recommend">
		热门电影推荐<span class="chak">
		<a href="/more">查看更多>></a></span>
	</div>
	<div class="hot">
		<ul class="movie-list">
			<#list RecommendMovie as movie>
				 <li class="item">
					<a class="js-tongjic" href="${movie.playerUrl}" title="${movie.videoName}" target="_blank">
				         <div class="cover g-playicon">
				          <img src="${movie.cover}" alt="${movie.videoName}">
				          <span class="pay">推荐</span>       <span class="hint">${movie.publishTime?string('yyyy')}</span>
				         </div>
				         <div class="detail">
				          <p class="title g-clear">
						    <span class="s1">${movie.videoName}</span>
							<span class="s2">${movie.score}</span></p>
				           <p class="star">主演：${movie.tostarInfo}</p>
				          </div>
			         </a>
           		</li>	
			</#list>
		</ul>
	</div>
	<div class="Recommend">
		热门电视剧推荐<span class="chak">
		<a href="/more">查看更多>></a></span>
	</div>
	<div class="hot">
		<ul class="movie-list">
			<#list RecommendTV as movie>
				 <li class="item">
					<a class="js-tongjic" href="${movie.playerUrl}" title="${movie.videoName}" target="_blank">
				         <div class="cover g-playicon">
				          <img src="${movie.cover}" alt="${movie.videoName}">
				          <span class="pay">推荐</span>       <span class="hint">${movie.lastUpdateInfo}</span>
				         </div>
				         <div class="detail">
				          <p class="title g-clear">
						    <span class="s1">${movie.videoName}</span>
							<span class="s2"></span></p>
				           <p class="star">主演：${movie.tostarInfo}</p>
				          </div>
			         </a>
           		</li>	
			</#list>
		</ul>
	</div>
	<div class="copyright">
		<p>本站所有资源只提供web页面，非录制,储存,上传，均为采集资源!如果有侵犯他方权益，请与我方告知，我方将立即删除!</p>
		<p>©2018 gay里gay气-免费影院-去广告解析 技术博客:<a href="http://pdd-java.top">pdd养成计划</a></p>
		<p>QQ：871080854 &nbsp;&nbsp;邮箱:<a href="mailto:871080854@qq.com">871080854@qq.com</a></p>
		<p><a href="http://www.miitbeian.gov.cn">湘ICP备17020198号-2</a></p>
	</div>
</section>
<div class="goTop" style="display: none;">
		<a href="javascript:void(0)"></a>
</div>
</body>
<script type='text/javascript' src='http://cdn.gayligayqi.com/static/js/jq.js'></script>
<script type="text/javascript">
	$(function(){
		//滚动条事件
		$(window).scroll(function(){
		    if ($(window).scrollTop() > 100){
				 $(".goTop").fadeIn();
			 }else{
				 $(".goTop").fadeOut();
			 }
		})
		 $(".goTop").click(function(){
			 $('html,body').animate({
			        'scrollTop': 0
			  }, 500);
		})
		$("#keyword-input").focus(function(){
			if($("#keyword-input").val()!=''){
				$(".seach-keyword").show();
			}
		})
		$(".seach-keyword").on("click","li",function(){
			$("#keyword-input").val($(this).text())
			$(".seach-keyword").hide();
			$("#seach-form").submit();
		})
		//点击输入框或者下拉选择以外的元素隐藏选择框
		$(document).on('click',function(e){
			if($(e.target).closest(".seach-keyword").length==0 && $(e.target).closest("#keyword-input").length==0){
				$(".seach-keyword").hide();
			}
			//if(!$(e.target).attr('class') === 'seach-keyword'){
			//	$(".seach-keyword").hide();
			//}
		})
	})
	//关键字搜索
	function Js_seach(input){
		var js_keyword=$(input).val();
		if(js_keyword!=''){
			Request_keyWords(js_keyword)//关键字提示
		}else{
			$(".seach-keyword").hide();
		}
	}
	//请求后台匹配关键字
	function Request_keyWords(js_keyword){
		$.ajax({
			url:'/seach_keyWord',
			type:'GET',
			data:{
			   js_keyword:js_keyword
			},
			dataType:'json',
			success:function(result){
			 	show_keyword(result)
			},
			error:function(){
				alert('error')
			}
		})
	}
	//拼接html生成关键字提示
	function show_keyword(json){
		$(".seach-keyword ul").empty();
		var html="";
		for(var i=0;i<json.length;i++){
			html+="<li>"+json[i].videoName+"</li>";
		}
		if(html==""){
			html="<li>没有找到相应记录</li>";
		}
		$(".seach-keyword ul").html(html)
		$(".seach-keyword").show();
	}
</script>
</html>