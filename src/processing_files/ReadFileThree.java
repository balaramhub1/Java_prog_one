package processing_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileThree {

	public static void main(String[] args) {

		// Read file using Collections
		
		System.out.println(System.getProperty("user.dir"));
		String filePath=System.getProperty("user.dir");
		List<String> list=Collections.emptyList();
		
		try {
			list=Files.readAllLines(Paths.get(filePath, "/src/processing_files/testfile.txt"), Charset.forName("UTF-8"));
			Iterator<String> itr=list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
