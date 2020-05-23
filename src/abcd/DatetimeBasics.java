package abcd;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DatetimeBasics {

	public static void main(String[] args) throws ParseException {
		String CPT="15:00:00";
		String shipdate="09-05-2020"+" "+CPT;
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		SimpleDateFormat formatter1=new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss");
		String date="09-05-2020 14:00:00";
		Date date7=formatter.parse(shipdate);
		Date date1=formatter.parse(date);
		String date5=formatter1.format(date1);
		long date3=1589653800000L;
		long date20=1589740200000L;
		Date date4=new Date(date3);
		String date2=formatter.format(date1);
		System.out.println(date2);
		System.out.println(date1.getTime());
		System.out.println(formatter.format(date4));
		System.out.println(date5);
		System.out.println(date7.compareTo(date1));
		long time=new Date().getTime();
		System.out.println(time);
		
		String date9 = "2011-08-12T20:17:46.384Z";
		String date10 = "2011-08-12T20:18:46.384Z";
		SimpleDateFormat formatter3=new SimpleDateFormat("yyyy-MM-dd");
		Date date11=formatter3.parse(date9);
		Date date15=formatter3.parse(date10);
		SimpleDateFormat formatter5=new SimpleDateFormat("MM-dd-yyyy");
		String date13=formatter5.format(date11);
		System.out.println(date13);
		System.out.println(date11+" abc");
		
		
		  String input_date="2012-08-11";
		  SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		  Date dt1=format1.parse(input_date);
		  DateFormat format2=new SimpleDateFormat("EEEE"); 
		  String finalDay=format2.format(dt1);
		  System.out.println(finalDay);
		  System.out.println(date15.compareTo(date11));
		  System.out.println(date9.substring(0, 10));
		  System.out.println(format1.format(date4));
		  System.out.println(formatter.format(date20));

	}

}
