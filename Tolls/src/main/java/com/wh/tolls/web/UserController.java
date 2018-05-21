package com.wh.tolls.web;

import com.wh.tolls.entity.user;
import com.wh.tolls.service.UserService;
import com.wh.tolls.util.MD5Util;
import com.wh.tolls.util.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	HttpServletRequest request;

	@Autowired
	UserService userService;

	//查询
	@ResponseBody
	@RequestMapping(value = "/show" , method = RequestMethod.POST)
	public ResultMap show(@RequestParam("userid") int userid) {
		ResultMap resultMap = new ResultMap();
		user user = userService.selectByPrimaryKey(userid);
		if(user!=null){
			logger.info("查询成功，用户信息："+user.toString());
			resultMap.addData("user",user);
		}else{
			logger.error("未查询到用户");
			resultMap.addError("未查询到用户");
		}
		return resultMap;
	}

	//修改
	@ResponseBody
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public ResultMap userUpdate(@RequestBody user user) {
		ResultMap resultMap = new ResultMap();
		int userid = user.getUserId();
        String password = user.getPassword();
        if("".equals(password)||password==null){
        	//如果没修改密码，还使用原密码
			user user1 = userService.selectByPrimaryKey(userid);
			if(user1!=null){
				String oldpass = user1.getPassword();
				user.setPassword(oldpass);
				int i =userService.updateByPrimaryKey(user);
				if(i==1){
					logger.info("保存成功");
					resultMap.addData("STATE","保存成功");
				}else{
					logger.error("保存失败");
					resultMap.addError("保存失败");
				}
			}else{
				logger.error("未查询出该用户信息，无法修改");
				resultMap.addError("未查询出该用户信息，无法修改");
			}
		}else{
        	String md5pass = MD5Util.convertMD5(password);
        	user.setPassword(md5pass);
			int i =userService.updateByPrimaryKey(user);
			if(i!=1){
				logger.error("保存失败");
				resultMap.addError("保存失败");

			}else{
				logger.info("保存成功");
				resultMap.addData("STATE","保存成功");
			}
		}

		return resultMap;
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
		user.setCredit(100);
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
