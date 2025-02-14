package jspiders;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name1 = null;
		String pass1 = null ; 
		long contact = 0;
		String address = null ;
		double balance = 0.0;
		
		for( ; ; ) {
			System.out.println();
			System.out.println("******** WELCOME ********");
			System.out.println();
			System.out.println("-------- TRUST BANK --------");
			System.out.println();
			
			System.out.println("1. Existing User");
			System.out.println("2. New User");
			
			System.out.println();
			System.out.println("Enter choice : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				if(name1==null) {
					System.out.println("CREATE ACCOUNT FIRST");
					continue;
				}
				System.out.println("     LOGIN     ");
				System.out.println();
				for(int i=3;i>=1;i--) {
					System.out.println();
					System.out.println("Enter username: ");
					String name = sc.next();
					System.out.println("Enter password: ");
					String pass = sc.next();
					
					if(name.equals(name1) && pass.equals(pass1)) {
						home:
						for( ; ; ) {
							System.out.println();
							System.out.println("     HOME PAGE     ");
							System.out.println();
							System.out.println(" 1. DEPOSITE");
							System.out.println(" 2. WITHDRAW");
							System.out.println(" 3. CHECK BALANCE");
							System.out.println(" 4. MINI STATEMENT");
							System.out.println(" 5. LOGOUT");
							System.out.println();
							System.out.println("Enter choice: ");
							int ch1 = sc.nextInt();
							System.out.println();
							
							switch(ch1) {
							case 1 : System.out.println("DEPOSITE");
									 System.out.println();
							         System.out.println("Enter amount to deposite: ");
							         double depositeAmt=sc.nextDouble();
							         balance +=depositeAmt;
							         System.out.println("Deposite Amount Successfully");
							         System.out.println();
							         break;
							         
							case 2 : System.out.println("WITHDRAW");
							         System.out.println();
							         System.out.println("Enter amount: ");
							         double withdrawAmt = sc.nextDouble();
							         System.out.println("Enter Pin: ");
							         String pin = sc.next();
							         if(pin.equals(pass1)) {
							        	 if(withdrawAmt <= balance) {
							        		 balance -= withdrawAmt;
							        		 System.out.println("Amount Withdraw Successfully");
							        	 }
							        	 else {
							        		 System.out.println("INSUFFICIENT BALANCE");
							        	 }
							         }
							         else {
							        	 System.out.println("WRONG PIN");
							         }
							         break;
							     
							case 3 : System.out.println("CHECK BALANCE");
							         System.out.println();
							         for(int j=3 ;j>=1 ;j--) {
							        	 System.out.println("Enter Pin: ");
								         String pin1 = sc.next();
								         if(pin1.equals(pass1)) {
								        	 System.out.println("Account Balance : "+balance+" rs");
								        	 continue home;
								        	 }
								         else {
								        	  System.out.println("WRONG PIN");
								        	  System.out.println("Attempt left : "+(j-1));
								        	 }
							         }
							         System.out.println("ACCOUNT HAS BEEN BLOCKED FOR 24 HOURS");
								     System.exit(0);
								     break;
								     
							case 4 : System.out.println("MINI STATEMENT");
							         break;
							         
							case 5 : System.out.println("LOGOUT");
							         System.out.println("THANK YOU FOR VISITING");
							         System.out.println("VISIT AGAIN");
							         System.exit(0);
							         
							         
							}
						}
					}
					else {
						System.out.println("INVALID CREDENTIALS");
						System.out.println("Attempt Left "+(i-1));
					}
				}
				System.out.println("THANK YOU AND NEVER VISIT AGAIN");
				System.exit(0);
			}
			else if(ch == 2) {
				System.out.println();
				System.out.println("     ACCOUNT CREATION     ");
				
				System.out.println("Enter username: ");
				name1 = sc.next();
				System.out.println("Enter password: ");
				pass1 = sc.next();
				System.out.println("Enter contact: ");
				contact = sc.nextLong();
				System.out.println("Enter address: ");
				address = sc.next();
				System.out.println("Deposite Amount: ");
				balance=sc.nextDouble();
				System.out.println("ACCOUNT CREATED SUCCESSFULLY");
				
			}
			else {
				System.out.println("INVALID CHOICE !!");
			}
		}

	}

}
