package com.dev.methods;

public class MethodExample {
 public static void main(String [] args) {
	 Method me = new Method();
	 int area=Method.calcArea(10);  //call the previous  Method with class name and .operator
	 System.out.println("Area of square "+area);

 int area1= me.areaRec(10,10);                                   //call the previous Method with class name and .operator
 System.out.println("Area of rect " +area1);
 }
 
 
 
}
