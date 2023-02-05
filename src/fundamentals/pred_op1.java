package fundamentals;
public class pred_op1{

	public class Main {
	    public static void change(int input[]){
	    input[0] = 15;
	    }

	    public static void main(String args[]){
	        int arr[] = new int[5];
	        change(arr);
	        System.out.println(arr[0]);
	    }
	}
}