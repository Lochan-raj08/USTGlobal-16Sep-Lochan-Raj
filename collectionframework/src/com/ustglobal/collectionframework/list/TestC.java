package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(23);
		al.add(99.9);
		al.add(true);
		al.add("Good Evening");

		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println("obj1 "+o1);

		Object o2 = it.next();
		System.out.println("obj2 "+o2);

		Object o3 = it.next();
		System.out.println("obj3 "+o3);

		Object o4 = it.next();
		System.out.println("obj4 "+o4);
		boolean b = it.hasNext();
		System.out.println("Has Next "+b);

		//		Object o5 = it.next();
		//		System.out.println("obj5 "+o5);NoSuchElementException

		for(int i=0;i<al.size();i++) {
			Object o = al.get(i);
			System.out.println(o);
		}

		ArrayList al1 = new ArrayList();
		al1.add(12);
		al1.add(21.2);
		al1.add("chicken");
		al1.add(false);

		System.out.println("============using iterator==============");
		Iterator it1 = al1.iterator();
		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}

		System.out.println("=======for loop=====");

//		for(;it.hasNext();) {
//			Object ob = new Object();
//			System.out.println(ob);
//		}

	}

}
