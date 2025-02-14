package jspiders;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int []a=new int[100];
		int index=1;
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
					a[index++]=i;
				}
			}
		
		for(int i=1;i<index;i++) {
			int count = 0;
			for(int j=2 ; j<a[i] ; j++) {
				if(a[i]%j==0) {
					count++;
					break;
				}
			}
			if(count==0)
				System.out.print(a[i]+"  ");
		}
		

	}

}
