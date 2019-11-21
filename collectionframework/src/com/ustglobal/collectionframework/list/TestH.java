package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.Vector;

public class TestH {
	public static void main(String[] args) {
		
		Vector li = new Vector();
		li.add(12);
		li.add(34.6);
		li.add("many");
		li.add(true);
		li.add(null);
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.equals(i));
		}
		
		for (Object object : li) {
			System.out.println(object);
			
		}
		System.out.println("======using iterator=====");
		Iterator it = li.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
		}
	}

}
