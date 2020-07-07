package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	
	final void github()
	{
		System.out.println("develop");
		System.out.println("develop2");
		System.out.println("develop3");
	}
	final void github()
	{
		System.out.println("develop");
		System.out.println("develop2");
		System.out.println("develop3");
	}

	
	
	public static Logger Log=LogManager.getLogger(Log.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("Im Debugging");
		Log.info("info");
		Log.error("this is an error");
		Log.fatal("this is fatal");
		Log.trace("this is trace");
		/////////////////////
		Log.error("this is an error");
		Log.fatal("this is fatal");
		Log.trace("this is trace");
		gaurav
	}

}
