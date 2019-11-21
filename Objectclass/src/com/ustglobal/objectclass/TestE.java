package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		
		Car c = new Car(100000, "Audi", "Red");
		int cd =  c.hashCode();
		System.out.println("overriden hashcode(): "+cd);
		System.out.println("overriden toString(): "+c);
		
		Car c1 = new Car(200000, "Benz", "Blue");
		int cd1 =  c1.hashCode();
		System.out.println("overriden hashcode(): "+cd1);
		System.out.println("overriden toString(): "+c1);
		
		Car c2 = new Car(300000, "porsche", "blacl");
		int cd2 =  c2.hashCode();
		System.out.println("overriden hashcode(): "+cd2);
		System.out.println("overriden toString(): "+c2);
		
		
	}

}
