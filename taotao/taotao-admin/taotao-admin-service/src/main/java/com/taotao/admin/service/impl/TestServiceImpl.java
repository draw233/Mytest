package com.taotao.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.admin.mapper.TestMapper;
import com.taotao.admin.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	//注入mapper
	@Autowired
	private TestMapper testMapper;
	@Override
	public String queryCurrentDate() {
		// TODO Auto-generated method stub
		return testMapper.queryCurrentDate();
	}

}
