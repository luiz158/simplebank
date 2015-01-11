package br.fatea.simplebank.util;

import java.security.InvalidParameterException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DatetimeUtil {

	public static final String PATTERN_SOAP_DATETIME = "yyyy-MM-dd HH:mm:ss";
	
	private static final Map<String, DateFormat> patterns = new HashMap<String, DateFormat>();
	
	public static String now(String pattern){
		DateFormat dateFormat = getFormat(pattern);	
		return dateFormat.format(new Date());
	}
	
	public static Calendar asCalendar(String datetime, String pattern){
		DateFormat dateFormat = getFormat(pattern);
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dateFormat.parse(datetime));
			return calendar;
			
		} catch (ParseException e) {
			throw new InvalidParameterException("Invalid Datetime Pattern("+pattern+")");
			
		}
	}

	private static DateFormat getFormat(String pattern) {
		DateFormat dateFormat;
		
		if (!patterns.containsKey(pattern)) {
			dateFormat = new SimpleDateFormat(pattern);
			patterns.put(pattern, dateFormat);	
		}
		
		dateFormat = patterns.get(pattern);
		return dateFormat;
	}
	
}
