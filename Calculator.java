package jspiders;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		
		System.out.println("Enter operator: ");
		char op=sc.next().charAt(0);
		
		float result = 0;
		
		result=(op == '+')?(num1 + num2):
			   ((op == '-')?(num1 - num2):
			   ((op == '*')?(num1 * num2):
			   ((op == '/')?(num1 / num2):
				((op == '%')?(num1 % num2):(0.000001f)))));
		
		if(!(result == 0.000001f)) {
			System.out.println(result);
		}
		

	}

}
