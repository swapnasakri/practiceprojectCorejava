package com.exception;

public class MyExceptionDemo extends Exception 
 {
	public  MyExceptionDemo(String s) 
    { 
        super(s); 
    } 

 
    public static void main(String[] args) 
    { 
        try
        { 
            throw new MyExceptionDemo("temp"); 
        } 
        catch (MyExceptionDemo ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
 }


