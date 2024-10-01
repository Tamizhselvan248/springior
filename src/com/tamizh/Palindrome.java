package com.tamizh;
import java.util.*;

public class Palindrome {
	public static void findPalindrome(int  num) {
		int k=num;
		int sum=0;
		while(k>0) {
			int temp=k%10;
			sum=(sum*10)+temp; 
			k=k/10;
		}
		System.out.println(sum);
		
		if(num==sum) System.out.println("Palindrome");
		else System.out.println("not Palindrome");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
	//	int  num=12321;
		findPalindrome(num);
		sc.close();
	}

}
