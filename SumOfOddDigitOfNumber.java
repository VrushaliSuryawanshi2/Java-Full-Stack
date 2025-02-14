package jspiders;

public class SumOfOddDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =3251;
		int dup = num;
		int sum = 0;
		
		while(num>0) {
			int rem = num % 10 ;
			if(rem % 2 != 0) {
				int fact =1;
				for(int i=rem ; i>0;i--) {
					fact *= i ;
				}
				sum += fact;
			}
			
			num /= 10 ;
			
		}
		System.out.println("Number is :"+dup);
		System.out.println("Sum of factorial of a Odd digit of number :"+sum);
		

	}

}
