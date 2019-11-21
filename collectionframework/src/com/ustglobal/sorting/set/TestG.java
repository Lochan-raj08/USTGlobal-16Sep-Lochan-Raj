package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(12, "shareef", 350000);
		Employee e2 = new Employee(13, "faizan", 450000);
		Employee e3 = new Employee(15, "lochan", 500000);
		Employee e4 = new Employee(16, "amith", 400000);
		Employee e5 = new Employee(16, "amith", 400000);
		
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("****using iterator****");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("ID is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("**********************");
		}
		
	}
}
