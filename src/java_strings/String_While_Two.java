package java_strings;

public class String_While_Two {

	public static void main(String[] args) {
		
		String str="We have a large inventory of things in our warehouse falling in"
				+"the category:apperal and the slightly "
				+"more in demand category:makeup along with the category:furniture and ...";
		
		printCategories(str);
	}

	/**
	 * extract all categories from the string argument
	 * @param str
	 */
	private static void printCategories(String str) {
		int i=0;
		while(true) {
			int found=str.indexOf("category:", i);
			if(found==-1) break;
			int start=found+9;
			int end=str.indexOf(" ", start);
			System.out.println(str.subSequence(start, end));
			i=end+1;
		}
	}
	
}
