package jspiders;

public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long sec = (365 * 24 * 60 *60) * 5 ; //Sec in 5 years
		long curr_popu = 312032486;
		long birth = sec / 7 ;
		long death = sec / 13 ;
		long imm = sec /45 ;
		
		long new_popu = curr_popu + birth - death + imm ;
		
		System.out.println("Current Population : "+curr_popu);
		System.out.println("New Population : "+new_popu);
		

	}

}
