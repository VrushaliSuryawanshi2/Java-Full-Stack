// 2  6  22  278  65814

package jspiders;

public class SeriesGeneration2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int i=2; 
		
		for(int j=1;j<=5;j++) {
			System.out.print(num+"  ");
			int sqr=i*i;
			num = num+sqr;
			i=sqr;
			
		}

	}

}
	