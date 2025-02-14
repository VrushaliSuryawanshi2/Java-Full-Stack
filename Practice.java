package jspiders;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		int cnt1=0 , cnt0=0 ;
		
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='1') {
			cnt1++;
		}
		else if(ch=='0') {
			cnt0++;
		}
		else {
			cnt1=0;
			cnt0=0;
		}
		if(cnt1>=7 || cnt0>=7) {
			break;
		}
	   }
		System.out.println(cnt1>=7 || cnt0>=7 ?"YES" :"NO");
		

	}

}
