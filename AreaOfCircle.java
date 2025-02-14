package jspiders;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r = sc.nextInt();
		
		float area = (22.0f / 7.0f) * r * r ;
		
		System.out.println("Area : "+area);

	}

}
