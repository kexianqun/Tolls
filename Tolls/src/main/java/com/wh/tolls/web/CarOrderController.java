package com.wh.tolls.web;

import com.wh.tolls.entity.carorder;
import com.wh.tolls.entity.user;
import com.wh.tolls.service.CarOrderService;
import com.wh.tolls.service.UserService;
import com.wh.tolls.util.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/carorder")
public class CarOrderController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	CarOrderService carorderService;

	@Autowired
	UserService userService;

	@RequestMapping("/show")
	public String show(){
		List<carorder> list = carorderService.selectAll();
		request.getSession().setAttribute("list", list);
		return "show";
	}
	
	@RequestMapping("/del")
	public String del(int id){
		carorderService.deleteByPrimaryKey(id);
		show();
		return "show";
	}

	@ResponseBody
	@RequestMapping("/insert")
	public ResultMap orderInsert(@RequestBody carorder carorder){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String ordertime = df.format(new Date());// new Date()为获取当前系统时间;
		ResultMap resultMap = new ResultMap();
		logger.info("预约信息："+carorder.toString());
		String username = carorder.getUsername();
		user user = userService.selectByUsername(username);
		if(user!=null){
			int userid = user.getUserId();
			carorder.setUserId(userid);
			carorder.setOrdertime(ordertime);
			int a = carorderService.insert(carorder);
			if(a==1){
			    logger.info("预约成功--");
                resultMap.addData("STATE","预约成功");
            }else{
                logger.info("预约失败--");
                resultMap.addError("预约失败");
            }
		}else{
			resultMap.addError("系统无此用户，无法预约");
		}
		return resultMap;
	}
	
}
