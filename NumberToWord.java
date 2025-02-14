package jspiders;

public class NumberToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5757;
		int rev=0;
		while(num!=0) {
			int rem = num%10;
			rev=rev*10+rem;
			num /= 10;
		}
		
		
		while(rev!=0) {
			int rem = rev%10;
			
			switch(rem) {
			case 1 :
				System.out.print("One ");
				break;
			case 2 :
				System.out.print("Two ");
				break;
			case 3 :
				System.out.print("Three ");
				break;
			case 4 :
				System.out.print("Four ");
				break;
			case 5 :
				System.out.print("Five ");
				break;
			case 6 :
				System.out.print("Six ");
				break;
			case 7 :
				System.out.print("Seven ");
				break;
			case 8 :
				System.out.print("Eight ");
				break;
			case 9 :
				System.out.print("Nine ");
				break;
			default:
				System.out.print("Zero ");
					
			}
			
			rev /= 10;
		}

	}

}
