package com.tamizh;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
	public static void main(String[] args) {
		int arr[]= {1, 22, 22, 13, 4, 22, 5, 4, 0, 22};
		boolean bol[]=new boolean[arr.length];
		System.out.println(Arrays.toString(bol));
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					bol[j]=true;
				}
			}
		}
		
		System.out.println(Arrays.toString(bol));
		ArrayList li=new ArrayList();
		for(int i=0;i<arr.length;i++) {
			if(bol[i]==false) {
				li.add(arr[i]);
			
			//System.out.print(arr[i]+" ");
				}
		}
		System.out.println(li);
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		
		for(int i=0;i<li.size();i++) {
			for(int j=0;j<arr.length;j++) {
				if((int)li.get(i) == arr[j] && bol[j]) {
					System.out.print(li.get(i)+" ");
					break;
				}
			}
		}
	
		
	}

}
