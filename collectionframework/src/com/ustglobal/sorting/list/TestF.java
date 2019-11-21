package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<Marker>();
		
		al.add(new Marker(50, "blue"));
		al.add(new Marker(70, "red"));
		al.add(new Marker(80, "green"));
		al.add(new Marker(40, "black"));
		
		System.out.println("Before sorting---->");
		
		display(al);
		SortByPrice sp = new SortByPrice();
		SortByColor sc = new SortByColor();
//		Collections.sort(al, sp);
		Collections.sort(al, sc);
		
		System.out.println("After sorting----->");
		display(al);
	}
	
	static void display(ArrayList<Marker> a) {
		Iterator<Marker> i = a.iterator();
		while (i.hasNext()) {
			Marker m = i.next();
			
			System.out.println("Price is "+m.price);
			System.out.println("color is "+m.color);
			System.out.println("*******************");
			
		}
	}
}
