package com.wh.tolls.web;

import com.wh.tolls.entity.Result;
import com.wh.tolls.entity.tolls;
import com.wh.tolls.log.LogOperator;
import com.wh.tolls.service.TollsService;
import com.wh.tolls.util.ResultMap;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/tolls")
public class TollsController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private final String ENTITY_NAME = tolls.ENTITY_DISPLAY_NAME;
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	TollsService tollsService;
	
	private final String loggerName = this.getClass().getName();

	@ResponseBody
	@RequestMapping("/show")
	public ResultMap show(){
		ResultMap resultMap = new ResultMap();
		List<tolls> tolls = tollsService.selectAll();
		if(tolls.size()!=0){
			logger.info("查询出全部收费站数量："+tolls.size());
			resultMap.addData("tolls",tolls);
		}
		return resultMap;
	}
	


	@ApiOperation(value = "查询单个" + ENTITY_NAME, notes = "通过ID查询" + ENTITY_NAME +"详细信息")
	@ResponseBody
	@RequestMapping(value = "/queryTollsById/{id}", method = RequestMethod.GET)
	public Result<tolls> queryTollsById(@ApiParam(value =ENTITY_NAME + "ID", required = true) @PathVariable(value = "id") Integer userId,
			Model model) {
		return new Result<tolls>(Result.CODE_SUCCESS, "", tollsService.selectByPrimaryKey(userId));
	}
	
	@ApiOperation(value = "查询" + ENTITY_NAME +"信息列表", notes = "查询"+ ENTITY_NAME +"信息列表")
	@ResponseBody
	@RequestMapping(value = "/queryAllTolls", method = RequestMethod.GET)
	public List<tolls> queryAllTolls() {
		return tollsService.selectAll();
	}

	@ApiOperation(value = "创建" + ENTITY_NAME, notes = "用户手工指定"+ ENTITY_NAME +"并创建，" + "需要手动输入" + ENTITY_NAME +"的详细信息，包括名称、域配置等。")
	@ApiImplicitParam(name = "data", value = ENTITY_NAME, required = true, dataType = "tolls")
	@ResponseBody
	@RequestMapping(value = "/createTolls", method = RequestMethod.POST)
	public Result<tolls> createTolls(@RequestBody tolls data) {
		LogOperator.debug(loggerName, "[createTolls] begin, " + data);
		tolls iObj = data;
		try {
			tollsService.insertSelective(iObj);
			LogOperator.debug(loggerName, "[createTolls] tollsService end, result is ok");
			return new Result<tolls>(Result.CODE_SUCCESS, "", iObj);
		} catch (Exception e) {
			LogOperator.debug(loggerName, "[createTolls] tollsService end, Exception is: " + e);
			return new Result<tolls>(Result.CODE_FAILED, "", iObj);
		}
	}

	@ApiOperation(value = "修改" + ENTITY_NAME, notes = "用户手工指定" + ENTITY_NAME + "并修改，" + "需要手动输入" + ENTITY_NAME + "的详细信息，包括名称等。")
	@ApiImplicitParam(name = "data", value = ENTITY_NAME, required = true, dataType = "tolls")
	@ResponseBody
	@RequestMapping(value = "/modifyTolls", method = RequestMethod.POST)
	public Result<tolls> modifyTolls(@RequestBody tolls data) {
		LogOperator.debug(loggerName, "[modifyTolls] begin, " + data);
		boolean isUpdate = false;
		try {
			List<tolls> allTollses = tollsService.selectAll();
			for (tolls i : allTollses) {
				if (i.getTollsId()==data.getTollsId()) {
					tollsService.updateByPrimaryKeySelective(data);
					isUpdate = true;
					break;
				}
			}
			if(!isUpdate){
				tollsService.insertSelective(data);
			}
			LogOperator.debug(loggerName, "[modifyTolls] tollsService end, result is ok");
			return new Result<tolls>(Result.CODE_SUCCESS, "", data);
		} catch (Exception e) {
			LogOperator.debug(loggerName, "[modifyTolls] tollsService end, Exception is: " + e);
			return new Result<tolls>(Result.CODE_FAILED, "", data);
		}
	}

	@ApiOperation(value = "删除" + ENTITY_NAME, notes = "在系统中删除已经存在的" + ENTITY_NAME)
	@ApiImplicitParam(name = "data", value = ENTITY_NAME, required = true, dataType = "tolls")
	@ResponseBody
	@RequestMapping(value = "/deleteTolls", method = RequestMethod.DELETE)
	public Result<tolls> deleteTolls(@RequestBody tolls data) {
		LogOperator.debug(loggerName, "[deleteTolls] begin, " + data);
		try {
			tollsService.deleteByPrimaryKey(data.getTollsId());
			LogOperator.debug(loggerName, "[deleteTolls] tollsService end, result is ok");
		} catch (Exception e) {
			LogOperator.debug(loggerName, "[deleteTolls] tollsService end, Exception is: " + e);
			return new Result<tolls>(Result.CODE_FAILED, "", data);
		}
		return new Result<tolls>(Result.CODE_SUCCESS, "", data);
	}
	
}
