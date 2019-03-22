package com.shaheen.springdemo;

public class TrackCoach implements Coach {
	
	
    FortuneService fortuneService;
    
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Need to workout more";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void xoxo() {
		System.out.println("TrackCoach: inside method init method");
	}
	
	// add a destroy method
	public void yoyo() {
		System.out.println("TrackCoach: inside method destroy");		
	}

}
