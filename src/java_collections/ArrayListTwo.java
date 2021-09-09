package java_collections;

import java.util.ArrayList;

public class ArrayListTwo {

	public static void main(String[] args) {
		
		// Example of ArrayList with heterogenous data type
		// its not a good practice.

		ArrayList<String> words=new ArrayList<String>();
		words.add("hello");
		words.add("three");
		words.add("!");
		words.add("how");
		words.add("are");
		words.add("you");
		words.add("12");
		words.add("3.45");
		words.add("y");
		
		
		// get the data back
		
		System.out.println(words.get(7));
	}

}
