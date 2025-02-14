package jspiders;

public class LargestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1865896;
		int max=0;
		
		for(int i=num;i>0;i/=10) {
			int rem = i % 10 ;
			if(rem>max)
				max=rem;
		}
		System.out.println("Largest digit in a number is: "+max);

	}

}
