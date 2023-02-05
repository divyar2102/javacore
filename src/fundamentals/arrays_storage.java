package fundamentals;

public class arrays_storage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,2,3,4};
		int [][] arr2d= {{1,2,3,61},{6,7,8},{10,11,12}};
		System.out.println(arr.length); // will give the no of rows
		System.out.println(arr2d.length); // will give the no of columns
		System.out.println(arr2d);
		System.out.println(arr2d[0]);
		System.out.println(arr2d[1]);
		System.out.println(arr2d[2]);
		
		
		System.out.println(arr2d[0].length);
		System.out.println(arr2d[1].length);
		System.out.println(arr2d[2].length);
	}

}
