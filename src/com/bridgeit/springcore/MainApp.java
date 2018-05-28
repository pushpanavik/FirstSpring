package com.bridgeit.springcore;


import java.io.FileNotFoundException;
import java.io.IOException;

/*
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	/*final static Logger logger=Logger.getLogger(MainApp.class);*/
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		/*Properties prop=new Properties();
		prop.load(new FileInputStream("/FirstSpring/src/log4j.properties"));
		PropertyConfigurator.configure(prop);
		
		logger.debug("This is debug");
		logger.info("This is INFO");*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorld");
		helloWorld.getMessage();
		System.out.println("hello world");
		
	}

}
