package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.extend.ClazzVM;
import com.briup.apps.poll.service.IClazzService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="班级相关接口")
@RestController
@RequestMapping("/clazz")//映射，通过这个找到映射类
public class ClazzController { 
	@Autowired
	private IClazzService clazzService;
	
	@ApiOperation("查询所有班级信息")
	@GetMapping("findAllClazzVM")
	public MsgResponse findAllClazzVM(){
		try {
			List<ClazzVM> list=clazzService.findAllClazzVM();			
			return MsgResponse.success("查找成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}	
	}
	
	@ApiOperation("查询所有班级信息")
	@GetMapping("findAllClazz")
	//MsgResponse类型什么意思，在哪里定义的？？？？？？？-只是一个返回类型，记住就好
	public MsgResponse findAllClazz(){
		try {
			//在controller中调用services代码需要先注入
			List<Clazz> list=clazzService.findAll();			
			return MsgResponse.success("查找成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}		
		
	}

}
