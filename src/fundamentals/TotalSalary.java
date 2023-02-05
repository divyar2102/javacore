package fundamentals;
import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*
		int bsal=s.nextInt();


		String st=s.next();
		char ch=st.charAt(0);
		//System.out.print(ch);
		
		int hra,da,al,pf;
		hra=((20/100)*bsal);
		da=((50/100)*bsal);
		pf=((11/100)*bsal);
		
		if(ch=='A')
			al=1700;
		else if(ch=='B')
			al=1500;
		else
			al=1300;
			
		int totsal=(int)(bsal+hra+da+al-pf);
		System.out.println(totsal);
		*/
		int n=s.nextInt();
        int i=1;
        int ans=1;
        while(i<=10)
        {
            ans=n*i;
        	System.out.println(ans);
    		i=i+1;
        }
		
		
		
	}
}