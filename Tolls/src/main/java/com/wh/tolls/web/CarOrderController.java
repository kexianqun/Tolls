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
import org.springframework.web.bind.annotation.*;

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

	@ResponseBody
    @RequestMapping("/showByoid")
    public ResultMap showByOId(@RequestParam("orderId") int orderId){
        ResultMap resultMap = new ResultMap();
        carorder tcarorder = carorderService.selectByPrimaryKey(orderId);
        if(tcarorder!=null){
            logger.info("查询出该用户预约记录："+tcarorder.toString());
            resultMap.addData("carorder",tcarorder);
        }else{
            logger.info("未查询出该用户的预约记录");
            resultMap.addError("未查询出该用户的预约记录");
        }
        return resultMap;
    }

    @ResponseBody
	@RequestMapping("/showByuser")
	public ResultMap showByuserId(@RequestParam("userid") int userid){
		ResultMap resultMap = new ResultMap();
		List<carorder> carorders = carorderService.selectByUser(userid);
		if(carorders.size()>0){
			logger.info("查询出该用户的预约记录条数："+carorders.size());
			resultMap.addData("carorder",carorders);
		}else{
			logger.info("未查询出该用户的预约记录");
			resultMap.addError("未查询出该用户的预约记录");
		}
		return resultMap;
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
			int id = carorder.getOrderId();
			logger.info("预约后的id："+id);
			if(a==1){
			    logger.info("预约成功--");
                resultMap.addData("carorder",carorder);
            }else{
                logger.info("预约失败--");
                resultMap.addError("预约失败");
            }
		}else{
			resultMap.addError("系统无此用户，无法预约");
		}
		return resultMap;
	}

	@ResponseBody
	@RequestMapping(value = ("/delete"),method = RequestMethod.POST)
	public ResultMap orderDelete(@RequestParam("orderId") int orderId){
		ResultMap resultMap = new ResultMap();
		int i = carorderService.deleteByPrimaryKey(orderId);
		System.out.println("删除之后的i："+i);
		if(i!=0){
			logger.info("取消预约成功");
			resultMap.addData("STATE","取消预约成功");
		}else{
			resultMap.addError("取消预约失败");
		}
		return resultMap;
	}
	
}
