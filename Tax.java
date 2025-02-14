package jspiders;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter income per annum in lakh: ");
		double sal = sc.nextDouble();
		
		if(sal > 0 && sal <= 12)
			System.out.println("Tax paid without savings is zero");
		else if(sal > 12 && sal <= 16)
			System.out.println("Tax paid without savings is : "+ sal * 0.15+" Lakh");
		else if(sal > 16 && sal <= 20)
			System.out.println("Tax paid without savings is : "+ sal * 0.2+" Lakh");
		else if(sal > 20 && sal <= 24)
			System.out.println("Tax paid without savings is : "+ sal * 0.25+" Lakh");
		else if(sal > 24)
			System.out.println("Tax paid without savings is : "+ sal * 0.3+" Lakh");
		else {
			System.out.println("Invalid Income !!");
		}


	}

}
