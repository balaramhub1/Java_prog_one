package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1=new Customer("Tom","address100",12000);
		
		Vehicle veh=new Vehicle();
		veh.setMake("Honda");
		veh.setMake("Accord");
		veh.setPrice(10000);
		
		Employee emp=new Employee();
		
		cust1.purchaseCar(veh, emp, false);
	}

}
