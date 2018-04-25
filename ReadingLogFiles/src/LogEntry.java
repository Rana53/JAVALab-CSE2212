import java.sql.*;

public class LogEntry{
	
	private String ipAddress;
	private Date accessTime;
	private String request;
	private int statusCode;
	private int byteReturned;
	
	LogEntry(String ip, Date date, String string, int status, int byteValue){
		ipAddress = ip;
		accessTime = date;
		request = string;
		statusCode = status;
		byteReturned = byteValue;
	}
	
	public String getIpAdderss() {
		return this.ipAddress;
	}
	
	public Date getDate() {
		return this.accessTime;
	}
	
	public String getRequest() {
		return this.request;
	}
	
	public int getStatusCode() {
		return this.statusCode;
	}
	
	public int getByteReturned() {
		return this.byteReturned;
	}
	
	
}