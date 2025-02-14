package jspiders;

import java.util.Scanner;

public class upperornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next().charAt(0);
		
		System.out.println((ch>='A' && ch <='Z')?(ch+" is an uppercase character"):
			               (ch+" is not an uppercase character"));

	}

}
