package processing_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileOne {

	// Read file using Scanner
	
	
	public static void main(String[] args) {

		System.out.println(System.getProperty("user.dir"));
		String filePath=System.getProperty("user.dir");
		
		try {
		File file=new File(filePath+"/src/processing_files/testfile.txt");
		Scanner input;
			input = new Scanner(file);
			while(input.hasNextLine()) {
				String line=input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
