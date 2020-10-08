package com.threeMax;

import java.util.Comparator;

public class ThreeMax {
      public  <T extends Comparable<T>> T maximum(T x,T y,T z) {
    	  T max=x;
    	  if(y.compareTo(max)>0) {
    		  max=y;
    	  }
    	  if(z.compareTo(max)>0) {
    		  max=z;
    	  }
    	  return max;
      }
      
     /* public  Float  maximumFloat(Float x,Float y,Float z) {
    	  Float max=x;
    	  if(y.compareTo(max)>0) {
    		  max=y;
    	  }
    	  if(z.compareTo(max)>0) {
    		  max=z;
    	  }
    	  return max;
      }
      
      public  String  maximumString(String x,String y,String z) {
    	  String max=x;
    	  if(y.compareTo(max)>0) {
    		  max=y;
    	  }
    	  if(z.compareTo(max)>0) {
    		  max=z;
    	  }
    	  return max;
      }
      */
}
