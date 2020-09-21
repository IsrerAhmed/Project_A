package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

	public static void main(String[] args) throws IOException {
		// 1.File location.
		
		String file= "data/example.txt";
		
		//2. Create an object of fileReader. 
		
		FileReader fr= new FileReader (file);
		
		
		int i=fr.read();
		
		while(i!=-1) {
			
			char c= (char)i;
			System.out.print(c);
			
			i= fr.read();
			
		}

	}

}
