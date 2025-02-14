package jspiders;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int flag =0; 
		
		for(int i=1 ; i<= num/2 ; i++) {
			if(i * i == num) {
				flag =1;
				System.out.println("The Squareroot Of "+num+" is : "+i);
			}
		}
		if(flag == 0) {
			System.out.println(num+" does not have perfect squareroot");
		}

	}

}
