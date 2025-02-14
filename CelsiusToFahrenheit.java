package jspiders;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter degree in celcius: ");
		double cel=sc.nextDouble();
		
		double farenheit=(9.0 / 5.0) * cel + 32.0 ;
		
		System.out.println("Farenheit: "+farenheit);
		

	}

}
