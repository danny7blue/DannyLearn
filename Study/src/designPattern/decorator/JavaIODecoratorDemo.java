package designPattern.decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaIODecoratorDemo {

	public static void main(String[] args) throws IOException {
		//Java IO 采用装饰模式实例
//		File file = new File("logFile.2016-07-26.log");
//        if(!file.exists()||file.isDirectory())
//            throw new FileNotFoundException();
//        FileInputStream fis = new FileInputStream(file);
//        byte[] buf = new byte[1024];
//        StringBuffer sb = new StringBuffer();
//        while((fis.read(buf)) != -1) {
//            sb.append(new String(buf));    
//            buf = new byte[1024];//重新生成，避免和上次读取的数据重复
//        }
//        
//        System.out.println(sb.toString());
//        fis.close();
		
        File f = new File("logFile.2016-07-26.log");
        if(!f.exists()||f.isDirectory())
            throw new FileNotFoundException();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        int bytesRead = 0;
        byte[] bufToRead = new byte[10];
        while((bytesRead = bis.read(bufToRead)) != -1) {
        	String chunk = new String(bufToRead, 0, bytesRead);
        	System.out.println(chunk);
        }
        bis.close();
	}

}
