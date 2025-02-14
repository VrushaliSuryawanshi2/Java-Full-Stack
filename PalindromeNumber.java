package jspiders;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int dup = num;
		int rev=0;
		while(num!=0) {
			int digit = num%10;
			rev=rev*10+digit;
			num /= 10;
		}
		
		if(rev==dup) {
			System.out.println(dup+" is palindrome");
		}
		else {
			System.out.println(dup+" is not palindrome");
		}

	}

}
