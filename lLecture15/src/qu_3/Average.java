package qu_3;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Average a = new Average();
		double ans = a.averageCalc();
		System.out.println("answer = " + ans);

	}
	
	public double averageCalc(){
		
		Scanner importConsole = new Scanner(System.in);
		boolean flag = false;
		int total = 0;
		int n = 3;
		
		for(int i=0;i<n;i++){
			flag = false;
			while(flag == false){
				try{
					System.out.println("Input Number " + (i+1) + ":" );
					int x = importConsole.nextInt();
					// System.out.println("Your Number " + (i+1) + ":" + x);
					flag = true;
					total += x;
					}
				catch(Exception ex){
					System.out.println("Wrong Input! Please Re-Input");
					importConsole.next();               // REQUIRE THIS FLUSH THE SYSTEM AFTER
					}
			} // end while
		}  // end  for..loop
		return total/n;
	} // end method
	
	

} // end class
