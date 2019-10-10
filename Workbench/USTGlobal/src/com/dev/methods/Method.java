package com.dev.methods;

public class Method {
  
	public  static int j =0;
	static Method me = new Method();
	public static void main(String[] args) {
		
	

		j= calcArea(6);                          
		System.out.println("Area of square is "+j);
		int area1= me.areaRec(2,4);
		System.out.println(" Area of rectangle:" +area1);

	}

	public static int calcArea(int side) {           
		j=side*side;
	  return j;
	}
	public int areaRec(int l , int w){                                                                                                                           
//	j= me.areaRec(4,8);
//	System.out.println(j);
	j=l*w;
		
		return j;
	}             
}

