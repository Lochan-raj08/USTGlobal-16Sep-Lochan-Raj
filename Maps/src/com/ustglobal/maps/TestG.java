package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		

		Employee s1 = new Employee(8, "Lochan", 35000);
		Employee s2 = new Employee(5, "Shareef", 40000);
		Employee s3 = new Employee(12, "Faizan", 50000);
		Employee s4 = new Employee(15, "Amith", 30000);
		Employee s5 = new Employee(25, "John", 25000);
		Employee s6 = new Employee(35, "Tom", 20000);
		Employee s7 = new Employee(35, "Jerry", 15000);
		Employee s8 = new Employee(55, "Ash", 33000);
		Employee s9 = new Employee(65, "Broack", 23000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("manager1", al);
		hm.put("manager2", al1);
		hm.put("manager3", al2);
		
		ArrayList<Employee> manager3 = hm.get("manager3");
		
		Iterator<Employee> it = manager3.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("salary is "+s.salary);
			System.out.println("======================");
		}
		
	}

}
