package java_collections;

class Employee implements Comparable<Employee>{
	
	private String name;
	private int salary;
	private String dept;
	
	// Constructor
	public Employee(String name,int salary,String dept) {
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}

	@Override
	public int compareTo(Employee o) {
		// Two employee will be compared in the below method
		// one object is the current class object, other is the passed object.
		if(this.salary<o.salary) {
			return -1;
		}else if(this.salary>o.salary) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	

}
