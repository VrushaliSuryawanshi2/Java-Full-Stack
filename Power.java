package jspiders;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter power of a number : ");
		int pow=sc.nextInt();
		int op=1;
		
		for(int i=1;i<=pow;i++) {
			op *= num;
		}
		System.out.println("Power : "+ op);

	}

}
