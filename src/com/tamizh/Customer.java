package com.tamizh;

import java.util.Collections;
import java.util.Vector;

public class Customer implements Comparable{
	int id;
	String name;
	String eMail;
	
	Customer(int id, String name, String eMail){
		this.id=id;
		this.name=name;
		this.eMail=eMail;
	}
	
	public String toString() {
		return "Id :"+id+" Name :"+name+" eMail :"+eMail;
	}
	
	@Override
	public int compareTo(Object o) {
		Customer c=(Customer)o;
		return this.eMail.compareTo(c.eMail);
	}
	
	public static void main(String[] args) {
		
		Customer c=new Customer(101, "Thamizh", "thamizh@gmail.com");
		Customer c1=new Customer(102, "Sam", "sam@gmail.com");
		Customer c2=new Customer(103, "Disha", "disha@gmail.com");
		Customer c3=new Customer(104, "Pallavi", "pallavi@gmail.com");
		
		Vector<Customer> v=new Vector<Customer>();
		v.add(c);
		v.add(c1);
		v.add(c2);
		v.add(c3);
		
		for (Customer cus : v) {
			System.out.println(cus);
		}
		
		Collections.sort(v);
		
		System.out.println("Sorting done --------------------------");
		
		for (Customer cus : v) {
			System.out.println(cus);
		}
	}


}
