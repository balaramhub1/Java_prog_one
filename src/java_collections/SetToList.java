package java_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetToList {

	public static void main(String[] args) {

		
		// To Convert a HashSet to List
		
		HashSet<Integer> set1=new HashSet<Integer>();
		
		set1.add(12);
		set1.add(43);
		set1.add(52);
		set1.add(15);
		set1.add(10);
		set1.add(67);
		set1.add(43);
		
		System.out.println("HashSet before conversion to list : "+set1);
		
		
		List<Integer> list1=new ArrayList<Integer>(set1);
		
		System.out.println("HashSet after conversion to list : "+list1);
		
	}

}
