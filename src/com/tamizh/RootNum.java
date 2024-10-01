package com.tamizh;

public class RootNum {
	public static int power(int a, int b) {
		int res=0;
		for(int i=1;i<=b;i++) {
			res=a*i;
		}
		
		return res;
	}
	
	public static boolean checkNum(int a, int b) {
		for(int i=1;i<a/2;i++) {
			if(power(b, i)==a) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int a=32, b=2;
		System.out.println(checkNum(a, b));
	}

}
