package jspiders;

import java.util.Scanner;

public class GoodPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();  //20
		int cnt=0;
		for(int i=2;i<=num;i++){
			int flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			int temp=i;
			
			if(flag==0) {
				int goodprime=0;
				
				while(temp!=0) {
					int rem=temp%10;
					if(rem != 2 && rem != 3 && rem != 5 && rem != 7) {
						goodprime=1;
						break;
					}
					temp/=10;
				}
				if(goodprime==0) {
					System.out.println(i);
					cnt++;
				}
			}
		}
		System.out.println("Total Good Prime numbers: "+cnt);

	}

}
