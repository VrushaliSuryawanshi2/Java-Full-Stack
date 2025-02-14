package jspiders;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start : ");
		int start=sc.nextInt();
		System.out.println("Enter a end : ");
		int end=sc.nextInt();
		if(start<=1) {
			return;
		}
		for(int i=start;i<=end;i++){
			int flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.print(i+"  ");
			}
		}
	}

}
