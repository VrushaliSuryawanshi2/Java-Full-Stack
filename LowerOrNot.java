package jspiders;

import java.util.Scanner;

public class LowerOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next().charAt(0);
		
		System.out.println((ch>='a' && ch <='z')?(ch+" is lowercase character"):
			               (ch+" is not lowercase character"));

	}

}
