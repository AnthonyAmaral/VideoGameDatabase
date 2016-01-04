package VideoGameDatabase;

//********************************************************************
//Anthony Amaral
//Adds the user's game collection information to the list. This will also show
//the user pricing data. it will also have a seperate txt 
//file that will have all the information created through the program.
//********************************************************************

import java.io.BufferedWriter; 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import VideoGameDatabase.LinkedList;

public class Driver
{
   private static final Object Game = null;

	public static void main(String[] args) throws IOException
	{
	   
	       
	   String title,console, complete, missing;
	   double price;
	   LinkedList Game = new LinkedList();
	   Element object;
	    
	
	            String file = "VideogameDatabase.txt"; 
	                FileWriter fw = new FileWriter (file);                     
	                BufferedWriter bw = new BufferedWriter (fw);
	                PrintWriter outFile = new PrintWriter (bw);
	                     
	                Scanner fileScan = new Scanner(new File("RawDatabase.inp"));
	  
	   while (fileScan.hasNext())  
	   { 
	         console = fileScan.next();
	         title = fileScan.next();
	         price = fileScan.nextDouble();
	         complete = fileScan.next();
	         missing = fileScan.next();
	           
	         
	         object = new Element(console, title, price, complete, missing);
	         
	         
	      Game.add(object);
	      Game.total(price);
	    
	     
	     
	   }
	   fileScan.close();
	   
	   String info = Game.toString();
		
		
		 System.out.println(info);
		 outFile.print(Game.toString());
		 
		 	outFile.close(); 
	   
	   
	   String output = Game.toString();
	}


}
