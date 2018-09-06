package com.teamsankya.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class SubstractTest {
	//@Ignore
	@BeforeClass
	public static void exeBeforeClass()
	{
		System.out.println("i execute before class...");
	}
	@AfterClass
	public static void exeFaterClass()
	{
		System.out.println("i execute After class...");
	}
	@Before
	public void m1()
	{
		System.out.println("i  am inside m() of subTest before test case");
		
	}
	@Test
	public void subIntTest()
	{
		int res=Subtraction.subtract(5,2);
		Assert.assertEquals(3,res);
		System.out.println("inside test Int add case");
	}
	@Ignore
	@Test
	public void subDoubTest()
	{
		double res=Subtraction.subtract(10,0.5);
		Assert.assertEquals(9.5,res);
		System.out.println("inside test Double add case");
	}
	
	@After
	public void m2()
	{
		System.out.println("i  am inside m2() of subTest After test case");
		
	}
	
	
	
}
