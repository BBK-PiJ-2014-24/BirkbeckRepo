/*
 * do {practice} while (!understood);
Make a class that implements a method that reads a list of marks between 0 and 100 from the user, 
one per line, and stops when the user introduces a -1. The program should output at the end 
(and only at the end) how many marks there were in total, how many were distinctions (70–100), 
how many were passes (50–69), how many failed (0–49), and how many were invalid (e.g. 150 or -3). 
Use readLine() exactly once. The output may look similar to this example:

Input a mark: 13
Input a mark: 45
Input a mark: 63
Input a mark: 73
Input a mark: 101
Input a mark: 45
Input a mark: 18
Input a mark: 92
Input a mark: -1
There are 7 students: 2 distinctions, 1 pass, 4 fails (plus 1 invalid).
 */

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
			Scanner importConsole = new Scanner(System.in);
			int countD = 0;
			int countP = 0;
			int countF = 0;
			int countI = 0;
			int numStuds=0;
			int score;
			boolean endProgram = false;
			
		// Input
		// -----
		do{
			System.out.println("Input a Mark: " );
			score = importConsole.nextInt();
			
			if(score>100 || score < -1)
				countI++;
			else if(score >=70)
				countD++;
			else if(score >= 50)
				countP++;
			else if(score >= 0)
				countF++;
			else
				endProgram = true;			
		} while(!endProgram);
		
		numStuds = countD+countP+countF+ countI;
		
		System.out.println("Number of Students: " + numStuds);
		System.out.println("Number of Dist: " + countD);
		System.out.println("Number of Pass: " + countP);
		System.out.println("Number of Fail: " + countF);
		System.out.println("Number of Invalid: " + countI);
		
		importConsole.close();
		
	} //end main
} // end class
