package com.tamizh;

import java.util.Scanner;

public class MAin {
	public static String toLower(String str) {
		String s = "";
		char ch;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)<='z' && str.charAt(i)>='a') {
				ch=str.charAt(i);
				s+=ch;
			}
			else if(str.charAt(i)>='A') {
				ch= (char) (str.charAt(i)+' ');
				s+=ch;
				//System.out.println(s);
			}
		} 
		return s; 
	}
	
	public static boolean findAmbigus(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		String str1=toLower(s1);
		String str2=toLower(s2);
		for(int i=0;i<s1.length();i++) {
			if(str1.charAt(i)==str2.charAt(i)) {
				continue;
			}else return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first String :");
		String s1=sc.next() ;
		System.out.println("Enter second String :");
		String s2=sc.next() ;
		
		if(findAmbigus(s1, s2)) {
			System.out.println("Ambigus");
		}else System.out.println("Not Ambigus");
	}
}
