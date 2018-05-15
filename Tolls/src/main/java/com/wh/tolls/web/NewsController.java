package com.wh.tolls.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wh.tolls.entity.user;
import com.wh.tolls.service.UserService;

@Controller
@RequestMapping(value = "/news")
public class NewsController {
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/show")
	public String show(){
		List<user> list = userService.selectAll();
		request.getSession().setAttribute("list", list);
		return "show";
	}
	
	@RequestMapping("/del")
	public String del(int id){
		userService.deleteByPrimaryKey(id);
		show();
		return "show";
	}
	
}
