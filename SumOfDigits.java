package jspiders;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number: ");
		int num = sc.nextInt();
		

		int rem = num % 10 ;
		int sum = 0 ;
		sum = sum+ rem ;
		num = num / 10 ;
		
		rem = num % 10;
		sum = sum + rem ;
		num = num / 10 ;
		
		rem = num % 10;
		sum = sum + rem ;
		System.out.println("Sum of digits: "+sum);
		

	}

}
