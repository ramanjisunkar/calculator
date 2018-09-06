package com.teamsankya.calculator;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.CORBA.OBJ_ADAPTER;

@RunWith(Parameterized.class)
public class AdditionTest {
	private int a;
	private int b;
	private int sum;
	public AdditionTest(int a,int b,int sum) {
		this.a=a;
		this.b=b;
		this.sum=sum;
	}
	
	@Test
	public void addIntTest()
	{
		int sum=Addition.add(a,b);
		Assert.assertEquals(this.sum,sum);

	}
	public void addDoubleTest()
	{
		double sum=Addition.add(10.5,20.5);
		Assert.assertEquals(35, sum);

	}
	@Parameters
	public static Collection<Object[]> input(){
		return Arrays.asList(new Object[][] {{5,3,8},{5,8,13},{2,9,11},{8,9,17}});
	}

}
