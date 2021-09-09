package processing_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
/*		// code block to read data from keyboard
		Scanner input =new Scanner(System.in);
		System.out.println("Enter some Text : ");
		String enteredText=input.nextLine();
		System.out.println("Entered Text is : "+enteredText);*/
		
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
		
		MyFileUtils myUtils=new MyFileUtils();
		try {
			System.out.println(myUtils.subtract10FromLargeNumber(15));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
