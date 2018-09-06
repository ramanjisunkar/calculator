package com.teamsankya.calculator;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Addition {
	final static Logger logger= Logger.getLogger(Addition.class);
	static
	{
		
		Layout lo=new SimpleLayout();
		ConsoleAppender conapp=new ConsoleAppender(lo);
			logger.addAppender(conapp);
			
		try {
			FileAppender capp =new FileAppender(lo, "my.txt", true);
			logger.addAppender(capp);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static int add(int a,int b)
	{
		logger.info("inside add 2 ints method");
		return a+b;
	}
	public static double add(double a,double b)
	{
		logger.info("inside add 2 double method");
		return a+b;
	}

}
