package jspiders;

import java.util.Scanner;

public class CorrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner( System.in);
		System.out.println();
		System.out.println("*** CURRENCY CONVERTER ***");
		System.out.println();
		System.out.println("Enter the amount(INR)");
		float inr = sc.nextFloat();
		System.out.println();
		
		System.out.println("_____LIST OF CURRENCY_____");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. CAD");
		System.out.println("5. SGD");
		System.out.println("6. RUB");
		System.out.println();
		System.out.println("Enter the Currency: ");
		String Curr = sc.next().toUpperCase();		
		float conCurr = 0;
		
		if(Curr.equals("USD")) {
			conCurr = inr  / 86.56f ;
			System.out.println(inr +" INR = "+conCurr + " USD");
		}
		else if(Curr.equals("EUR")){
			conCurr = inr  / 90.25f ;
			System.out.println(inr +" INR = "+conCurr + " EUR");
		}
		else if(Curr.equals("GBP")){
			conCurr = inr  / 0.0093f ;
			System.out.println(inr +" INR = "+conCurr + " GBP");
		}
		else if(Curr.equals("CAD")){
			conCurr = inr  / 0.01665f ;
			System.out.println(inr +" INR = "+conCurr + " CAD");
		}
		else if(Curr.equals("SGD")){
			conCurr = inr  / 0.01562f ;
			System.out.println(inr +" INR = "+conCurr + " SGD");
		}
		else if(Curr.equals("RUB")){
			conCurr = inr  / 1.1306f ;
			System.out.println(inr +" INR = "+conCurr + " RUB");
		}
		else {
			System.out.println("INVALID");
		}
		
		

	}

}
