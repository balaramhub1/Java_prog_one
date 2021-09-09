package java_collections;

import java.util.ArrayList;

public class ArrayListFour {

	public static void main(String[] args) {

		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(12);
		list1.add(43);
		list1.add(52);
		list1.add(15);
		list1.add(10);
		list1.add(67);
		list1.add(43);
		
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(10);
		list2.add(15);
		
		System.out.println("List1 : "+list1);
		System.out.println("List2 : "+list2);
		
		// Merge list1 and list2
		
		list1.addAll(list2);
		System.out.println("After Merging List1 with List2 :"+ list1);
		
		// Removing list2 elements from list1
		list1.removeAll(list2);
		System.out.println("After Removing List2 from List1 :"+ list1);
		
		System.out.println("Does list1 have 43 :"+ list1.contains(43));
		System.out.println("Does list1 have 49 :"+ list1.contains(49));
		
		// Adding again all list2 in list1
		list1.addAll(list2);
		System.out.println("After Merging List1 with List2 :"+ list1);
		
		// retainAll from list2
		list1.retainAll(list2);
		System.out.println("Retain only List2 elements in List1 :"+ list1);
		
		// remove all data from list
		
		list1.clear();
		System.out.println(list1);
		
		
	}

}
