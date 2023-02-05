package fundamentals;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		int i=1;
		int n=5;
		while(i<=n)
		{
			i++;
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
