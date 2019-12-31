package jdbc;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class MyCalendar {
	
	private static int howManyDaystoDate;
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		int yr = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		
		System.out.println(day+":"+(mon+1)+":"+yr);
		Date dt = new Date();
		long millis = dt.getTime();
		Calendar calndr = Calendar.getInstance();
		calndr.setTime(dt);
		calndr.setTimeInMillis(millis);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		System.out.println(dtf.format(ld));
		
		howManyDaystoDate("05-01-2021");
		
		
		
	}
	private static int howManyDaystoDate(String date) {
		int numDays = 0;
		LocalDate today = LocalDate.now();
		int thisyear = today.getYear();
		int thismonth = today.getMonthValue();
		int day = today.getDayOfMonth();
		
		System.out.println(thisyear+":"+thismonth+":"+day);
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate futureDate = LocalDate.from(dtf.parse(date));
		
		int futureYear = futureDate.getYear();
		int futureMonth = futureDate.getMonthValue();
		int futureDays = futureDate.getDayOfMonth();
		System.out.println(futureYear+":"+futureMonth+":"+futureDays);
		
		System.out.println("--------using chronusunits----------");
		
		long daysBetween = ChronoUnit.DAYS.between(today, futureDate);
		System.out.println(daysBetween);
		return numDays;
		
		
	}
	
}
