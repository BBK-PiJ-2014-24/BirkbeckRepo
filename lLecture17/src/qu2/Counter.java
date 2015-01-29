package qu2;

public class Counter {
	
		private int n = 0; 
		private boolean finishCount = false;
		
		public synchronized void increase() {
				n++; 
		}
		
		// getter
		// ------
		public synchronized int getCount() { 
				return n;
		} 
}
