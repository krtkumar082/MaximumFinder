package com.threeMax;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
	@Test
	public void TestCase1_1() {
		Integer[] array= {2,3,8,1,15};
		ThreeMax findMax = new ThreeMax(array);
		Assert.assertEquals(15, findMax.testMaximum());
	}

	@Test
	public void TestCase1_2() {
		Integer [] array= {10,30,20,60,50};
		ThreeMax findMax = new ThreeMax(array);
		Assert.assertEquals(60, findMax.testMaximum());
	}

	
/*
	@Test
	public void GivenMaxNumberAmongFloat_atFirstPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax(10.0F, 5.0F, 2.0F);
		Assert.assertEquals((Float) 10.F, findMax.testMaximum());
	}
*/
	@Test
	public void TestCase2_1() {
		Float[] array= {2.0F,3.0F,16.3F,9.0F,20.0F};
		ThreeMax findMax = new ThreeMax(array);
		Assert.assertEquals((Float) 20.0F, findMax.testMaximum());
	}

	@Test
	public void TestCase2_2() {
		Float[] array= {2.0F, 5.0F, 10.0F,10.3F,10.9F,10.91F};
		ThreeMax findMax = new ThreeMax(array);
		Assert.assertEquals((Float) 10.91F, findMax.testMaximum());
	}

	@Test
	public void TestCase3_1() {
		String[] array= {"kirti","kirt","irt","kir","abc"};
		ThreeMax findMax = new ThreeMax(array);
		Assert.assertEquals("kirti", findMax.testMaximum());
	}

	@Test
	public void TestCase3_2() {
		String[] array= {"capgemini","mini","capg","pgemini","apple","app"};
		ThreeMax findMax = new ThreeMax(array);
		Assert.assertEquals("pgemini", findMax.testMaximum());
	}
/*
	@Test
	public void GivenMaxNumberAmongString_atThirdPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax("abc", "abd", "abe");
		Assert.assertEquals("abe", findMax.testMaximum());
	}
*/
}
