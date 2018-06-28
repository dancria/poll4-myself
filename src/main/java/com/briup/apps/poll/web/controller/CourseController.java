package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.service.ICourseService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.Api;

//若执行不成功，顺着开发流程contrller-service-dao,进行断点调试，或打印
@Api(description="课程相关接口")
@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private ICourseService courseService;

	// 批量删除
	@PostMapping("batchDelete")
	// 用数组进行接收
	public MsgResponse batchDelete(long[] ids) {// 若有错误可以加打印测试
		try {
			// service需要list类型的参数，所以更改方法两种
			// 1.改service层，把list类型改为long类型
			// 2.本类中长整型换成list
			// 3.list类型中写一个long 类型（此次采用）
			List<Long> idList = new ArrayList<>();// 创建了一个空的集合
			// 每次从ids中取出一个id放到集合中
			for (long id : ids) {
				idList.add(id);
			}
			courseService.batchDelete(idList);
			return MsgResponse.success("批量删除成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage(), null);
		}
	}

	@GetMapping("findAllCourse")
	public MsgResponse findAllCourse() {
		try {
			List<Course> list = courseService.findAll();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage(), null);
		}
	}
}
