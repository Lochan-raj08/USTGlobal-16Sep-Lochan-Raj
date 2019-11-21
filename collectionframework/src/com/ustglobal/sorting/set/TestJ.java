package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		SortByName1 sn = new SortByName1();
		TreeSet<Customer> ts = new TreeSet<Customer>(sn);
		
		Customer e1 = new Customer("shareef", 12, 350000);
		Customer e2 = new Customer("faizan", 34, 450000);
		Customer e3 = new Customer("lochan", 43, 500000);
		Customer e4 = new Customer("amith", 21, 400000);
		Customer e5 = new Customer("amith", 87, 400000);
		
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		System.out.println("****using iterator****");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer e = it.next();
			System.out.println("ID is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("**********************");
		}
		
	}
}

