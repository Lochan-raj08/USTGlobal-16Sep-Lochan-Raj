package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		
		Student s1 = new Student(8, "Lochan", 71.23);
		Student s2 = new Student(5, "Shareef", 67.66);
		Student s3 = new Student(12, "Faizan", 87.66);
		Student s4 = new Student(15, "Amith", 84.36);
		Student s5 = new Student(25, "John", 45.54);
		Student s6 = new Student(35, "Tom", 67.3);
		Student s7 = new Student(35, "Jerry", 50.12);
		Student s8 = new Student(55, "Ash", 65.87);
		Student s9 = new Student(65, "Broack", 87.66);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Student> first = hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("======================");
		}
		
	}

}
