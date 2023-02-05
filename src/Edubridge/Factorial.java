package Edubridge;

public class Factorial {

	public static void main(String[] args) {
		
		int n=5;
		int f=1;
		
		/*
		for(int i=1;i<=n;i++)
		{
			
			f=f*i;
		}
		System.out.println(f);

	}*/
	int i=1;
	while(i<=n)
	{
		f=f*i;
		i++;
	}
	System.out.println(f);
	}

}
