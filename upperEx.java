package jspiders;

import java.util.Scanner;

public class upperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next().charAt(0);
		
		String s=(ch>='A' && ch<='Z' || ch>='a' && ch<='z')?((ch>='a' && ch<='z')
				?(ch+" is a LowerCase alphabet"):(ch+" is a UpperCase alphabet"))
				:((ch>='0' && ch<='9')?(ch+" is a digit")
				:(ch+" is a special character"));
		
		System.out.println(s);

	}

}
