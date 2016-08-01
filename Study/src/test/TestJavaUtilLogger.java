/**
 * 
 */
package test;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * @author Danny
 *
 */
public class TestJavaUtilLogger { 
    public static void main(String[] args) throws IOException { 
            Logger log = Logger.getLogger("lavasoft"); 
            log.setLevel(Level.INFO); 
            Logger log1 = Logger.getLogger("lavasoft"); 
            System.out.println(log == log1);     //true 
            Logger log2 = Logger.getLogger("lavasoft.blog"); 
//            log2.setLevel(Level.WARNING); 

            ConsoleHandler consoleHandler = new ConsoleHandler(); 
            consoleHandler.setLevel(Level.ALL); 
            log.addHandler(consoleHandler); 
            FileHandler fileHandler = new FileHandler("C:/MyWorkspace/testlog%g.log"); 
            fileHandler.setLevel(Level.INFO); 
            fileHandler.setFormatter(new MyLogHander()); 
            log.addHandler(fileHandler); 

            log.info("aaa"); 
            log2.info("bbb"); 
            log2.fine("fine"); 
    } 
} 

class MyLogHander extends Formatter { 
    @Override 
    public String format(LogRecord record) { 
            return record.getLevel() + ":" + record.getMessage()+"\n"; 
    } 
}
