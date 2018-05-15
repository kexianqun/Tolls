package com.wh.tolls.web;

import com.wh.tolls.entity.user;
import com.wh.tolls.service.UserService;
import com.wh.tolls.util.MD5Util;
import com.wh.tolls.util.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	HttpServletRequest request;

	@Autowired
	UserService userService;

	@RequestMapping("/show")
	public String show() {
		List<user> list = userService.selectAll();
		request.getSession().setAttribute("list", list);
		return "show";
	}

	@RequestMapping("/del")
	public String del(int id) {
		userService.deleteByPrimaryKey(id);
		show();
		return "show";
	}

	//登录
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResultMap appLogin(@RequestBody user user, HttpSession session) {
		logger.info("app login user : ", user.getUsername() + "\t" + user.getPassword());
		ResultMap resultMap = new ResultMap();
		user u = userService.selectByUsername(user.getUsername());
		logger.info("app login get user is : ", u);
		if (u != null) {
			String password  = user.getPassword();
			String md5pass = MD5Util.convertMD5(password);//密码参数加密
			if(md5pass.equals(u.getPassword())){
				//验证成功
				logger.info("登陆成功："+u.toString());
				resultMap.addData("user",u);
				session.setAttribute("user",u);
			}else{
				logger.error("用户登录失败");
				resultMap.addError("用户名或密码错误");
			}
		}else{
			logger.error("系统无此用户");
			resultMap.addError("系统无此用户");
		}
		return resultMap;
	}

	//注册
	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResultMap appRegister(@RequestBody user user) {
		logger.info("app register user : "+user.toString());
		ResultMap resultMap = new ResultMap();
		String password = user.getPassword();
		String md5pass = MD5Util.convertMD5(password);//md5加密密码
		user.setPassword(md5pass);
		int a = userService.insert(user);
		logger.info("注册返回结果："+a);
		if (a == 1) {
			//注册成功
			logger.info("注册成功--");
			resultMap.addData("STATE","注册成功");
		}else{
			logger.error("注册失败--");
			resultMap.addError("注册失败");
		}
		return resultMap;
	}
}
