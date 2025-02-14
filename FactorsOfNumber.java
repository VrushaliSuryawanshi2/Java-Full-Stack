package jspiders;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int cnt = 0;
		
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				cnt++;
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		System.out.println("COUNT: "+ cnt);

	}

}
