package jspiders;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number: ");
		int num = sc.nextInt();
		
		int rem = num % 10 ;
		int rev = 0 ;
		rev = rev * 10 + rem ;
		num = num / 10 ;
		
		rem = num % 10;
		rev = rev * 10 + rem ;
		num = num / 10 ;
		
		rem = num % 10;
		rev = rev * 10 + rem ;
		System.out.println("Reversed number is: "+rev);
		

	}

}
