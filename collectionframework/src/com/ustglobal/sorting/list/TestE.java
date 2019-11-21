package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Pen> al = new ArrayList<Pen>();
		
		Pen p1 = new Pen(10, "cell" , "Red");
		Pen p2 = new Pen(15, "Raynolds" , "Black");
		Pen p3 = new Pen(20, "flair" , "Blue");
		Pen p4 = new Pen(200, "parker" , "Green");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		System.out.println("Before sorting----->");
		displayPenDetails(al);
		Collections.sort(al);
		System.out.println("After sorting----->");
		displayPenDetails(al);
	}
	
	static void displayPenDetails(ArrayList<Pen> al) {
		Iterator<Pen> i = al.iterator();
		while (i.hasNext()) {
			Pen p = i.next();
			System.out.println("price is "+p.price);
			System.out.println("brand is "+p.brand);
			System.out.println("color is "+p.color);
			System.out.println("******************");
		}
	}
}
