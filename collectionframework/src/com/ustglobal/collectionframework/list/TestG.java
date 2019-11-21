package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
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
		
		System.out.println("======Using list iteartor=======");
		ListIterator lt = li.listIterator();
		while (lt.hasNext()) {
		
			Object o = lt.next();
			System.out.println(0);
			
		}
		
		
		
		
	}
	

}
