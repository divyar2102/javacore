package fundamentals;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int i=1;
		 while(i<=n)
		 {
			 if(i==4)
			 {
				 break;
			 }
		 	System.out.println(i);
		 	i++;
		 }
		 
		 for(int j=1;j<=n;j++)
		 {
			 if(j==4)
			 {
				 break;
			 }
			 System.out.println(j);
		 }
	System.out.println("break outside");
	}

}
