package jspiders;

import java.util.Scanner;

public class EvenOddlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int length=0;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			length++;
			num/=10;
		}
		System.out.println("Length: "+length);
		
		if(length%2==0) {
			while(rev>0) {
				int rem=rev%10;
				if(rem%2!=0) {
					rem+=1;
					System.out.print(rem);
				}
				else {
					System.out.print(rem);
				}
				rev /=10;
			}
		}
		else {
			while(rev>0) {
				int rem=rev%10;
				if(rem%2==0) {
					rem+=1;
					System.out.print(rem);
				}
				else {
					System.out.print(rem);
				}
				rev /=10;
			}
			
		}
	}

}
