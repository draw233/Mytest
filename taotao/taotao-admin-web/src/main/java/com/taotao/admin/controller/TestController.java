package com.taotao.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.admin.service.TestService;


@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/date")
	@ResponseBody
	public String getCurrentDate() {
		return testService.queryCurrentDate();
	}
}
