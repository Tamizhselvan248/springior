package com.tamizh;

class Tree{
	
}
class MangoTree extends Tree{
	
} 
class AppleTree extends Tree{
	
} 

public class InstanceOf {
	public static void main(String[] args) {
		Tree t=new MangoTree();
		if(t instanceof MangoTree) { 
			System.out.println("True"); 
		}else System.out.println("False");
	}
}
