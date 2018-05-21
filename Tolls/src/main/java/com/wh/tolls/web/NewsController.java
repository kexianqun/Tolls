package com.wh.tolls.web;

import com.wh.tolls.entity.news;
import com.wh.tolls.service.NewsService;
import com.wh.tolls.util.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/news")
public class NewsController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	NewsService newsService;

	@ResponseBody
	@RequestMapping("/show")
	public ResultMap show(){
		ResultMap resultMap = new ResultMap();
		List<news> newsList = newsService.selectAll();
		if(newsList.size()!=0){
			logger.info("成功查询新闻，新闻条数："+newsList.size());
			resultMap.addData("news",newsList);
		}else{
			logger.info("未查询出新闻");
			resultMap.addError("未查询出新闻");
		}
		return resultMap;
	}
	

}
