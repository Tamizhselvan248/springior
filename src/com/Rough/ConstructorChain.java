package com.Rough;

import java.util.ArrayList;

class A{
	public String str="a ";
	A(){
		System.out.print("a_class ");
	}
}
class B extends A{
	
	void go() {
		str="b ";
		System.out.print(this.str+" "+super.str);
	}
	
	B(){
		System.out.print("b_class ");
	}
}


public class ConstructorChain {
	public static void main(String[] args) {
		B b=new B();
		b.go();
	}
}
