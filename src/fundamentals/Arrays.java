package fundamentals;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= new int [5];
		arr[0]=5;
		arr[3]=56;
		System.out.println(arr[0]);
		//arr[-1=5; negative indexing is not allowed
		//arr[5]=09; not allowed 
//		indexing is done by 0 to n-1
		
		System.out.println(arr[2]); //we have not assigned the value to 0 and 1 index
		System.out.println(arr[1]);
		
		char []cArray= new char[5];
		double [] dArray=new double[5];
		
		System.out.println(cArray[0]); // null character
		System.out.println(dArray[0]); // 0.0 as oth index ka value
		
		boolean arr1[] = new boolean[5];
		System.out.println(arr1[0]);
		
		
		 
	}

}
