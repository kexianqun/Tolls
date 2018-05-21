package com.wh.tolls.web;

import com.wh.tolls.entity.manager;
import com.wh.tolls.service.ManagerService;
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

@Controller
@RequestMapping(value = "/manager")
public class ManagerController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	ManagerService managerService;

	@ResponseBody
	@RequestMapping(value = ("/login"),method = RequestMethod.POST)
	public ResultMap orderDelete(@RequestBody manager manager, HttpSession session){
		ResultMap resultMap = new ResultMap();
		String name = manager.getMngname();
		String password = manager.getPassword();
		String md5pass = MD5Util.convertMD5(password);
		manager tManager = managerService.selectByName(name);
		String adminpass = tManager.getPassword();
		if(!"".equals(adminpass)&&adminpass!=null){
			if(md5pass.equals(adminpass)){
				logger.info("管理员匹配,登录成功:"+tManager.toString());
				resultMap.addData("manager",tManager);
				session.setAttribute("manager",tManager);
			}else{
				logger.error("用户名与密码不匹配");
				resultMap.addError("用户名与密码不匹配");
			}
		}else{
			resultMap.addError("管理员密码为空");
		}

		return resultMap;
	}
	

	
}
