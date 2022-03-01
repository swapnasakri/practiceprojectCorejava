package practice.project;

import java.io.InputStream;
import java.util.Scanner;

public class Calculator {
	static  long num1,num2;

	Calculator (long num1,long num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Calculator obj=new Calculator(num1,num2);
		
    System.out.println("1. Addition");
		System.out.println("2. Substarction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
	System.out.println("what would you like to choose?:");
		int choice =sc.nextInt();
		if(choice==1) {
			Addition();
		}
		else if(choice==2) {
			Substraction();
		}
		else if(choice==3) {
			Multiplication();
		}
		else if(choice==4) {
            Division();
		}
		
		}
static void display()
{
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter the first number");
	num1=sc.nextInt();
	System.out.println("enter the second number");
	num2=sc.nextInt();
	
}
		 final static  void  Addition()
		{
			 Calculator. display();
			int sum;
			
			
	         
				 sum=  (int) ((int)num1+num2);
				 System.out.println("the sum of the no is " + sum);
			
			}
				 static final void Substraction()
			 {
				 Calculator.display();
				 long sub;
				 sub=num1-num2;
				 System.out.println("the sub of no is " +sub);
				 }
			 static final void  Multiplication()
			 {
				 Calculator.display();
				 int mul;
				 mul=(int) ((int)num1*num2);
				 System.out.println("the mul of no is " +mul);
				 
				}
			 static final void Division()
			 {
				Calculator.display();
				double div;
				div=num1/num2;
				System.out.println("the div of no is " +div);
			 }
			 }

			
	
	
