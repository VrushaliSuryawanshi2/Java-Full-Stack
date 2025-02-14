package jspiders;

import java.util.Scanner;

public class EvenOdd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		//System.out.println((num / 2) * 2 == num);
		
		 System.out.println((num/2) == (num/2.0));

	}

}
