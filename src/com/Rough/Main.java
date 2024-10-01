package com.Rough;

class Test1{
	 Test1(int x)
	    {
	        System.out.println("Constructor called " + x);
	    }
	 public static void display() {
		 System.out.println("Display");
	 }
}

public class Main {
	
	Test1 t1 = new Test1(10);
	
	//System.out.println("hii");
	Main(int i){
		t1=new Test1(i);
	}
	
	public static void main(String[] args) {

		Main m=new Main(5);
		
	}

}
