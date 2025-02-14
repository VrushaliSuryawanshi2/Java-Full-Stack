package jspiders;

import java.util.Scanner;

public class logical {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		String result =(num%2 == 0 && num%5 == 0)?("HiTwo_HiFive")
				       :((num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):(" ")));
		
		System.out.println(result);

	}

}
