package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101, "Shareef", 45);
		Student s2 = new Student(102, "Faizan", 60);
		Student s3 = new Student(103, "Sharukh", 70);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (int i = 0; i < al.size(); i++) {
			
			Student s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
		}
		
		System.out.println("=======for each======");
		for (Student s : al) {
			System.out.println(s);
		}
		
	}

}
