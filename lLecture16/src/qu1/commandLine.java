package qu1;

import java.util.Scanner;

public class commandLine {

	
		   public static void main(String[] args) { 
		      
			   Scanner importConsole = new Scanner(System.in);
			   
			   System.out.println("Hello World");
			   
			   int N = Integer.parseInt(args[0]); 
		      int sum = 0; 
		      for (int i = 0; i < N; i++) 
		         sum += importConsole.nextInt(); 
		         System.out.println("Sum is " + sum); 
		         
		         importConsole.close();
		   } 
		
	
}
