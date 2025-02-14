package jspiders;

import java.util.Scanner;

public class vowelornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next().charAt(0);
		
		String result = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
				?(ch+" is an vowel"):(ch+" is a consonent");
		
		System.out.println(result);

	}

}
