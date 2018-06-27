package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.service.IClazzService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.ApiOperation;
//@ApiOperation("班级相关接口")
@RestController
@RequestMapping("/clazz")
public class ClazzController { 
	@Autowired
	private IClazzService clazzService;
	@ApiOperation("查询所有班级信息")
	@GetMapping("findAllClazz")
	public MsgResponse findAllClazz(){//MsgResponse类型什么意思，在哪里定义的？？？？？？？
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
