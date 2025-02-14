package jspiders;

import java.util.Scanner;

public class VowelSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			switch(ch) {
				case 'a' :
				case 'e' :
				case 'i' :
				case 'o' :
				case 'u' :
				case 'A' :
				case 'E' :
				case 'I' :
				case 'O' :
				case 'U' :
					System.out.println(ch+" is an vowel");
					break;
				default:
					System.out.println(ch+" is a consonant");
			}
		}
		else
			System.out.println(ch+" is not an alphabet");

	}

}
