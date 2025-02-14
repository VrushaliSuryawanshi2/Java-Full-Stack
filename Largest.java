package jspiders;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		System.out.println("Enter num3");
		int num3 = sc.nextInt();
		
		int ans = (num1 > num2)?((num1 >num3)?(num1):(num3)):
			      ((num2>num3)?(num2):(num3));
        System.out.println("Greatest among 3 : "+ans);
	}

}
