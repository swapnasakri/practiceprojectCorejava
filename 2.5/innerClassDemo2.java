package com.map;

public class innerClassDemo2 {
	
		private String msg="Inner Classes";

			 void display(){  
				 class Inner{  
					 void msg(){
						 System.out.println(msg + " welcome");
					 }  
			  }  
			  
			  Inner l=new Inner();  
			  l.msg();  
			 }  

			 
			public static void main(String[] args) {
		innerClassDemo2  ob=new innerClassDemo2 ();  
				ob.display();  
				}
			}


