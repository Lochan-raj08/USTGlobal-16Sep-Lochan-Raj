package com.ustglobal.exception.first;

public class TestA {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int[] a = {10,20,30};
		
		System.out.println(a[1]);
		try {
			System.out.println(a[3]);//only exception is there then catch block executes if not it will not go into catch block
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			
			System.out.println("index not foud");
		}
		
		System.out.println("main method ended");
	}

}
