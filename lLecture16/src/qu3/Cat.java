package qu3;

/*
3 cat a)
Write a program that takes a name from the user at the command line. 
If a file with that name exists, the program must show its contents on screen. 
If it does not, the program must say so.
*/


import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;



public class Cat{
	
	public static void main(String[] args){
	
	
	String filename = args[0];
	
	File file = new File(filename);  // pointer for File
	BufferedReader br = null; 
	
	try{
		FileReader fr = new FileReader(file);
		br = new BufferedReader(fr);
		
		String line;
		
		while((line=br.readLine())!= null){
			System.out.println(line);
		}
	}
	
	catch(FileNotFoundException ex1){
		System.out.println("Can't Find file!!" +  file.toString());
	}
	catch(IOException ex2){
		System.out.println("Can't Read File" + file.toString());
	}
	
	finally{
		try{
			br.close();
		}
		catch(IOException ex3){
			System.out.println("Unable To Close File" + file.toString());
		}
	}
	
		
		
		
	}
}