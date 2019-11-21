package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.add(23);
		s.push(43);
		s.push(87);
		System.out.println(s);
		System.out.println("using get() ----");
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		int j = s.size();
		System.out.println("using pop() ----");
		for (int i = 0; i < j; i++) {
			System.out.println(s.pop());
		}
	}
}
