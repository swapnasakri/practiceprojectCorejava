package com.validation;

import java.util.ArrayList;
import java.util.Scanner;


public class EmailValidation{
	public static void main(String[] args) {
		ArrayList<String> emailID =new ArrayList<String>();
		emailID.add("rahesgp@gmail.com");
		emailID.add("rahesgp@gmax.com");
		emailID.add("naiba@gmail.com");
		emailID.add("Harisha.123@gmail.com");
		emailID.add("456sri@gmail.com");
		emailID.add("devitsd@gmail.com");
		emailID.add("8dish34@gmail.com");
		emailID.add("devshish.123@gmail.com");
		emailID.add("kia.hoch@gmail.com");
		
		//String searchElement =null;
		
		System.out.println("enter the email to search");
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();
		
		for( int i=0; i<emailID.size(); i++) {
			if(a.equals(emailID.get(i))) {
			System.out.println(emailID.get(i));
			//if(a==emailID.get(i)) {
				System.out.println("\n");
				System.out.println("element is found with the name of :"+a);
		      break;
			}
		
			else 
			{
				System.out.println("element is not found");
			
			}
		}
		}
		
}
		
	
	


		
			
		
	 



	