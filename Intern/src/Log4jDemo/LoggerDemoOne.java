package Log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerDemoOne {
	private static Logger log=LogManager.getLogger(LoggerDemoOne.class.getName());   // logger object

	public static void main(String[] args) {		

		log.info("operation successful, From info");
		log.error("DB connection failed, From error");
		log.error("DB connection failed, From error");
		log.debug("Debugging the program, From debug");
		log.warn("From warn");
		log.fatal("From fatal");
		log.trace("from Trace");
		log.debug("Debugging the program, From debug");
		log.warn("From warn");
		log.fatal("From fatal");
		log.trace("from Trace");
	}
}
