package jspiders;

import java.util.Scanner;

public class LoanCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("***** LOAN CALCULATOR *****");
		System.out.println();
		
		System.out.println("Enter an amount: ");
		int amount = sc.nextInt();
		
		System.out.println("Enter Rate Of Interest : ");
		int ROI = sc.nextInt();
		
		System.out.println("Enter tenure(month) : ");
		int month = sc.nextInt();
		
		String m = ( month / 12 ) +"."+(month % 12);
		float con =Float.parseFloat(m);
		System.out.println(con);
		
		System.out.println("______ Loan Calculator _______");
		System.out.println("Principal Amount : "+amount);
		System.out.println("Rate Of Interest : "+ROI+" %");
		System.out.println("Tenure : "+month+" months");
		
		float IA = (amount * ROI) / 100 ;
		float totalInterest = IA * con ;
		System.out.println("Interest : "+totalInterest);
		float outstanding = amount + totalInterest;
		System.out.println("Total outstanding Amount : "+outstanding);
		System.out.println("EMI : "+(outstanding / month)+" rs");
		
	}

}



/*int month = 20;
int years=month / 12 ;
month = month % 12 ;
String m=years+"."+month;
float mon = Float.parseFloat(m);

System.out.println(mon);
*/