/**
 * 
 */
package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

/**
 * @author Danny
 *
 */
public class LogbackDemo {
	private static Logger log = LoggerFactory.getLogger(LogbackDemo.class);
	public static void main(String[] args) {
		log.trace("=======trace");
		log.debug("======debug");
		log.info("======info");  
	    log.warn("======warn");  
	    log.error("======error");
	    log.debug("======billing");
	    
	    String name = "Danny";
	    String message = "3Q";
	    String[] fruits = {"Apple", "Banana"};
	    
	    log.info("Hello, {}", name);
	    
	    log.info("Hello, {}! {}!", name, message);
	    
	    log.info("Fruit: {} {}", fruits);
	    
	    LogbackTest logTest = new LogbackTest();
	    logTest.getLogName();
	    logTest.printLogMsg();
	    
	    log.info("hello from laotop");
	    
//	    print internal state 
//	    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory(); StatusPrinter.print(lc);
	}
}
