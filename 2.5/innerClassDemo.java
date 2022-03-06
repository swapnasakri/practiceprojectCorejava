package com.map;

public class innerClassDemo {
	
		private String msg="Welcome to Java"; 
			 
			 class Inner{  
			  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  



			public static void main(String[] args) {

				innerClassDemo obj=new innerClassDemo();
				innerClassDemo.Inner in=obj.new Inner();  
				in.hello();  
			}
		}



