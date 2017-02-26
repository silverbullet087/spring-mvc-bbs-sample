package com.baekmin.smbs.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.baekmin.smbs.test.model.Test;
import com.baekmin.smbs.test.service.TestService;

@Controller
@RequestMapping(value="/test")
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	TestService testService;
	
	public TestController() {
		super();
		logger.info("### TestController()생성자 - Update Test");
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String testCreate() {
		return "/test/testCreate";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String testCreateResult(Model model, @RequestParam("testIp") String testIp) {
		logger.info("ajax 통신 성공!!!");
		logger.info("testIp : " + testIp);
		
		testService.spliteIp(testIp);
		
		model.addAttribute("testIp", testIp);
		
		return "/test/testCreateResult";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String testUpdate(Model model) {
		logger.info("ajax 통신 성공!!!");
		
		Test test = testService.getTestInfo("test");
		
		model.addAttribute("test", test);
		
		return "/test/testUpdate";
	}

}
