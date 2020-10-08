package com.threeMax;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
     public void GivenMaxNumber_atFirstPosition_ReturnSameNumber() {
    	 ThreeMax findMax=new ThreeMax();
    	 int getMax=findMax.maximum(10,5,2);
         Assert.assertEquals(10, getMax);
     }
     @Test
     public void GivenMaxNumber_atSecondPosition_ReturnSameNumber() {
    	 ThreeMax findMax=new ThreeMax();
    	 int getMax=findMax.maximum(5,10,2);
         Assert.assertEquals(10, getMax);
     }
     @Test
     public void GivenMaxNumber_atThirdPosition_ReturnSameNumber() {
    	 ThreeMax findMax=new ThreeMax();
    	 int getMax=findMax.maximum(2,5,10);
         Assert.assertEquals(10, getMax);
     }
}
