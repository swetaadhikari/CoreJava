package test;

import java.util.Scanner;

public class evennumbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
				

	}

}
