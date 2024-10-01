package com.tamizh;


public class StringManipulation {
	
	
	public static void findPattern(String str) {
		
		
		for(int i=0;i<str.length();i++){
			int num=0;
			if(Character.isAlphabetic(str.charAt(i))) {

				if(Character.isDigit(str.charAt(i+1))){

					if(Character.isDigit(str.charAt(i+2))) {
					num = (str.charAt(i+1)*10) + (str.charAt(i+2));
					}
					num=str.charAt(i+1)-'0';
					//System.out.println(num);
				}
				
				for(int j=0;j<num;j++) {
					System.out.print(str.charAt(i));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String str="A2B5C15";
		findPattern(str);
	}

}
