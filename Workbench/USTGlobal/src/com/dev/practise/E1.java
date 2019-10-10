
  package com.dev.practise;
  
  public class E1 {
  
  public static void main(String[] args) {
 
  E e1 =new E(); 
  EImplement l = new EImplement();
 
 e1.setName("Jenny");
 e1.setId(1200);
 e1.setAge("twenty");
boolean b = l.putE("1",e1);                      //add
System.out.println(b);
 l.getE();
 
  
  E e2 = new E();
  e2.setName("Palak");
  e2.setId(1389); 
  e2.setAge("twentyone");
  boolean  b1= l.putE("2", e2);                 // add
  System.out.println(b1);
  l.getE();
 
 
  
 E e3 = new E(); 
 e3.setName("alii");
 e3.setId(1389);
 e3.setAge("twentyone");
 boolean b2 =l.putE("3", e3);                        
 System.out.println(b2);
  l.getE();
 
  boolean b3= l.removeE("1",e1);        //remove
 System.out.println(b3);
 l.getE();
  
 
  e3.setName("jin");           //update
  l.putE("2", e3);
  l.getE();
  
  }
  }


 
