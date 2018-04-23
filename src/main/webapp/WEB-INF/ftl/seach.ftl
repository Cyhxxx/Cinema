<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="referrer" content="never">
<title>gay里gay气-免费影院-去广告解析-全站搜索-${keyWord}</title>
<link rel="icon" href="http://cdn.gayligayqi.com/static/img/favicon.ico">
<link rel="stylesheet" href="http://cdn.gayligayqi.com/static/css/list.css" type="text/css">
</head>
<body>
	<header class="header">
		<div class="top-block">
			<div class="logo">
				<a href="/"><img src="http://cdn.gayligayqi.com/static/img/logo.jpg"
					width="80" height="80" style="vertical-align: middle;"> <span
					style="color: green;">gay里gay气</span></a>
			</div>
			<div class="type">
				<div class="link-list">
					<a href="/list?mainType=电视剧">电视剧</a> <a href="/list?mainType=电影">电影</a>
					<a href="/list?mainType=综艺">综艺</a> <a href="/list?mainType=动漫">动漫</a>
					<a href="/list?mainType=搞笑">搞笑</a> <a href="/list?mainType=音乐">音乐</a>
					<a href="/list?mainType=游戏">游戏</a> <a href="http://pdd-java.top">pdd养成计划博客</a>
				</div>
			</div>
			<div class="weather">
				<iframe allowtransparency="true" frameborder="0" width="290"
					height="96" scrolling="no"
					src="//tianqi.2345.com/plugin/widget/index.htm?s=2&z=3&t=0&v=0&d=2&bd=0&k=000000&f=&ltf=009944&htf=cc0000&q=1&e=1&a=1&c=54511&w=290&h=96&align=right"></iframe>
			</div>
		</div>
	</header>
	<section class="main">
		<div class="seach-Prompt"><span style="color: red;">【${keyWord}】</span>：一共搜索到<span style="color: red;">${PageInfo.total}</span>条记录</div>
		<#if seachData?size gt 0>
		<div class="hot">
			<ul class="movie-list">
				<#list seachData as movie> <#if movie.mtName=='电视剧' ||
				movie.mtName=='动漫' || movie.mtName=='综艺' || movie.mtName=='搞笑'>
				<li class="item"><a class="js-tongjic"
					href="${movie.playerurl}" title="${movie.videoName}"
					target="_blank">
						<div class="cover g-playicon">
							<img src="${movie.cover}" alt="${movie.videoName}"> <span
								class="pay">${movie.mtName}</span><span class="hint">${movie.lastupdateinfo}</span>
						</div>
						<div class="detail">
							<p class="title g-clear">
								<span class="s1">${movie.videoName}</span> <span class="s2"></span>
							</p>
							<p class="star">${movie.tostarInfo}</p>
						</div>
				</a></li> <#elseif movie.mtName=='电影'>
				<li class="item"><a class="js-tongjic"
					href="${movie.playerurl}" title="${movie.videoName}"
					target="_blank">
						<div class="cover g-playicon">
							<img src="${movie.cover}" alt="${movie.videoName}"> <span
								class="pay">${movie.mtName}</span>
								<#if (movie.duration)??>
									<span class="hint">${movie.duration}</span>
								</#if>
						</div>
						<div class="detail">
							<p class="title g-clear">
								<span class="s1">${movie.videoName}</span> <span class="s2">${movie.score}</span>
							</p>
							<p class="star">主演：${movie.tostarInfo}</p>
						</div>
				</a></li> </#if> </#list>
			</ul>
		</div>
		<#else>
		<div class="not-seach">
			<img src="http://cdn.gayligayqi.com/static/img/not-found.png" width="300px" />
			<p>
				<strong>抱歉 Sorry！~</strong>没有搜索到<span style="color: red;">【${keyWord}】</span>对应的记录
			</p>
		</div>
		</#if>
		<ul class="pagination" style="margin-top:20px;">
			<#if PageInfo.totalPages gt 0> <#if PageInfo.pageIndex gt 1>
			<li><a
				href='/seach.html?kw=${keyWord}&pageIndex=${PageInfo.pageIndex-1}'><span
					class="next">上一页</span></a></li> </#if> <#if PageInfo.totalPages lte 5>
			<#list 1..PageInfo.totalPages as t>
			<li><a
				href='/seach.html?kw=${keyWord}&pageIndex=${t}'>
					<#if (t==PageInfo.pageIndex) > <span class="next">${t}</span>
			</a> <#else> <span class="page-button">${t}</span> </#if></li> </#list>
			<#elseif PageInfo.totalPages gt 5> <#if PageInfo.pageIndex lt 5>
			<#list 1..5 as t>
			<li><a
				href='/seach.html?kw=${keyWord}&pageIndex=${t}'>
					<#if (t==PageInfo.pageIndex) > <span class="next">${t}</span>
			</a> <#else> <span class="page-button">${t}</span> </#if></li> </#list>
			<#elseif PageInfo.pageIndex gt PageInfo.totalPages-4> <#list
			PageInfo.totalPages-4..PageInfo.totalPages as t>
			<li><a
				href='/seach.html?kw=${keyWord}&pageIndex=${t}'>
					<#if (t==PageInfo.pageIndex) > <span class="next">${t}</span>
			</a> <#else> <span class="page-button">${t}</span> </#if></li> </#list>
			<#else>
			<li><a
				href='/seach.html?kw=${keyWord}&pageIndex=${PageInfo.pageIndex-2}'><span
					class="page-button">${PageInfo.pageIndex-2}</span></a></li>
			<li><a
				href='/seach.html?kw=${keyWord}&pageIndex=${PageInfo.pageIndex-1}'><span
					class="page-button">${PageInfo.pageIndex-1}</span></a></li>
			<li><a
				href='/seach.html?kw=${keyWord}&pageIndex=${PageInfo.pageIndex}'><span
					class="next">${PageInfo.pageIndex}</span></a></li>
			<li><a
				href='/seach.html?kw=${keyWord}&pageIndex=${PageInfo.pageIndex+1}'><span
					class="page-button">${PageInfo.pageIndex+1}</span></a></li>
			<li><a
				href='/seach.html?kw=${keyWord}&pageIndex=${PageInfo.pageIndex+2}'><span
					class="page-button">${PageInfo.pageIndex+2}</span></a></li> </#if> </#if>
			<#if PageInfo.pageIndex lt PageInfo.totalPages>
			<li><a
				href='/seach.html?kw=${keyWord}&pageIndex=${PageInfo.pageIndex+1}'><span
					class="next">下一页</span></a></li> </#if> </#if>
		</ul>
		<div class="copyright">
			<p>本站所有资源只提供web页面，非录制,储存,上传，均为采集资源!如果有侵犯他方权益，请与我方告知，我方将立即删除!</p>
			<p>
				©2018 gay里gay气-免费影院-去广告解析 技术博客:<a href="http://pdd-java.top">pdd养成计划</a>
			</p>
			<p>
				QQ：871080854 &nbsp;&nbsp;邮箱:<a href="mailto:871080854@qq.com">871080854@qq.com</a>
			</p>
			<p><a href="http://www.miitbeian.gov.cn">湘ICP备17020198号-2</a></p>
		</div>
	</section>
	<div class="goTop" style="display: none;">
		<a href="javascript:void(0)"></a>
	</div>
