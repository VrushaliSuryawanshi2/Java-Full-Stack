package jspiders;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a=sc.nextInt();
		
		System.out.println("Enter num2: ");
		int b=sc.nextInt();
		
		System.out.println("Before Swapping: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		

	}

}
