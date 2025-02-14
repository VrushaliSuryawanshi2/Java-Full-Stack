package jspiders;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
		int b=66;
		int c=56;
		
		int ans=(a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		
		System.out.println("Smallest of 3: "+ans);
	}

}
