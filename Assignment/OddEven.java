package com.practical;


 class Odd{
	 public void odd() {
		 int [] arr = new int [] {1, 2, 3, 4, 5,6,7,8};
	        System.out.println("Elements of given array present on odd position: ");  
	        //Loop through the array by incrementing value of i by 2  
	        for (int i = 0; i < arr.length; i = i+2) {  
	            System.out.println(arr[i]);  
	        }  
	 }
	 
	 public void  even() {
		 int [] arr = new int [] {1, 2, 3, 4, 5,6,7,8};  
	        System.out.println("Elements of given array present on even position");  
	        //Loop through the array by incrementing value of i by 2  
	        for (int i = 1;i < arr.length; i = i+2) {  
	            System.out.println(arr[i]);  
	        }  
	 }
	
	
	
}
 



public class OddEven {
	public static void main(String args[] ) {
		Odd o=new Odd();
		o.odd();
		o.even();
		
		
		
		
	}

}
