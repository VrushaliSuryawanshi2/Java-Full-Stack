package jspiders;

import java.util.Scanner;

public class EVM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int bjp=0,cng=0,ss=0,aap=0,mns=0,nota=0;
		
		System.out.println();
		System.out.println("                WELCOME");
		System.out.println();
		System.out.println("Enter population: ");
		int pop=sc.nextInt();
		
		for(int i=1;i<=pop;i++) {
			System.out.println();
			System.out.println("****** LIST OF PARTIES ******");
			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3. SHIV SENA");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			
			System.out.println("Enter the option: ");
			int opt=sc.nextInt();
			
			if(opt>=1 && opt<=6) {
				if(opt == 1) {
					bjp++;
					System.out.println("NAYI SOCH , NAYI PEHCHAN");
				}
				if(opt == 2) {
					cng++;
					System.out.println("BHARAT TODO");
				}
				if(opt == 3) {
					ss++;
					System.out.println("HUM HAI ASLI SENA");
				}
				if(opt == 4) {
					aap++;
					System.out.println("MUZE AZAD KARO");
				}
				if(opt == 5) {
					mns++;
					System.out.println("JAY MAHARASHTRA");
				}
				if(opt == 6) {
					nota++;
					System.out.println("YOU ARE AN EDUCATED PERSON");
				}
			}
			
			if((opt<1 || opt>6)) {
				System.out.println("INVALID OPTION");
				i--;
			}
		}
		System.out.println("BJP Votes: "+bjp);
		System.out.println("CONGRESS Votes: "+cng);
		System.out.println("SHIV SENA Votes: "+ss);
		System.out.println("AAP Votes: "+aap);
		System.out.println("MNS Votes: "+mns);
		System.out.println("NOTA Votes: "+nota);
		
		
		if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota) {
			System.out.println("BJP wons the election by "+bjp+" votes");
		}
		if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota) {
			System.out.println("CONGRESS wons the election by "+cng+" votes");
		}
		if(ss >=cng && ss >=bjp && ss >=aap && ss >=mns && ss >=nota) {
			System.out.println("SHIV SENA wons the election by "+ss+" votes");
		}
		if(aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota) {
			System.out.println("AAP wons the election by "+aap+" votes");
		}
		if(mns>=cng && mns>=ss && mns>=aap && mns>=bjp && mns>=nota) {
			System.out.println("MNS wons the election by "+mns+" votes");
		}
		if(nota>=cng && nota>=ss && nota>=aap && nota>=mns && nota>=bjp) {
			System.out.println("NOTA wons the election by "+nota+" votes");
		}
		
	}

}
