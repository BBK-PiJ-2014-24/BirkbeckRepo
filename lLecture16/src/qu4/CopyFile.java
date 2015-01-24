/*
 * 4 cp a)
Write a program that takes two names from the user at the command line. If a file with the first 
name exists, the program must copy it into a file with the second name.
If the first file does not exist, the program must say so. If the second file does exists, the 
program must ask the user whether to overwrite it or not, and act accordingly.
 */

package qu4;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args){
		
		CopyFile cf = new CopyFile();
		// File f1 = new File(args[0]);
		// File f2 = new File(args[1]);
		
		File f1 = new File("test.txt");
		File f2 = new File("test3.txt");
		cf.testFilesExist(f1, f2);
				
	}
	
	public void testFilesExist(File f1, File f2){
		
		if(f1.exists()){
			if(f2.exists()){
				boolean ask = askPermission(f2);
				if(ask)
					transfer(f1,f2); 
				else
					System.out.println("Copy Aborted");
			}
			else{
				transfer(f1,f2);   // f1 Exist, f2 Not Exist
			}
		}
		else{
			System.out.println("File "+ f1.toString() + "Does Not Exist");  // f1 Does Not Exist
		}
	}
	
	public boolean askPermission(File f2){
		
		Scanner importConsole = new Scanner(System.in);
		System.out.println("Do You Want to Overwrite " + f2.toString() + "? Y/N");
		String s = importConsole.nextLine();
		
		if(s.equals("Y"))
			return true;
		else
			return false;
	}
	

	public void transfer(File f1, File f2){
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try{
			FileReader fr = new FileReader(f1);
			br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(f2);
			bw = new BufferedWriter(fw);
			
			String line;
			
			while((line = br.readLine()) != null){
				bw.write(line);   
				bw.newLine();    //Write New Line!!!
				System.out.println(line);
			}
			
			
		}
		catch(FileNotFoundException ex1){
			System.out.println("File Not Found: " + f1.toString());
		}
		catch(IOException ex2){
			System.out.println("File " + f1.toString() + " Cannot be Copied to " + f2.toString() );
		}
	finally{
		
		try{
			bw.close();
		}
		catch(IOException ex3){
			System.out.println("File Could Not be Closed: " + f1.toString());
		}
		
		try{
			br.close();
		}
		catch(IOException ex3){
			System.out.println("File Could Not be Closed: " + f2.toString());
		}
		
	}
		
		
	}
	
	
}
