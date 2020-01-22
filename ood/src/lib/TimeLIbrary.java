package lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeLIbrary {
	
	private Date today = new Date();
	
	private SimpleDateFormat year =new SimpleDateFormat("YYYY"),
	 month = new SimpleDateFormat("MM"),
	 day = new SimpleDateFormat("dd"),
	 hour24 =new SimpleDateFormat("HH"),
	 hour12 =new SimpleDateFormat("kk"),
	 minute =new SimpleDateFormat("mm"),
	 second =new SimpleDateFormat("ss");
	
	
	
	
	public int now (String type) { //표시할 시간 타입을 변수로 받아온다.
		
		switch(type) {
		case "year"  : return Integer.parseInt(year.format(today));
		case "month" : return Integer.parseInt(month.format(today));
		case "day"   : return Integer.parseInt(day.format(today));
		case "hour24": return Integer.parseInt(hour24.format(today));
		case "hour12": return Integer.parseInt(hour12.format(today));
		case "minute": return Integer.parseInt(minute.format(today));
		case "second": return Integer.parseInt(second.format(today));
		}
		System.out.println("error!");
		return 0;
	}
}