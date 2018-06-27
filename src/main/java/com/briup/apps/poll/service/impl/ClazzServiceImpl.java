package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.ClazzExample;
import com.briup.apps.poll.dao.ClazzMapper;
import com.briup.apps.poll.service.IClazzService;
@Service
public class ClazzServiceImpl implements IClazzService{
	@Autowired
	private ClazzMapper clazzMapper;

	@Override
	public List<Clazz> findAll() throws Exception {
		ClazzExample example=new ClazzExample();		
		return clazzMapper.selectByExample(example);
	}
}
