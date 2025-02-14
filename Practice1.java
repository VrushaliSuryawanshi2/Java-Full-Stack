package jspiders;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "011000111111111010";
		System.out.println(str);
		boolean cnt1=str.contains("1111111");
		boolean cnt0=str.contains("0000000");
		System.out.println(cnt0 || cnt1 ? "YES" :"NO");

	}

}
