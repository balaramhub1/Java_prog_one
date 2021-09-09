package java_collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapOne {

	public static void main(String[] args) {

		HashMap<String,String> hmap1=new HashMap<String,String>();
		hmap1.put("food", "pizza");
		hmap1.put("tool", "screw driver");
		hmap1.put("vehicle", "car");
		hmap1.put("pet", "dog");
		hmap1.put("color", "pink");
		hmap1.put("element", "fire");
		hmap1.put("water", "fish");
		
		// To iterage over the keys
		// HashMap is not ordered., LinkedHashMap is ordered.
		for(String k:hmap1.keySet()) {
			System.out.println("Key is : "+k);
		}
		
		// To iterate over the values
		System.out.println("Values of the HashMap are as below ..");
		for(String v:hmap1.keySet()) {
			System.out.println("Values are : "+hmap1.get(v));
	
		}
		
		// Display the key and values
		System.out.println("Display the key and values");
		
		for(String v:hmap1.keySet()) {
			System.out.format("Values are | %s : %s\n",v,hmap1.get(v));
	
		}
	 	
		// Display the key and values using EntrySet.
		System.out.println("Display the key and values using EntrySet");
		for(Map.Entry<String, String> entry:hmap1.entrySet()) {
			System.out.println("Key and Values are ---> "+entry.getKey()+ " : "+entry.getValue());
		}
		
	}

}
