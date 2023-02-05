package PracProg;

public class AddBinaryString {
	
	public static String Addbinary(String x, String y)
	{
		int n1=Integer.parseInt(x,2);
		int n2=Integer.parseInt(y,2);
		int sum=n1+n2;
		String res=Integer.toBinaryString(sum);
		return res;
	}
	public static void main(String[] args) {
		String x="10",y="01";
		System.out.println(Addbinary(x,y));

	}

}
