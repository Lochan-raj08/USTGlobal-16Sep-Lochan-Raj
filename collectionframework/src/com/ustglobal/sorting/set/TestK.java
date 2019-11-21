package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(12);
		pq.add(43);
		pq.add(16);
		pq.add(54);
		pq.add(87);
		pq.offer(1);//this is also used to add elements into queue
		
		System.out.println("Before Poll "+pq);
		System.out.println("****using iterator****");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		
		System.out.println("After Poll "+pq);
		
	}
}
