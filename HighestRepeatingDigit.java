package jspiders;

import java.util.Scanner;

public class HighestRepeatingDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		int high_cnt=0;
		int digit=0;
		
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			for(int j=num;j>0;j/=10) 
			{
				int rem=j%10;
				if(i==rem) 
				{
					cnt++;
				}
			}
			if(cnt>high_cnt) {
				high_cnt=cnt;
				digit=i;
					
			}
			
		}
		if(high_cnt>1) {
			System.out.println(digit+" is repeated "+high_cnt+" times");
		}else {
			System.out.println("Does not found any repeated digit");
		}
		
		
		
		int min_cnt=high_cnt;
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			for(int j=num;j>0;j/=10) 
			{
				int rem=j%10;
				if(i==rem) 
				{
					cnt++;
				}
			}
			if(cnt<min_cnt && cnt!=0) {
				min_cnt=cnt;
				digit=i;
					
			}
			
		}
		if(min_cnt<high_cnt) {
			System.out.println(digit+" is repeated "+min_cnt+" times");
		}else {
			System.out.println("Does not found any repeated digit");
		}
		

	}

}
