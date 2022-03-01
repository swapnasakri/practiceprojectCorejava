package com.fixbugs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FixbugsDemo {
	

	public static void main(String[] args) {
		optionSelection();

	}

	private static void optionSelection() {
		String[] arr= {"1.review expenditure",
				     "2.add expenditure",
				    " 3.delete expenditure",
				    "4.sort expenditure",
				    "5.search the particular expenditure",
				    "6.close the application"
		};
		
		int[] arr1= {2,3,4,5,6,7};
		int len=arr1.length;
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
			//display the all the strings mentioned in the string array
			}
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		ArrayList<Integer> expenses=new ArrayList<Integer>();
		expenses.add(1000);
		expenses.add(2000);
		expenses.add(3000);
		expenses.add(5000);
		expenses.addAll(arrlist);
		System.out.println("enter the choice:\t");
		Scanner sc=new Scanner(System.in);
		int options=sc.nextInt();
		for(int j=1;j<=len;j++) {
			if(options==j) {
				switch(options) {
				case 1:
					System.out.println("your saved expenses are listed below:\n");
					System.out.println(expenses+"\n");
					optionSelection();
					break;
				case 2:
					System.out.println("enter the value to add your ezpense:\n");
					int value=sc.nextInt();
					expenses.add(value);
					System.out.println("your value is updated\n");
					expenses.addAll(arrlist);
					System.out.println(expenses+"\n");
					optionSelection();
					break;
				case 3:
					System.out.println("delete all your expenses:\n");
					int con_choice=sc.nextInt();
					if(con_choice==options) {
						expenses.clear();
						System.out.println("expenses:\n");
						System.out.println("all expenses deleted");
					}
					else {
						System.out.println("oops.....try again");
					}
					optionSelection();
					break;
				case 4:
					sortExpenses(expenses);
					optionSelection();
					break;
				case 5:
					searchExpenses(expenses);
					optionSelection();
					break;
				case 6:
					closeApp();
					break;
					default:
						System.out.println("inavalid choice!");
						break;
				}
			}
		}
	}

	private static void closeApp() {
		// TODO Auto-generated method stub
		System.out.println("closing application");
	}
		
	

	private static void searchExpenses(ArrayList<Integer> arrayList) {
		int leng =arrayList.size();
		System.out.println("enter the expenses to search:\t");
		Scanner sc =new Scanner(System.in);
		int input=sc.nextInt();
		//linear search
		for(int i=0;i<leng;i++)
		{
			if(arrayList.get(i)==input) {
				System.out.println("found the expenses "+ input + "at "+ i +" position");
			}
		}
	}
	private static void sortExpenses(ArrayList<Integer> arrayList) {
		int arrlength=arrayList.size();
		//sorted in an ascending order
           Collections.sort(arrayList);
          System.out.println("sorted expenses: ");
     for(Integer i:arrayList) {
	System.out.println(i + " ");
	}

	
	
	
		
	}
	
					
}
