package java_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapOne {

	public static void main(String[] args) {

		// HaspMap is not Ordered, for ordering we can use LinkedHashMap or TreeMap.

		HashMap<String, String> hmap1 = new HashMap<String, String>();
		hmap1.put("food", "pizza");
		hmap1.put("tool", "screw driver");
		hmap1.put("vehicle", "car");
		hmap1.put("pet", "dog");
		hmap1.put("color", "pink");
		hmap1.put("element", "fire");
		hmap1.put("water", "fish");

		// Display the key and values
		System.out.println("Display the key and values of : HashMap");

		for (String v : hmap1.keySet()) {
			System.out.format("Values are | %s : %s\n", v, hmap1.get(v));

		}

		// Display the key and values using EntrySet.
		System.out.println("Display the key and values using EntrySet");
		for (Map.Entry<String, String> entry : hmap1.entrySet()) {
			System.out.println("Key and Values are ---> " + entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("\nDisplay the key and values of : TreeMap\n");

		TreeMap<String, String> tmap1 = new TreeMap<String, String>();
		tmap1.put("food", "pizza");
		tmap1.put("tool", "screw driver");
		tmap1.put("vehicle", "car");
		tmap1.put("pet", "dog");
		tmap1.put("color", "pink");
		tmap1.put("element", "fire");
		tmap1.put("water", "fish");

		for (String v : tmap1.keySet()) {
			System.out.format("Values are | %s : %s\n", v, tmap1.get(v));

		}

		// Display the key and values using EntrySet.
		System.out.println("Display the key and values using EntrySet");
		for (Map.Entry<String, String> entry : tmap1.entrySet()) {
			System.out.println("Key and Values are ---> " + entry.getKey() + " : " + entry.getValue());
		}

	}

}
