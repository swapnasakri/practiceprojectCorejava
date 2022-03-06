package com.constructor;


	//default constructor
	class empInfo{
		int id;
		String name;
	   empInfo(){
	    }

	void display() {
		System.out.println(id+" "+name);
		}
	}

	public class conStructor {

	public static void main(String[] args) {

		empInfo emp1=new empInfo();
		empInfo emp2=new empInfo();

		emp1.display();
		emp2.display();
		}
	}