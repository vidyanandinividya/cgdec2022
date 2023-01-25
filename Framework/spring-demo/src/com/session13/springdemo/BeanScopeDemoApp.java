package com.session13.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
				//load the spring configuration file
				ClassPathXmlApplicationContext context=
						new ClassPathXmlApplicationContext("beanScopeapplicationContext.xml");
				//retrieve bean from spring container
				Coach theCoach=context.getBean("myCoach",Coach.class);
				Coach alphaCoach=context.getBean("myCoach",Coach.class);
				
				boolean result=(theCoach==alphaCoach);
				System.out.println("pointing to the same object:"+result);
				System.out.println("Memory location for theCoach: "+theCoach);
				System.out.println("Memory location for alphaCoach: "+alphaCoach);
				
				context.close();

	}

}
