package com.exception;

public class exceptionDemo {
	
	    public static void main(String args[]) 
	    {
	        int[] array = new int[3];
	        try 
	        {
	            array[7] = 3;
	        }
	      
	        
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!");
	        }
	        
	        catch (ArithmeticException e1)
	        {
	        	System.out.println("zeo by division exception");
	        }
	        
	        finally 
	        {
	            System.out.println("The array is of size " + array.length);
	            
	        }
	        
	        }
}
	        
	    
	    

