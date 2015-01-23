package qu8;

public class TempAvgTest {

	public static void main(String[] args) {
		
		TempAvgTest t = new TempAvgTest();
		t.launch();
	
	}

	public void launch(){
		TempAverage ta = new TempAverage();
		ta.readCSV();
		
	}
}
