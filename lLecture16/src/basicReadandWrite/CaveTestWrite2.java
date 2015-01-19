package basicReadandWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CaveTestWrite2 {

	public static void main(String[] args){
		CaveTestWrite2 c = new CaveTestWrite2();
		c.launch();
	}
	
	public void launch(){
		
		File file = new File("test2.txt");
			
		PrintWriter pw = null;
		try {
			//FileWriter fw = new FileWriter(file);
			pw = new PrintWriter(file);
			
			pw.write("Hello Ruzhen, ");
			pw.write("Give me a Hug, ");
			pw.write("sweet heart");
			
		} 
		
		catch (IOException e) {
			System.out.println("Cannot Write to File: " + file.toString());
		}
		
		finally{
			pw.close(); // PrintWriter Does Not Throw an IOException so need to be caught in
						// catch/block
		}
	}
}
