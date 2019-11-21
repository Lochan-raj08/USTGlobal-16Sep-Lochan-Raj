package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s = new Student(77, "Lochan", 71);
		int sd = s.hashCode();
		System.out.println("overriden hashcode(): "+sd);
		System.out.println("overriden toString(): "+s);
		
	}

}
