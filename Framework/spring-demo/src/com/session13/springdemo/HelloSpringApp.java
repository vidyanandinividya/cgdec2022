package com.session13.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach coach=context.getBean("myCoach",Coach.class);
		Coach coach1=context.getBean("myCoach1",Coach.class);
		CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
		//call methods on the bean
		System.out.println(coach.getDailyWorkout());
		//let's call our new method for fortunes
		System.out.println(coach.getFortune());
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();
		

	}

}
