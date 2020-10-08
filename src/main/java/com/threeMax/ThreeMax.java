package com.threeMax;

import java.util.Arrays;

//import java.util.Comparator;

public class ThreeMax <T extends Comparable<T>>{
	  T[] array;
	  
	  public ThreeMax(T[] array) {
		  this.array=array;
	  }
	  
	 public  T testMaximum() {
		  T a = maximum(array);
		  printMax(a);
		  return a;
	  }
	
      public  T maximum(T[] array) {
    	  Arrays.sort(array);
    	  if(array.length!=0)
    	      return array[array.length-1];
    	  else
    		  return null;
      }
      public <T> void printMax(T max) {
    	  System.out.println("Max is " +max);
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
