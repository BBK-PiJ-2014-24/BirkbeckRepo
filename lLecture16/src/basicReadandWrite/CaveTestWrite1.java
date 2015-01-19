package basicReadandWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CaveTestWrite1 {

	public static void main(String[] args) {
		CaveTestWrite1 c = new CaveTestWrite1();
		c.launch();
	}
	
	public void launch(){
		
		File file  = new File("test3.txt"); // pointer to file
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write("Hello Java World\n");
			bw.write("This is the end");
		} 
		
		catch (IOException e) {        // 
			System.out.println("File Not Writable: " + file.toString());
		}
		
		try {
			bw.close();
		} catch (IOException e) {
			System.out.println("unable to Close File");
		}
		
	}

}
