// random generation of 6 digit OTP

package jspiders;

public class OTPGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String otp = "";
		
		for(int i=1;i<=6;) {
			otp += (int)(Math.random()*1000000);
			if(otp.length()==6) {
				System.out.println(otp);
				i++;
			}
			otp="";
		}

	}

}
