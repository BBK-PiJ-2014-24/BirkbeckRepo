package Fibo;

public class FibMain {

	public static void main(String[] args) {
		
		
		long startTime = System.currentTimeMillis();
		
			int i = 48;
			Fibonacci f = new Fibonacci();
			int x = f.fib(i);
			System.out.println(x);
		
	      long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;
	      System.out.println(elapsedTime);
		
	}

}
