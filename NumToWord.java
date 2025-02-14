package jspiders;

import java.util.Scanner;

public class NumToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		String word="";
		
		for(int i= num;i>0;i/=10) {
		    int rem = i%10;
			switch(rem){
				case 0 : word = "Zero "+word;
				         break;
				case 1 : word = "One "+word;
		                  break;
				case 2 : word = "Two "+word;
                		break;
				case 3 : word = "Three "+word;
                		break;
				case 4 : word = "Four "+word;
                		break;
				case 5 : word = "Five "+word;
                		break;
				case 6 : word = "Six "+word;
                		break;
				case 7 : word = "Seven "+word;
                		break;
				case 8 : word = "Eight "+word;
                		break;
				case 9 : word = "Nine "+word;
                		break;
			}
		}
		System.out.println(num);
		System.out.println(word);

	}

}
