package com.threeMax;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
     public void GivenMaxNumberAmongInteger_atFirstPosition_ReturnSameNumber() {
    	 ThreeMax findMax=new ThreeMax();
    	 int getMax=findMax.maximumInteger(10,5,2);
         Assert.assertEquals(10, getMax);
     }
     @Test
     public void GivenMaxNumberAmongInteger_atSecondPosition_ReturnSameNumber() {
    	 ThreeMax findMax=new ThreeMax();
    	 int getMax=findMax.maximumInteger(5,10,2);
         Assert.assertEquals(10, getMax);
     }
     @Test
     public void GivenMaxNumberAmongInteger_atThirdPosition_ReturnSameNumber() {
    	 ThreeMax findMax=new ThreeMax();
    	 int getMax=findMax.maximumInteger(2,5,10);
         Assert.assertEquals(10, getMax);
     }
     
    
	@Test
     public void GivenMaxNumberAmongFloat_atFirstPosition_ReturnSameNumber() {
    	 ThreeMax findMax=new ThreeMax();
    	 Float getMax=findMax.maximumFloat(10.0F,5.0F,2.0F);
         Assert.assertEquals((Float)10.F, getMax);
     }
     @Test
     public void GivenMaxNumberAmongFloat_atSecondPosition_ReturnSameNumber() {
    	 ThreeMax findMax=new ThreeMax();
    	 Float getMax=findMax.maximumFloat(5.0F,10.0F,2.0F);
         Assert.assertEquals((Float)10.0F, getMax);
     }
     @Test
     public void GivenMaxNumberAmongFloat_atThirdPosition_ReturnSameNumber() {
    	 ThreeMax findMax=new ThreeMax();
    	 Float getMax=findMax.maximumFloat(2.0F,5.0F,10.0F);
         Assert.assertEquals((Float)10.0F, getMax);
     }
}
