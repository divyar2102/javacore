package fundamentals;

public class sum_array {

	
	public static int sumArray(int [] arr)
	{
		int asum=0;
		for(int i=0;i<5;i++)
		{
			asum=asum+arr[i];
			
		}
		return asum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.print(sumArray(arr));
	}

}
