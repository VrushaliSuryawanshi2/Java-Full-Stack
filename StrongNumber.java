package jspiders;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int dup=num;
		
		int sum=0;
		while(num!=0) {
			int fact=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++) {
				fact= fact * i;
			}
			sum+=fact;
			num/=10;
		}
		if(sum==dup) {
			System.out.println(dup+" is a STRONG NUMBER");
		}else {
			System.out.println(dup+" is not a STRONG NUMBER");
		}

	}

}
