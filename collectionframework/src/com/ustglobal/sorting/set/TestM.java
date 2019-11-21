package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestM {
	public static void main(String[] args) {
		
		Comparator<Employee1> comp = (e1,e2) -> {
			return e1.name.compareTo(e2.name);
		};

		TreeSet<Employee1> ts = new TreeSet<Employee1>(comp);

		Employee1 e1 = new Employee1(7, "Lochan", 6);
		Employee1 e2 = new Employee1(17, "Shareef", 5.11);
		Employee1 e3 = new Employee1(25, "Amith", 5.5);
		Employee1 e4 = new Employee1(27, "Faizan", 5.10);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("*************Using iterator**********");
		Iterator<Employee1> it = ts.iterator();
		while(it.hasNext()) {
			Employee1 e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("========================");
		}
	}

}
