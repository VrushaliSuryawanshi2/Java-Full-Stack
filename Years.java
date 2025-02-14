package jspiders;

import java.util.Scanner;

public class Years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minutes: ");
		Long min = sc.nextLong();
		
		int minperday = 24 * 60 ;
		
		int minperyear = 365 * minperday ;
		
		long year = min / minperyear ;
		
		long remainingmin = min % minperyear; 
		
		long days = remainingmin / minperday;
		
		
		System.out.println(min+" minutes is approximately "+year+" years and "+days+" days");
		
		

	}

}
