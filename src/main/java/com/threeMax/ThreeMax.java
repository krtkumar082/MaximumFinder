package com.threeMax;

public class ThreeMax {
      public  int  maximumInteger(Integer x,Integer y,Integer z) {
    	  Integer max=x;
    	  if(y.compareTo(max)>0) {
    		  max=y;
    	  }
    	  if(z.compareTo(max)>0) {
    		  max=z;
    	  }
    	  return max;
      }
      
      public  Float  maximumFloat(Float x,Float y,Float z) {
    	  Float max=x;
    	  if(y.compareTo(max)>0) {
    		  max=y;
    	  }
    	  if(z.compareTo(max)>0) {
    		  max=z;
    	  }
    	  return max;
      }
}
