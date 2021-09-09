package car_dealership;

public class Employee {
	
	public Employee() {
		
	}
	
	public void handleCustomer(Customer cust,boolean finance,Vehicle veh) {
		if(finance==true) {
			double loanAmount=veh.getPrice()-cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		}else if(veh.getPrice()<=cust.getCashOnHand()) {
			// customer pays in Cash
			processTransaction(cust, veh);
		}else {
			System.out.println("Customer will need more money to purchase vehicle "+veh);
		}
	}
	
	public void runCreditHistory(Customer cust,double loanAmount) {
		System.out.println("Ran credit history for Customer..");
		System.out.println("Customer has been approved to purchase the vehicle..");
	}
	
	public void processTransaction(Customer cust, Vehicle veh) {
		System.out.println("Customer has purchased the vehicle "+veh+" for the price "+veh.getPrice());
	}

}
