package jspiders;

public class FactOfDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		int sum =0;
		int dup = num ;
		while(num>0) {
			int rem = num % 10 ;
			int fact = 1 ;
			for(int j=rem;j>0;j--) {
				fact *= j ;
			}
			sum += fact;
			num /= 10;
		}
		System.out.println("Number is :"+dup);
		System.out.println("Sum of factorial of a digit of number :"+sum);
		

	}

}
