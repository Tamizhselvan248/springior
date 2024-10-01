package com.test;

import java.util.Scanner;

public class Main {
	public static int findLength(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		//System.out.println(count);
		return count;
	}
	
	public static int powerOf(int n, int len) {
		int res=1;
		for(int i=1;i<=len;i++) {
			res=res*n;
		}
		//System.out.println(res);
		return res;
	}
	
	public static boolean isAmstrong(int n) {
		int temp=n;
		int res=0;
		int len=findLength(n);
		while(n!=0) {
			res=res+powerOf(n%10, len);
			//res=res*(n%10*len);  // 0+(3*3*3)= 9, 9+(5*5*5) = 24 , 24+(1*3)=27
			n=n/10;
		}
		//System.out.println(res);
		if(res==temp) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		if(isAmstrong(n)) {
			System.out.println(n+" is Amstrong number");
		}else {
			System.out.println(n+" is not a Amstrong number");
		}
	}
}
