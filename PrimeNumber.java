package jspiders;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int cnt = 0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		System.out.println(cnt==0?num+" is prime":num+" is not prime");

	}

}
