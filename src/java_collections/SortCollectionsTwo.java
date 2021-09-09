package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortCollectionsTwo {

	public static void main(String[] args) {

		// Sorting collection of user defined data like objects.
		// Sort the objects of Employee
		
		HashSet<Employee> empSet=new HashSet<Employee>();
		empSet.add(new Employee("Tom", 1023, "Finance"));
		empSet.add(new Employee("Dick", 2102, "HR"));
		empSet.add(new Employee("Harry", 2110, "Store"));
		empSet.add(new Employee("Jemmy", 3211, "Sales"));
		empSet.add(new Employee("Katie", 4422, "Marketing"));
		
		// Converting the HashSet to List;
		
		ArrayList<Employee> list1=new ArrayList<Employee>(empSet);
		
		// Sorting based on Salary, comparable interface is implemented in Employee class.
		// comparison is based on Salary, by implementing compareTo() method.
		Collections.sort(list1);
		System.out.println("Sorted Employee object by Salary : "+list1);
		
	}

}
