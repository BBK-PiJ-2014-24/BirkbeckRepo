package qu2;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

import java.util.Calendar;
import java.util.GregorianCalendar;	
import java.util.TimeZone;




public class MyDate_Impl extends UnicastRemoteObject implements MyDate_Interface{
	
	public MyDate_Impl() throws RemoteException{
		super();
	}
	
	
	@Override
	public String printTimeStamp() throws RemoteException{
		
		TimeZone tz = TimeZone.getTimeZone("Europe/London");
		Calendar cal = new GregorianCalendar();
		cal.setTimeZone(tz);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		
		int hr = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		
		String s = "Date: " + day + "/" + month + "/" + year + " Time: " + hr + ":" + min;
		return s;
	}
	
}