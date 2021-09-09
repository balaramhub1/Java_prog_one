package java_collections;

import java.util.ArrayList;

public class ArrayListVehicle {

	public static void main(String[] args) {

		Vehicle veh2=new Vehicle("Toyota","Camary",2322,true);
		
		ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>(10);
		vehicles.add(new Vehicle("Honda", "Accord", 1234, false));
		vehicles.add(veh2);
		vehicles.add(new Vehicle("Jeep", "Compass", 5622, true));
		vehicles.add(new Vehicle("Maruti", "Breeza", 3467, false));
		vehicles.add(new Vehicle("Hundai", "Verna", 3612, false));

		// To loop and display over the Vehicle arraylist we can implement toString() method in Vehicle class.
		
		System.out.println("List of Vehicle are as follows : ");
		for(Vehicle v:vehicles) {
			System.out.println(v);
		}
	}

}
