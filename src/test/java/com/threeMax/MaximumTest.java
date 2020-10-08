package com.threeMax;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
	@Test
	public void GivenMaxNumberAmongInteger_atFirstPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax(10, 5, 2);
		Assert.assertEquals(10, findMax.testMaximum());
	}

	@Test
	public void GivenMaxNumberAmongInteger_atSecondPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax(5, 10, 2);
		Assert.assertEquals(10, findMax.testMaximum());
	}

	@Test
	public void GivenMaxNumberAmongInteger_atThirdPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax(2, 5, 10);
		Assert.assertEquals(10, findMax.testMaximum());
	}

	@Test
	public void GivenMaxNumberAmongFloat_atFirstPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax(10.0F, 5.0F, 2.0F);
		Assert.assertEquals((Float) 10.F, findMax.testMaximum());
	}

	@Test
	public void GivenMaxNumberAmongFloat_atSecondPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax(5.0F,10.0F, 2.0F);
		Assert.assertEquals((Float) 10.0F, findMax.testMaximum());
	}

	@Test
	public void GivenMaxNumberAmongFloat_atThirdPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax(2.0F, 5.0F, 10.0F);
		Assert.assertEquals((Float) 10.0F, findMax.testMaximum());
	}

	@Test
	public void GivenMaxNumberAmongString_atFirstPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax("abe", "abd", "abc");

		Assert.assertEquals("abe", findMax.testMaximum());
	}

	@Test
	public void GivenMaxNumberAmongString_atSecondPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax("abd", "abe", "abc");

		Assert.assertEquals("abe", findMax.testMaximum());
	}

	@Test
	public void GivenMaxNumberAmongString_atThirdPosition_ReturnSameNumber() {
		ThreeMax findMax = new ThreeMax("abc", "abd", "abe");

		Assert.assertEquals("abe", findMax.testMaximum());
	}

}
