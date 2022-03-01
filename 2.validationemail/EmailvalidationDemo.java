package com.validationDemo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailvalidationDemo {

	public static void main(String[] args) {
		
				ArrayList<String> emailID =new ArrayList<String>();
				emailID.add("rahesgp@gmail.com");
				emailID.add("rahesgp@gmax.com");
				emailID.add("naiba@gmail.com");
				emailID.add("Harisha.123@gmail.com");
				emailID.add("sri@gmail.com");
				emailID.add("devitsd@gmail.com");
				emailID.add("8dish34@gmail.com");
				emailID.add("devshish.123@gmail.com");
				emailID.add("kia.hoch@gmail.com");
				//add invalid emails in list
			emailID.add("@yahoo.com");
			emailID.add("java#com");
			//regular expression
			String regex="^(.+)@(.+)$";
			//comiple regular expression
			Pattern pattern=Pattern.compile(regex);
			for(String email:emailID) {
				Matcher matcher=pattern.matcher(email);
				System.out.println(email+":"+matcher.matches()+"\n");
			}
						
			
				
				
				}
				
		}
				
			
		