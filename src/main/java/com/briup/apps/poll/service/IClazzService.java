package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Clazz;
//业务逻辑层要抛异常
public interface IClazzService {
	List<Clazz> findAll() throws Exception;

}
