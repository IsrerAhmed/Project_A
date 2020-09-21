package fileHandling_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

	public static void main(String[] args) throws IOException {
		// 1.file location.
		
		String file ="data1/example1.txt";
		
		//2. Create an object of FileReader.
		
		FileReader fr= new FileReader(file);
		
		int i=fr.read();
		
		while(i!=-1) {
			
			// convert int to char.
			char c=(char)i;
			
			System.out.print(c);
			
			
			i=fr.read();
			
		}

	}

}
