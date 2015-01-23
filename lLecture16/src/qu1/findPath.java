package qu1;

import java.io.File;
import java.io.IOException;

public class findPath {

	public static void main(String[] args){
		
		File file = new File(".");
		try{
			String s = file.getCanonicalPath();
			System.out.println(s);
		}
		catch(IOException ex){
			System.out.println("Path Failure");
		}
		
	
	}
}
