package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionTest {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("temp.txt");
	}
}
