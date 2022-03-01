package com.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileNotFoundException;


public class FileHandling {
	public static void main (String[] args) throws IOException {
		//creating file
		System.out.println("..............creating file............\n");
		File f1=new File("D:\\fileoperation.txt");
	   try {
		  
		   if(f1.createNewFile()) {
			   System.out.println("File"+f1.getName()+" is created successfully");
		   }else {
			   System.out.println("File is already exist in the directory.");
		   }
	   }
		   catch(IOException exception) {
			   System.out.println("an unexpected error is occured");
			   exception.printStackTrace();
		   }
	   //getting file information
	   System.out.println("......Getting file information.......\n");
	   if(f1.exists()) {
		   System.out.println("The name of the file is:"+f1.getName());
		   System.out.println("The path of the file"+f1.getPath());
		   System.out.println("is file writeable?. "+f1.canWrite());
		   System.out.println("is file readable?. " + f1.canRead());
	   }
		   else {
			   System.out.println("the file does not exist");
		   }
	   //write or append  to a file
	   System.out.println(".........write or append to the file.....\n");
	   FileWriter f2=new FileWriter ("D:\\fileoperation.txt");
	   
	   f2.write("the file operations inside the file");
	   f2.close();
	   System.out.println("content is successfully written");
	   
	   //read from file
	   System.out.println(".......Reading from file........");
	   try {
	   Scanner dataReader=new Scanner(f1);
	   while(dataReader.hasNextLine()) {
		   String fileData=dataReader.nextLine();
		   System.out.println(fileData);
	   }
	   dataReader.close();
	   }
	   catch(FileNotFoundException e) {
		   System.out.println("unexcepted error occured!");
		   e.printStackTrace();
	   }
	   System.out.println("the size of the file in bytes is:\n " +(f1.length()));
	   
	   // delete a file
	   System.out.println(".....Deleting a file........\n");
	  if (f1.delete()) {
		   System.out.println(f1.getName()+ " file is deleted successfully");
	   }
	   else {
		  System.out.println("unexpected error found in the deletion of the file");
		   
		   
	   }
	   
	   
	   
	   }
	   
	   
	   
	   }
	


