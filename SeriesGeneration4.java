package jspiders;

public class SeriesGeneration4 {
	public static void main(String[] args) {
		int num=1;
		int k=2;
		for(int i=0;i<6;i++) {
			int fact=1;
			System.out.print(num+"  ");
			for(int j=k ; j>0;j--) {
				fact *= j;
			}
			num +=fact;
			k++;
		}
	}

}
