package com.demo;

public class Example1 {

	public static void main(String[] args) {
	
		String str = "Andhra Pradesh";
		char b = 'a';
		int count =0;
		for(int i=0; i<str.length();i++) {
			
		b = str.charAt(i);
			if(b == 'a')
			count++;
			
		}
		System.out.println(count);
		System.out.println("count:");
	}

}
