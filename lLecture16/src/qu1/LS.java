package qu1;

import java.io.File;

public class LS {

	public static void main(String[] args) {
		
		LS ls = new LS();
		
		ls.showFiles();
		ls.fileExist();
		ls.isThisDirectory();
		ls.fileLength();
		ls.listFiles2();
		

	}
	


	
	// List files in a Directory
	// -------------------------	
	
	public void showFiles(){
		
		String path = "."; 
		
		File file = new File(path);
		String[] fileNames = file.list();
		
		for(String s : fileNames){
			System.out.println(s);
		}
		
		System.out.println();
		
	}
	
	// Determine Whether File Exists
	// -----------------------------
	
	public void fileExist(){
		File file = new File("test.txt");
		System.out.println("Does test.txt exist? " + file.exists());
		
		System.out.println();
	}
	
	
	// Determines Whether a File is a Directory
	// ----------------------------------------
	
	public void isThisDirectory(){
		File file = new File("test.txt");

		boolean isDirectory = file.isDirectory();
		System.out.println("Is test.txt a directory? " + isDirectory);
		
		System.out.println();
	}
	
	
	// File Length (bytes)
	// -------------------
	
	public void fileLength(){
		
		File file = new File("test.txt");
		double x = file.length();
		
		System.out.println("File Length: " + x + " bytes");
		
		System.out.println();
	}
	
	
	
	
	
	
	 public void listFiles2() 
	 {
	  
	   // Directory path here
	   String path = "."; 
	  
	   String files;
	   File folder = new File(path);
	   File[] listOfFiles = folder.listFiles(); 
	  
	   for (int i = 0; i < listOfFiles.length; i++) 
	   {
	  
	    if (listOfFiles[i].isFile()) 
	    {
		    files = listOfFiles[i].getName();
		    System.out.println(files);
	       }
	   }
	 }
	 
	 
	 
	


}
