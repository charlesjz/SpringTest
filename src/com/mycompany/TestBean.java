package com.mycompany;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	public static void main(String[] args) {
		String conf = "ApplicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		
//		Calendar c1= new GregorianCalendar();
		Calendar c1 = ac.getBean("c1",Calendar.class);
		System.out.println(c1);
		
		Calendar c2 = ac.getBean("c2",Calendar.class);
		System.out.println(c2);

	}

}
