package com.map;

abstract class anoInnerDemo {
	
		//anonymous inner class
			public abstract void display();

				
	          public class innerClassAssisted3 {
	          }
	          

				public static void main(String[] args) {
					anoInnerDemo i = new anoInnerDemo() {

				         public void display() {
				            System.out.println("Anonymous Inner Class");
				         }
				      };
				      i.display();
				}
				
	          }



