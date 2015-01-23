/* Qu.8 
 * Write a program that reads a file from disk in comma-separated format (CSV). 
 * Every line must contain a list of number separated by commas.
 * The program must output the average for every line plus the average for the whole file.
 */


package qu8;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TempAverage {

	public void readCSV(){	
		
		final String DELIMITER = ", "; 
		List<Integer> lineAvg = new ArrayList<Integer>(); 
		int k = 1; // lineCounter
		int fileAvg; // average of all the lines;
		
		File file = new File("Numbers2.csv");
		BufferedReader br = null;
	    
		
		try{
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			
			while((line = br.readLine()) != null){
				List<Integer> numArray = new ArrayList<Integer>();
				String[] strNum  = line.split(DELIMITER);
				int avg;
				
				for(String s : strNum ){
					int x = Integer.parseInt(s);
					numArray.add(x);
				}
				avg = calcAvg(numArray); // calc the line average
				System.out.println("Line " + k + " Average: " + avg);
				k++;
				lineAvg.add(avg);  // store the avg of the lines
			}
			fileAvg = calcAvg(lineAvg);
			System.out.println("The Average of all the Lines: " + fileAvg);
			
		}
		catch(FileNotFoundException ex1){
			System.out.println("File Can't Be Found!");
		}
		catch(IOException ex2){
			System.out.println("File Cannot Be Opened!");
		}
		finally{
			try{
				br.close();
			}
			catch(IOException ex3){
				System.out.println("File Could Not be Closed!");
			}
		}
		
		
	} // end readSV
	
	public int calcAvg(List<Integer> list){
		
		int total=0;
		int ans = 0;
		
		for(Integer i : list){
			total += i; 
		}
		
		ans = total/list.size();
		return ans;
	}
	
}
