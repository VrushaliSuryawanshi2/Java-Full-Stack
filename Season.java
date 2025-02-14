package jspiders;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month : ");
		String month=sc.next().toUpperCase();
		
		String result=(month.equals("Oct") || month.equals("Nov") || month.equals("Dec") || month.equals("Jan"))?("Winter")
				      :((month.equals("Feb") || month.equals("Mar") || month.equals("Apr") || month.equals("May"))?("Summer")
                      :(month.equals("June") || month.equals("Jul") || month.equals("Aug") || month.equals("Sep"))?("Winter"):("Invalid!!"));
		System.out.println(result);
	}

}
