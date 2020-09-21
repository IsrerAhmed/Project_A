package fileHandling;

import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWrite {

	public static void main(String[] args) throws IOException {
		
		
		
		// 1.File location where  you want to save the file.

		
		String file = "data/example.txt";
		
		
		//2. Create object of FileWrite
		
		FileWriter fw =  new FileWriter (file);
		
		fw.write("This is my example file");
		
		//3. you have to close the file.
		
		fw.close();
		
		
		
	}

}
