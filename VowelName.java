package jspiders;

import java.util.Scanner;

public class VowelName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next().toUpperCase();
		
		for(int i=0 ; i< name.length() ; i++) {
			if(name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U')
				System.out.println(name.charAt(i));
		}

	}

}
