package jspiders;

import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int sum =0;
		int dup = num ;
		while(num>0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Number is: "+dup);
	}

}
