package com.teamsankya.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {
	@Test
	public void divisionIntTest()
	{
		
		int res=Division.dived(10,2);
		Assert.assertEquals(5,res);
	}
	@Test
	public void divisionDoubleTest()
	{
		
		double res=Division.dived(10.5,2.5);
		Assert.assertEquals(0.05,res);
	}

}
