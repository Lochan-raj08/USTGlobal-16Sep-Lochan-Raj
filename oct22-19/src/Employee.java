
public class Employee {
	String name;
	int eid;
	
	public Employee(String name, int eid) {
		name = name;
		eid = empid;
	}
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Hrithik",143);
		e1.printDetails();
		
		Employee e2 = new Employee("Tiger Shroff",420);
		e2.printDetails();
		
		Employee e3 = new Employee( "Salman",145);
		e3.printDetails();
		
	}

}
