package jspiders;

import java.util.Scanner;

public class SeriesOfAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
	    String s = sc.next().toUpperCase();
	    char ch0=s.charAt(0);
	    if(s.length()>2) {
	    	System.out.println("INVALID INPUT");
	    	return;
	    }
	    int n = ch0-64;
	    
	    if(s.length()==2) {
	    	char ch1=s.charAt(1);
	    	int n1 = 0;
	        n1 = (n*26)+(ch1-64);
	    	System.out.println(n1);
	    }
	    
	    

	}

}
