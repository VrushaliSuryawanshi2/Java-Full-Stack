// 144  2197  196  3375  256

package jspiders;

public class SeriesGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=12;
		
		for(int j=1;j<=5;j++) {
			if(i%2==0) {
				System.out.print((int)Math.pow(i, 2)+" ");
				i++;
			}
			else {
				System.out.print((int)Math.pow(i, 3)+" ");
				i++;
			}
		}

	}

}
