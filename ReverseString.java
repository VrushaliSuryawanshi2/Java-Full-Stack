package jspiders;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next().toUpperCase();
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=str.charAt(i)+rev;
		}
		if(str.equals(rev)) {
			System.out.println(str+" is palindrome");
		}
		else {
			System.out.println(str+" is not palindrome");
		}

	}

}
