
package com.dev.practise;
 import java.util.HashMap; 
 public class EImplement implements EInt 
 { HashMap<String,E> hs = new HashMap<String,E>();
 public static void main(String[] args) {
 

}
 



@Override
public boolean removeE(String i , E k) {
	hs.remove(i,k);
	return true;
}

	



@Override
public void getE() {
	System.out.println(hs);
	
} 
@Override
public boolean putE(String i, E k) {
	if(k != null) {
		hs.put(i, k);
		return true;
		
	}
	{
	return false;
} }


 }
