package jspiders;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of student : ");
		
		int marks=sc.nextInt();
		
		int per=(marks*100)/600;
		
		System.out.println("Percentage : "+per);
		
		String result=(per<=100 && per>=75)?("Grade : A"):((per<75 && per>=60)?("Grade : B"):((per<60 && per>=35)?("Grade : c"):("Fail")));
		System.out.println(result);

	}

}
