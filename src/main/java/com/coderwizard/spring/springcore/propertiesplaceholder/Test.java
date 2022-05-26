package com.coderwizard.spring.springcore.propertiesplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/coderwizard/spring/springcore/propertiesplaceholder/config.xml");
		MyDAO mydao = (MyDAO) context.getBean("mydao");
		System.out.println(mydao);
	}

}