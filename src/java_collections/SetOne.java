package java_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetOne {

	public static void main(String[] args) {

		// HashSet doesnt maintain the order
		
		HashSet<Integer> values =new HashSet<Integer>();
		values.add(10);
		values.add(23);
		values.add(35);
		values.add(21);
		values.add(16);
		values.add(65);
		values.add(21);

		for(Integer i:values) {
			System.out.println("Values in HashSet are : "+i);
		}
		
		// LinkedHashSet maintains the order.
		
		System.out.println("++++++++++++++++++++++++++++");
		
		LinkedHashSet<Integer> values2 =new LinkedHashSet<Integer>();
		
		values2.add(10);
		values2.add(23);
		values2.add(35);
		values2.add(21);
		values2.add(16);
		values2.add(65);
		values2.add(21);
		
		for(Integer j:values2) {
			System.out.println("Values in LinkedHashSet are : "+j);
		}
		
		System.out.println("++++++++++++++++++++++++++++");
		
		LinkedHashSet<String> values3=new LinkedHashSet<String>();
		values3.add("Random");
		values3.add("Animal");
		values3.add("People");
		values3.add("Zoo");
		values3.add("Rocket");
		values3.add("Zoo");
		
		for(String s:values3) {
			System.out.println("Values in Linked HashSet are : "+s);
		}
	}

}
