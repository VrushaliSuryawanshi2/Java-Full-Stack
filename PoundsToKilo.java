package jspiders;

import java.util.Scanner;

public class PoundsToKilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pounds: ");
		float p=sc.nextFloat();
		
		float kilo = p * 0.454f ;
		
		System.out.println("Kilograms: "+kilo);

	} 

}
