package jspiders;
import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int sum =0;
		while(num>0) {
			int rem = num % 10;
			if(rem % 2 == 0)
				sum += rem;
			num /= 10;
		}
		System.out.println("Sum is: "+sum);

	}

}
