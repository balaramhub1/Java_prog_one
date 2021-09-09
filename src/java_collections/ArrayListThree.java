package java_collections;

import java.util.ArrayList;

public class ArrayListThree {

	public static void main(String[] args) {

		ArrayList<String> animals=new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
		// Conventional for loop for iterating over the ArrayList
		
		System.out.println("Conventional for loop for iterating over the ArrayList");
		for(int i=0;i<animals.size();i++) {
			System.out.println("Animal is : "+animals.get(i));
		}
		
		System.out.println("Iterating over the ArrayList using for each loop");
		// Iterating over the ArrayList using for each loop
		
		for(String s:animals) {
			System.out.println("Animal is : "+s);
		}
		
	}

}
