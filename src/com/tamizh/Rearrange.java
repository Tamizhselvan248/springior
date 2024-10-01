package com.tamizh;

import java.util.Arrays;

public class Rearrange {
	public static void main(String[] args) {
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int brr[] = new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
			brr[count++]=arr[i];
			System.out.print(arr[i]+" ");}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				brr[count++]=arr[i];
				System.out.print(arr[i]+" ");}
		}
		System.out.println();
		System.out.println(Arrays.toString(brr));
	}
}