</body>
<script type='text/javascript' src='http://cdn.gayligayqi.com/static/js/jq.js'></script>
<script type="text/javascript">
	$(function() {
		//滚动条事件
		$(window).scroll(function() {
			if ($(window).scrollTop() > 100) {
				$(".goTop").fadeIn();
			} else {
				$(".goTop").fadeOut();
			}
		})
		$(".goTop").click(function() {
			$('html,body').animate({
				'scrollTop' : 0
			}, 500);
		})
		$(".type-list a").click(
				function() {
					var hrefUrl = location.href;
					hrefUrl = changeURLArg(hrefUrl, 'pageIndex', 1)
					$(this).attr(
							"href",
							changeURLArg(hrefUrl, 'subType', $(this).attr(
									"data-id")))
				})
	})
	/*
	 *替换指定的参数
	 */
	function changeURLArg(url, arg, arg_val) {
		var pattern = arg + '=([^&]*)';
		var replaceText = arg + '=' + arg_val;
		if (url.match(pattern)) {
			var tmp = '/(' + arg + '=)([^&]*)/gi';
			tmp = url.replace(eval(tmp), replaceText);
			return tmp;
		} else {
			if (url.match('[\?]')) {
				return url + '&' + replaceText;
			} else {
				return url + '?' + replaceText;
			}
		}
		return url + '\n' + arg + '\n' + arg_val;
	}
</script>
</html>