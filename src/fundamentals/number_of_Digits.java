package fundamentals;

public class number_of_Digits {
	public static int number(int n)
    {
     	if (n==0)
            return 1;
        else
        {
            int c=0;
            for(int i=0;i<=n;i++)
            {
            	n/=10;
                ++c;
                
            }
            return c;
        }
    }
	
	public static void main(String[] args)
	{
		System.out.print(number(145));
	}
}

