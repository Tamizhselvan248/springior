package com.tamizh;

import java.util.HashSet;
import java.util.Iterator;

public class CustomerOne {
	int id;
	String name;
	long mobNo;
	String eMail;
	public CustomerOne(int id, String name, long mobNo, String eMail) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
		this.eMail = eMail;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object o) {
		CustomerOne c=(CustomerOne)o;
		return this.id==c.id && this.name.equals(c.name);
	}
	
	@Override
	public String toString() {
		return "Id :"+id+" ,Name :"+name+" ,eMail :"+eMail;
	}
	
	public static void main(String[] args) {
		HashSet<CustomerOne> h=new HashSet<CustomerOne>();
		h.add(new CustomerOne(101, "Tamizh", 987654321, "tamizh@gmail.com"));
		h.add(new CustomerOne(101, "Samson", 987654321, "tamizh@gmail.com"));
		h.add(new CustomerOne(102, "Sam", 9876543, "sam@gmail.com"));
		h.add(new CustomerOne(103, "Aarya", 7754321, "aarya@gmail.com"));
		h.add(new CustomerOne(103, "Aarya", 7754321, "aarya@gmail.com"));
		h.add(new CustomerOne(104, "Shreya",43213456, "shreya@gmail.com"));
		h.add(new CustomerOne(105, "Shreya",43213456, "shreya@gmail.com"));
		
		System.out.println(h);
		
		Iterator<CustomerOne> i = h.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	}

}
