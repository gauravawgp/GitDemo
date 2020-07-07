package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log {
	
	final void github()
	{
		System.out.println("git commiut");
	}
	final void gith11ub()
	{
		System.out.println("git commiut");
	}
	public void github2()
	
	{
		System.out.println("git commiut");
	}
	public void github()
	{
		System.out.println("git commiut");
	}
	public void github99()
	{
		System.out.println("git 99");
		System.out.println("push back to git Demo");
	}
	
	
	public static Logger Log=LogManager.getLogger(Log.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("Im Debugging");
		Log.info("info");
		Log.error("this is an error");
		Log.fatal("this is fatal");
		Log.trace("this is trace");
	}

}
