package processing_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileFour {

	public static void main(String[] args) {

		// Read file using FileReader and BufferedReader and finally.
			
			System.out.println(System.getProperty("user.dir"));
			String filePath=System.getProperty("user.dir");
			File file=null;
			FileReader fr=null;
			BufferedReader br=null;
			try {
				file=new File(filePath+"/src/processing_files/testfile.txt");
				fr=new FileReader(file);
				br=new BufferedReader(fr);
				String line=br.readLine();
				while(line!=null) {
					System.out.println(line);
					line=br.readLine();
				}
				
		
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					br.close();
					fr.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				
			}
			
		}

}
