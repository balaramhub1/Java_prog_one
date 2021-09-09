package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortCollectionOne {

	public static void main(String[] args) {


		// Sorting 
		
		HashSet<Integer> set1=new HashSet<Integer>();
		
		set1.add(12);
		set1.add(43);
		set1.add(52);
		set1.add(15);
		set1.add(10);
		set1.add(67);
		set1.add(43);
		
		System.out.println("HashSet before Sorting : "+set1);
		
		// sorting only happens for List but not for Set/ HashSet.
		
		// Converting HashSet to ArrayList.
		System.out.println("Converting HashSet to ArrayList.");
		
		List<Integer> list1=new ArrayList<Integer>(set1);
		System.out.println("Before Sorting : " + list1);
		// Sorting the list1
		System.out.println("Sorting the list1");
		Collections.sort(list1);
		System.out.println("After Sorting : " + list1);
		
		// Sorting list of Strings
		System.out.println("Sorting list of Strings");
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("hello");
		list2.add("there");
		list2.add("welcome");
		list2.add("to");
		list2.add("earth");
		list2.add("ok");
		
		System.out.println("Original list of Strings :"+list2);
		Collections.sort(list2);
		System.out.println("Sorted list of Strings :"+list2);
		
	}

}
