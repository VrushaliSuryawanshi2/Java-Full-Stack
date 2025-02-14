package jspiders;

public class SmallestDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1865896;
		int min=9;
		
		for(int i=num;i>0;i/=10) {
			int rem = i % 10 ;
			if(rem<min)
				min=rem;
		}
		System.out.println("Smallest digit in a number is: "+min);

	}
}
