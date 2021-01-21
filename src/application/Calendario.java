package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Calendario {
	
	public static void main (String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf1.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date data = Date.from(Instant.parse("1999-10-08T14:25:47Z"));
		
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.setTime(data);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = 1 + cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("Date: "+ sdf1.format(data));
		System.out.println("Day: "+ day);
		System.out.println("Month: "+ month);
		System.out.println("Year: "+ year);
		System.out.println("Hour: "+ hour);
		System.out.println("Minute "+ minute);
		System.out.println("Second: "+ second);
		
		
		
	}

}
