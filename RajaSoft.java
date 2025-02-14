/* Find the next prime and previous prime of number.
  Print both if they are at equal distance or else print nearest one */

package jspiders;

import java.util.Scanner;

public class RajaSoft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int nprime = 0;
		int pprime=0;
		
		for(int j=num+1 ; ;j++) {
			int flag=0;
			for(int i=2;i<j;i++) {
				if(j%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				nprime=j;
				break;
			}
		}
		
		for(int j=num-1 ; j>=2 ;j--) {
			int flag=0;
			for(int i=2;i<j;i++) {
				if(j%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				pprime=j;
				break;
			}
		}
		
		if(num-pprime < nprime-num) {
			System.out.print(pprime+" "+num);
		}
		else if(nprime-num < num-pprime) {
			System.out.print(num+" "+nprime);
		}
		else {
			System.out.println(pprime+" "+num+" "+nprime);
		}

	}

}
