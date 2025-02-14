package jspiders;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rev=0;
		while(num!=0) {
			int rem = num%10;
			if(rev>Integer.MAX_VALUE / 10 || rev<Integer.MIN_VALUE / 10)
				System.out.println(0);
			rev=rev*10+rem;
			num /= 10;
		}
		System.out.println(rev);

	}

}
