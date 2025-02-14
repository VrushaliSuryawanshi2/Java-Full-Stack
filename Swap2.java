package jspiders;

public class Swap2
{
	public static void main(String[] args) 
	{
		byte a = 10;
		byte b= 30;
		
		System.out.println("Before Swapping : ");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		a=(byte)(a + b);
		b=(byte)(a - b);
		a=(byte)(a - b);
		
		System.out.println("After Swapping : ");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
	}

}
