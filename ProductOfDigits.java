package jspiders;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int p=1;
		
		while(num>0) {
			int rem = num % 10 ; 
			p *= rem;
			num /= 10 ;
		}
		System.out.println("Product of a digit is : "+p);

	}

}
