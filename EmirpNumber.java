package jspiders;

import java.util.Scanner;

public class EmirpNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int dup=num;
		for(int i=2;i<=num/2;i++) {
			int flag=0;
			if(num%i==0) {
				flag=1;
				System.out.println("Number is not prime");
				break;
			}
			if(flag==0) {
				int rev=0;
				while(num!=0) {
					int rem=num%10;
					rev=rev*10+rem;
					num /= 10;
				}
				System.out.println("Reverse: "+rev);
				for(int j=2;j<=rev/2;j++) {
					if(rev%j==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println(dup+" is an EMIRP Number");
				}
				else {
					System.out.println(dup+" is not an EMIRP Number");
				}
			}
		}
		

	}

}
