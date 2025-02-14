// Make the given number prime

package jspiders;

import java.util.Scanner;

public class NumberPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int flag=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=1;
				num++;
				i=2;
			}
			
		}
		System.out.println(num);

	}

}
