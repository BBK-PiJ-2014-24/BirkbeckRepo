package basicReadandWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class caveTestRead {

	public static void main(String[] args) {
		caveTestRead c = new caveTestRead();
		c.launch();

	}
	
	public void launch(){
		
		File file = new File("test.txt"); // creates a pointer to test.txt
		BufferedReader br = null; // Needs to be Initialized outside try-block so that if FileReader
								  // fails then, br is still initialized and the program can continue on 
								  // to close file.
		
		try{
			FileReader fr = new FileReader(file);   // FileReader Opens File for Reader, but this is risky
													// as file may not be able to be opened
		    br = new BufferedReader(fr); // Need to read file 1 line at a time, not 1 char at 
										// a time. Use fr as argument to link br with fr.
		
			String line;
			//line = br.readLine();   // This line only reads one line at a time. 
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		
			
		}
		catch(FileNotFoundException e1){
			System.out.println("Cannot Open File: " + file.toString());  // more user friendly than stack trace.
		}
		catch(IOException e2){
			System.out.println("Unable to Read File: " + file.toString()); // br.readLine() may not be able to 
																		   // read file.
		}
		
		finally{  // ensure that file is closed.
			try{
				br.close();   // close() is another method so needs its own try/catch block 
			}
			catch(IOException e3){
				System.out.println("Unable to Close File: " + file.toString());
			}
		}
		
	}
	
	
	
	

}
