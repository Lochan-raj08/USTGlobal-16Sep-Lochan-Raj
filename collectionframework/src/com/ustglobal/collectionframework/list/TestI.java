package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
	public static void main(String[] args) {
		
		Stack v1 = new Stack();
		
		v1.add(12);
		v1.add(35.56);
		v1.add("shareef");
		v1.add(true);
		v1.add(null);
		
		System.out.println("**using for loop**");
		
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));
		}
		
		System.out.println("**using for each**");
		
		for (Object object : v1) {
			System.out.println(object);
		}
		
		System.out.println("**using iterator**");
		
		Iterator it = v1.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("**using list iterator**");
		
		ListIterator lt = v1.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("**list iterator backward**");
		
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
	}

}
