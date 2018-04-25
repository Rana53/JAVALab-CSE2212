import java.util.*;
import java.text.*;
public class LogAnalyzer{
	
    private ArrayList records;
    
    private static final long ONE_HOUR_IN_MS = 3600000;
    private static final long ONE_MIN_IN_MS = 60000;
    private static final long ONE_SEC_IN_MS = 1000;
    
    LogAnalyzer(){
    	records = new ArrayList();
    	 
    }
    
    public void readFile(){
    	
    }
    
    static String modefyMonth(String month) {
    	if(month.equals("jan"))
    		return "January";
    	else if(month.equals("feb"))
    		return "February";
    	else if(month.equals("mar"))
    		return "March";
    	else if(month.equals("apr"))
    		return "April";
    	else if(month.equals("may"))
    		return "May";
    	else if(month.equals("jun"))
    		return "June";
    	else if(month.equals("jul"))
    		return "July";
    	else if(month.equals("aug"))
    		return "August";
    	else if(month.equals("sep"))
    		return "September";
    	else if(month.equals("oct"))
    		return "October";
    	else if(month.equals("nov"))
    		return "November";
    	else
    		return "December";
    }
    
    public static Date dateFormateWithSecMinHr(String s) {
    	StringBuilder sb = new StringBuilder(s);
    	String day, month, year, hr, min, sec;
        
    	int index = sb.indexOf("[");
        day = sb.substring(index+1, index+3);
        month = sb.substring(index + 4, index + 7);
        year = sb.substring(index + 8, index + 12);   
        
        index = sb.indexOf(":", index);
        hr = sb.substring(index+1, index + 3);
        min = sb.substring(index+4, index + 6);
        sec = sb.substring(index + 7, index + 9);
        
        long hoursToAdd = Long.parseLong(hr) * ONE_HOUR_IN_MS;
        long minuiteToAdd = Long.parseLong(min) * ONE_MIN_IN_MS;
        long secondToAdd = Long.parseLong(sec) * ONE_SEC_IN_MS;
        String dateString = modefyMonth(month) + " " + day + ", " + year;
        Date date = new Date(dateString);
        System.out.println(date.getTime());
        
//        System.out.println(day + " -  " + month + " - " + year);
//        System.out.println(hr + " -  " + min + " - " + sec);
        
    	return new Date(date.getTime() + hoursToAdd + minuiteToAdd + secondToAdd);
    }
    
    public static void main(String [] args) {
    	String s = "110.76.104.12 - - [30/sep/2015:07:47:11 -0400";
        StringBuilder sb = new StringBuilder(s);
        String ipAddr = sb.substring(0, sb.indexOf(" ")+1);   
        System.out.println(ipAddr);
        Date date = dateFormateWithSecMinHr(s);
        System.out.println(date);
    }
}
