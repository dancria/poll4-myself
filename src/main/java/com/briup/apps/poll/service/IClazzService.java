package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.extend.ClazzVM;
//接口没法实例化，所以要写实现类
//业务逻辑层要抛异常
//接口写好就可以写实现impl
public interface IClazzService {
	List<Clazz> findAll() throws Exception;
	List<ClazzVM> findAllClazzVM() throws Exception;
	

}
