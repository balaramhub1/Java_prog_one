package processing_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTwo {

	public static void main(String[] args) {

		// Read file using FileReader and BufferedReader
		
		System.out.println(System.getProperty("user.dir"));
		String filePath=System.getProperty("user.dir");
		
		try {
			File file=new File(filePath+"/src/processing_files/testfile.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
			br.close();
			fr.close();
	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
