package com.ustglobal.Arrays;

public class TestA {
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] =10;
		nums[1] =20;
		nums[2] =30;
		nums[3] =40;
		nums[4] =50;
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
			
			System.out.println("=============");
			for(int n:nums) {
				System.out.println(n);
			}
			
			System.out.println("============");
			char[] ch = {'a','b','c','d'};
			for(int i1 = 0;i1<ch.length;i1++) {
				System.out.println(ch[i1]);
				
			}
			System.out.println("============");
			for(int c :ch) {
				System.out.println(c);
			}
			System.out.println("=================");
			boolean[] b = {true,false,true,false,true,true};
			for(int i1=0;i1<b.length;i1++) {
				System.out.println(b[i1]);
			}
			
			System.out.println("============");
			byte[] c = {1,2,3,4,5,6};
			for(int i1=0;i1<c.length;i1++) {
				System.out.println(c[i1]);
			}
			
			System.out.println("==============");
			double[] d = {1.2,1.4,1.6,1.8};
			for(int i1=0;i1<d.length;i1++) {
				System.out.println(d[i1]);
			}
			
			String[] names = {"Sharref","Lochan","Faizan"};
			for(int i1=0;i1<names.length;i1++) {
				System.out.println(names[i1]);
			}
			
			System.out.println("============");
			for(String name : names) {
				System.out.println(name);
			}
			
			
			
			
		}
	}

}
