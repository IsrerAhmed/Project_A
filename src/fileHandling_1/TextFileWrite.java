package fileHandling_1;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWrite {

	public static void main(String[] args) throws IOException {
		// File location where you want to save the file.
		
		String file ="data1/example1.txt";
		
		// Create an object of Filewriter1 object.
		
		FileWriter fw=new FileWriter(file);
		
		fw.write("This is my example file");
		
		// you have to close the file.
		
		fw.close();
	}

}
