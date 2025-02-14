package jspiders;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		int n=sc.nextInt();
		int t1=0;
		int t2=1;
		
		System.out.print("Fibonacci series is: "+t1+" "+ t2);
		
		for(int i=3;i<=n;i++) {
			int tn=t1+t2;
			System.out.print(" "+tn);
			t1=t2;
			t2=tn;
		}
		
	}

}
