package com.tamizh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo1 {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Demo1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "(Id :"+id+" Name :"+name+")";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList arr=new ArrayList();
		
		arr.add('s');
		arr.add('a');
		arr.add('j');
		arr.add('h');
		
		Collections.sort(arr);
		
		System.out.println(arr);
		
		Demo1 d=new Demo1(101, "Tamizh");
		Demo1 d1=new Demo1(102, "Sam");
		Demo1 d2=new Demo1(103, "Tammu");
		Demo1 d3=new Demo1(104, "Disha");
	
		
		ArrayList <Demo1> a= new ArrayList<>();
		
		a.add(d);
		a.add(d1);
		a.add(d2);
		a.add(d3);
		
		//Collections.sort(a);
		
		System.out.println(a);
	}

}
