package jspiders;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 4287;
		
		int esum=0,osum=0,temp=0;
		int rem=num%10;
		temp=(rem%2 == 0)?(esum = esum+rem):(osum = osum+rem);
		num = num / 10;
		
		rem=num%10;
		temp=(rem%2 == 0)?(esum = esum+rem):(osum = osum+rem);
		num = num / 10;
		
		rem=num%10;
		temp=(rem%2 == 0)?(esum = esum+rem):(osum = osum+rem);
		num = num / 10;
		
		rem=num%10;
		temp=(rem%2 == 0)?(esum = esum+rem):(osum = osum+rem);
		
		System.out.println("Even digit sum is : "+esum);
		System.out.println("Odd digit sum is : "+osum);

	}

}
