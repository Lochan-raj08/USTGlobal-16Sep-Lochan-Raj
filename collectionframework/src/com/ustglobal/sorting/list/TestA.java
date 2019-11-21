package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(12, "shareef", 23.8);
		Student s2 = new Student(13, "Faizan", 42.1);
		Student s3 = new Student(43, "lochan", 63.4);
		Student s4 = new Student(34, "amith", 83.2);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("************************");
		System.out.println("Before sorting...");
		System.out.println("************************");
		displayStudentDetails(al);
		Collections.sort(al);
		
		System.out.println("After sorting...");
		System.out.println("***********************");
		displayStudentDetails(al);
	}
	
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			
			System.out.println("****************************");
		}
	}
}
