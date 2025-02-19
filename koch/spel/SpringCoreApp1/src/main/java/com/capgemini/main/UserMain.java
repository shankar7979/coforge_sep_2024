package com.capgemini.main;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.User;

public class UserMain {

	public static void main(String[] args) {
		ApplicationContext beanfactory = new ClassPathXmlApplicationContext("application.xml");
		
User user=		beanfactory.getBean(User.class);
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getSalary());
		System.out.println(user.getBike());
		System.out.println(user.getBookCollection());
		
		System.out.println(user.getHobbies());
		
		Set<String> bike = user.getBike();
		System.out.println("all bikes ");
		for(String s:bike)
			System.out.println("\t"+s);
		
	}
}
