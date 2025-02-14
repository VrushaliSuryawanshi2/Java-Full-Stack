package jspiders;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature(Degree celsius)");
		float temp = sc.nextFloat();
		
		for( ; ; ) {
			System.out.println("***** WELCOME *****");
			System.out.println();
			System.out.println("----- TEMPERATURE CONVERTER -----");
			System.out.println();
			
			System.out.println("1.Fahrenheit");
			System.out.println("2.Rankine");
			System.out.println();
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			 switch(ch) {
			 case 1:System.out.println("CONVERSION CELSIUS TO FAHRENHEIT");
				    float fah = (9.0f * temp) / 5 + 32 ;
				    System.out.println(temp+" : "+fah+" F");
				    System.out.println();
				    break;
				    
			 case 2:System.out.println("CONVERSION CELSIUS TO RANKINE");
			        float r = (temp+273.15f)*(9.0f/5) ;
			        System.out.println(temp+" : "+r+" R");
			        System.out.println();
			        break;
			 
			 default : System.out.println("INVALID CHOICE");
			           System.exit(0);
				 
			 }

		}
	}

}
