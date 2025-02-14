package jspiders;

import java.util.Scanner;

public class PasswordProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int storedpin=252;
		int sec=5000;
		
		outerloop:
		for( ; ; ) {
			int attempts=3;
			do {
				System.out.println("Enter your pin: ");
				int pin=sc.nextInt();
				if(storedpin==pin) {
					System.out.println("PHONE UNLOCKED");
					break outerloop;
				}
				else {
					System.out.println("WRONG PIN");
					System.out.println("Attempts left "+(attempts-1));
				}
				attempts--;
			}while(attempts>0);
			
			System.out.println();
			System.out.println("PHONE DISABLED FOR "+sec/1000 +" seconds");
			Thread.sleep(sec);
			sec *=2;
			System.out.println();
		}
				
	}

}
