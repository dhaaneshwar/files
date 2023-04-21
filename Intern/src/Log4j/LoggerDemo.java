package Log4j;

import org.apache.logging.log4j.*;


/*
 * 1. from which class -->logger
 * 2. where to print -->appender
 * 3. how to print -->layout 
 */

public class LoggerDemo {
	
	private static Logger log=LogManager.getLogger(LoggerDemo.class.getName());   // logger object

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

		log.info("operation successful, From info");
		log.error("DB connection failed, From error");
		log.debug("Debugging the program, From debug");
		log.warn("From warn");
		log.fatal("From fatal");
		log.trace("from Trace");
	}

}
