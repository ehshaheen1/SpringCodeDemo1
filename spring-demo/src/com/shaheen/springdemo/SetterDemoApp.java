package com.shaheen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	    CricketCoach cCoach =context.getBean("myCricketCoach", CricketCoach.class);
	    System.out.println(cCoach.getDailyFortune());
	    System.out.println(cCoach.getDailyWorkout());
	    System.out.println(cCoach.getEmail());
	    System.out.println(cCoach.getTeam());
	    context.close();

	}

}
