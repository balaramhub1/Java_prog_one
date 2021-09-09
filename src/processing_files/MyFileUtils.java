package processing_files;

public class MyFileUtils {

	public int subtract10FromLargeNumber(int number) throws Exception{
		if(number <10) {
			throw new Exception("number is less than 10");
		}
		return number -10;
	}
}
