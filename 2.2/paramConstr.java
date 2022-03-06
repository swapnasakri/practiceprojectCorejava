package com.constructor;


	//parameterized constructor
	class Emp{
		int rollno;
		String name;

		Emp(int i,String n)
		{
		rollno=i;
		name=n;
		}

		void display() {
		System.out.println(rollno+" "+name);
		}
	}

	public class paramConstr {
	public static void main(String[] args) {

		Emp std1=new Emp(2,"Alex");
		Emp std2=new Emp(10,"Annie");
		std1.display();
		std2.display();
			}
	}
