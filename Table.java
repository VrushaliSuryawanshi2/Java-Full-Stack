package jspiders;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter end condition: ");
		int end = sc.nextInt();
		
		for(int i=1;i<=end;i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
		}

	}

}
