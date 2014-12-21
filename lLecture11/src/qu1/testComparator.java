package qu1;

public class testComparator {
	
	public static void main(String[] args){
	
	int x = 5;
	int y = 6;
	int z;
	
	double a = 10.1;
	double b = 11.3;
	double d;
	
	Comparator c = new Comparator();
	z = c.getMax(x, y);
	d = c.getMax(a, b);
	
	System.out.println(z);
	System.out.println(d);
	}		

}
