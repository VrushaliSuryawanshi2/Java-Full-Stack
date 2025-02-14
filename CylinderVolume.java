package jspiders;

import java.util.Scanner;

public class CylinderVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		float r=sc.nextFloat();
		
		System.out.println("Enter height: ");
		float h=sc.nextFloat();
		
		float area = 2* 3.14f * r *(r + h) ;
		float volume = 3.14f * r * r * h;
		
		System.out.println("Area: "+area);
		System.out.println("Volume: "+volume);
		

	}

}
