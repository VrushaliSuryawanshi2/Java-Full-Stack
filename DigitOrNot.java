package jspiders;

import java.util.Scanner;

public class DigitOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next().charAt(0);
		
		System.out.println((ch>='0' && ch <='9')?(ch+" is a digit"):
			               (ch+" is not a digit"));

	}

}
