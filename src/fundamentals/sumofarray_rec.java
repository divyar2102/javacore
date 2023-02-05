package fundamentals;

public class sumofarray_rec {

	public static int sum(int[] input){
        int n=input.length;
        int i,s=0;
        for(i=0;i<n;i++)
            s=s+input[i];
        return s;


	}
	 public static void main(String[] args){
	        
	    	int a[]= {1,2,3,4};
	        System.out.println(sum(a));
	 }
}






