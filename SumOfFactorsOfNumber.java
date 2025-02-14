package jspiders;

import java.util.Scanner;

public class SumOfFactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				System.out.print(i+"  ");
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("Sum of factors of a number is: "+sum);

	}

}
