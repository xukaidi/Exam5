package com.hand.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.mvcdemo.dao.FilmDAO;
import com.imooc.mvcdemo.dao.impl.FilmDAOImpl;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		ConfigurableApplicationContext context = 
			      new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		FilmDAO fimDao=(FilmDAO) factory.getBean("filmdao");
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入电影名称[title]：");
		String t=scanner.next();
		Scanner scanner1=new Scanner(System.in);
		System.out.println("请输入电影描述[description]：");
		String d=scanner.next();
		Scanner scanner2=new Scanner(System.in);
		System.out.println("请输入电影语言ID[language_id]：");
		int l=scanner.nextInt();
		fimDao.create(t, d, l);
		context.stop();
		
	}
}
