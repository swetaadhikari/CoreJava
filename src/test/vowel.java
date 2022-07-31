package test;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		
		
		Scanner s= new Scanner(System.in);
	String str=s.next();
	int c=0;
	
	for(int i=0;i<str.length();i++) {
		
		char ch=str.charAt(i);
		if(ch=='a') {
			c++;
		}
		
		
	}
	
	System.out.println(c);
	}

}
