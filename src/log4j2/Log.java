package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
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
