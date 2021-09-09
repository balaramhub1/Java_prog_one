package java_collections;

import java.util.LinkedList;

public class LinkedListOne {

	public static void main(String[] args) {

		LinkedList<Integer> num=new LinkedList<Integer>();
		num.add(5);
		num.add(8);
		num.add(34);
		num.add(23);
		num.add(88);
		
		// get the data from num - linkedlist.
		for (int x:num) {
			System.out.println("num is : "+x);
		}
		
	}

}
