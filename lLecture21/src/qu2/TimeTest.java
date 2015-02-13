package qu2;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeTest{
	
	public static void main(String[] args){
		
		Calendar cal = new GregorianCalendar();
		TimeZone tz = TimeZone.getTimeZone("Europe/London");
		cal.setTimeZone(tz);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		
		int hr = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		
		
		System.out.println("Date: " + day + "/" + month + "/" + year);
		System.out.println("Time: " + hr + ":" + min);
		
		
		
		
	}
	
}