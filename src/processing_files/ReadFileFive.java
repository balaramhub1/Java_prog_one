package processing_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileFive {

	public static void main(String[] args) {

		// Read file using FileReader and BufferedReader and closing resources
		// without using finally block.
		// Auto Closable 
		
		System.out.println(System.getProperty("user.dir"));
		String filePath=System.getProperty("user.dir");
		File file=new File(filePath+"/src/processing_files/testfile.txt");;
				
		try(FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);) {

			String line=br.readLine();
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
			
	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
