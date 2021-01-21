package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Datas {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date d1 = sdf1.parse("28/07/2020 01:45:18");
		Date d2 = new Date();
		Date d3 = new Date(System.currentTimeMillis());
		Date d4 = new Date(1000L * 60L * 60L * 24L * 365L * 12);
		Date d5 = Date.from(Instant.parse("1999-10-08T05:00:00Z"));
		
		System.out.println("No format:");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("--------------------");
		System.out.println("sdf1: ");
		System.out.println(sdf1.format(d1));
		System.out.println(sdf1.format(d2));
		System.out.println(sdf1.format(d3));
		System.out.println("--------------------");
		System.out.println("sdf2: ");
		System.out.println(sdf2.format(d1));
		System.out.println(sdf2.format(d2));
		System.out.println(sdf2.format(d3));
		System.out.println("--------------------");
		System.out.println("sdf3: ");
		System.out.println(sdf3.format(d1));
		System.out.println(sdf3.format(d2));
		System.out.println(sdf3.format(d3));
		System.out.println("--------------------");
		System.out.println(sdf2.format(d4));
		System.out.println(sdf1.format(d5));
	}

}
