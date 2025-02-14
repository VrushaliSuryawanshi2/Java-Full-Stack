// 79  108  139  176  217  260

package jspiders;

public class SeriesGeneration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=79;
		int m=29;
		
		for(int i=0;i<6;i++) {
			System.out.print(n+"  ");
			int num=n+m;
			n=num;
			for(int j=m+1; ;j++) {
				int flag=0;
				for(int k=2;k<=j/2;k++) {
					if(j%k==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					m=j;
					break;
				}
			}
		}

	}

}
