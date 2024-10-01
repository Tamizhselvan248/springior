package com.tamizh;

public class StringImmutable {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1);
		System.out.println(s2); 
		 
		
		System.out.println(s1==s2);
		
		s1=s1.concat("Hi");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
	}

}
