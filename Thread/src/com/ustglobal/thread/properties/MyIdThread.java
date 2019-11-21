package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("myid thread "+mi.getId());
		
//		mi.setId(); there is no set id because threads have unique id
		
		System.out.println("priority "+Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(16); IllegalArgumentException
		
		
		System.out.println("Main ended");
	}

}
