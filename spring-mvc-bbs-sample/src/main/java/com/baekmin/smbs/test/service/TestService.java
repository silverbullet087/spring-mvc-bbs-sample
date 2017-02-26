package com.baekmin.smbs.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.baekmin.smbs.test.model.Test;

@Component
public class TestService {

	private static final Logger logger = LoggerFactory.getLogger(TestService.class);
	
	public TestService() {
		super();
		logger.info("### TestService()생성자");
	}

	public void spliteIp(String testIp) {
		List<String> list = new ArrayList<String>(); 
		StringTokenizer lines = new StringTokenizer(testIp, "\n");
		
		while (lines.hasMoreElements()) {
			String str = lines.nextToken();
			list.add(str.trim());
		}
	}

	public Test getTestInfo(String string) {
		Test test = new Test();
		
		test.setAclIp("127.0.0.1");
		test.setApiMethodName("getTestApiInfo");
		test.setDeputy("홍길");
		test.setPrimaryContact("사쿠");
		
		return test;
	}
	

}
