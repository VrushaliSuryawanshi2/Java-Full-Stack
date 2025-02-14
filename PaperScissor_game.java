package jspiders;

import java.util.Scanner;

public class PaperScissor_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rNum = 0 ;                     // Store a random number between 1 to 3
		
		for( ; ; ) {
			
			// Math.random() generate a double value from 0.00 some
			// We multiply the same value by 10
			// and then to get an integer we used type casting
			int num = (int)(Math.random()*10);
			
			if(num >= 1 && num <= 3) {  // Checked if the digit is between 1 to 3
				rNum = num ;   // then only store
				break;     // if digit found between 1 to 3 then terminate the loop
			}
		}
		// Whatever random value is generated we need to map it with the option
		String codeOpt = null ;
		
		if(rNum == 1) {
			codeOpt = "STONE";
		}
		else if(rNum == 2) {
			codeOpt = "PAPER";
		}
		else if(rNum == 3) {
			codeOpt = "SCISSOR";
		}
		else {
			System.out.println("INVALID OPTION");
			return;
		}
		
		
		System.out.println("Enter user option: ");
		int opt = sc.nextInt();
		
		String userOpt = null ;
		
		if(opt == 1) {
			userOpt = "STONE";
		}
		else if(opt == 2) {
			userOpt = "PAPER";
		}
		else if(opt == 3) {
			userOpt = "SCISSOR";
		}
		else {
			System.out.println("INVALID OPTION");
			return;
		}
		
		if((opt == 1 && rNum == 2) || (opt == 2 && rNum == 3) || (opt == 3 && rNum == 1)) {
			System.out.println("Bot wins");
		}
		else if((opt == 1 && rNum == 3) || (opt == 2 && rNum == 1) || (opt == 3 && rNum == 2)) {
			System.out.println("User wins");
		}
		else {
			System.out.println("Draw");
		}
		
		System.out.println("User Input: "+opt);
		System.out.println("Bot Input: "+rNum);

	}

}
