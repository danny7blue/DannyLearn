/**
 * 
 */
package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Danny
 *
 */
public class LogbackTest {
	private static Logger log = LoggerFactory.getLogger(LogbackTest.class);
	
	public String getLogName() {
		log.info("get log name");
		return log.getName();
	}
	
	public void printLogMsg() {
		log.debug("print log message");
		System.out.println("hello");
	}

}
