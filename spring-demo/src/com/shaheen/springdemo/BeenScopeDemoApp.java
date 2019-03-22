package com.shaheen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeenScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beenScope-applicationContext.xml");
		Coach coach=context.getBean("myCoach", Coach.class);
		Coach myCoach=context.getBean("myCoach", Coach.class);
		
		boolean result= (coach==myCoach);
		
		System.out.println("Singleton: " +result );
		
		System.out.println("Memory location Coach:"+ coach);
		System.out.println("Memory location Coach:"+ myCoach);
		
		context.close();
		

	}

}
