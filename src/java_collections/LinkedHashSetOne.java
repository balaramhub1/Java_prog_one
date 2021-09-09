package java_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

import java_basic2.Animal;

public class LinkedHashSetOne {

	public static void main(String[] args) {

		HashSet<String> values=new HashSet<String>();
		values.add("Random");
		values.add("Animal");
		values.add("People");
		values.add("Zoo");
		values.add("Rocket");
		values.add("Zoo");
		
		for(String s:values) {
			System.out.println("Values in Linked HashSet are : "+s);
		}
		
		// User Defined elements in HashSet.
		System.out.println("+++++++++++++++++++++++++++");
		
		HashSet<Animals> values2=new HashSet<Animals>();
		Animals animal1=new Animals("Dog",12);
		Animals animal2=new Animals("Cat",15);
		Animals animal3=new Animals("Wolf",3);
		Animals animal4=new Animals("Tiger",5);
		Animals animal5=new Animals("Lion",22);
		Animals animal6=new Animals("Lion",22);
		
		values2.add(animal1);
		values2.add(animal2);
		values2.add(animal3);
		values2.add(animal4);
		values2.add(animal5);
		values2.add(animal6);
		
		// Need to override the hashCode() and equals() methods in Animals class for HashSet to be able
		// to identify duplicates.
		
		
		for(Animals s:values2) {
			System.out.println("Values in Linked HashSet are : "+s);
		}
		
		LinkedHashSet<Animals> animals=new LinkedHashSet<Animals>();
		
	}

}
