package jspiders;

import java.util.Scanner;

public class primefact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt(); // 30
		    //  i=2  5<=1  3(5)
		for(int i=2;i<=num;i++) {
			//     5%5 == 0
			while(num%i==0) {
				System.out.print(i+"  "); // 2 3 5
				
				//    5/5 = 1
				num =num/i;
			}
		}

	}

}
