package jspiders;

public class ProductOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 525;
		int product=1;
		
		int rem = num % 10;
		product = product * rem;
		num = num / 10;
		
		rem = num % 10;
		product = product * rem;
		num = num / 10;
		
		rem = num % 10;
		product = product * rem;
		System.out.println("Product of digits: "+product);

	}

}
