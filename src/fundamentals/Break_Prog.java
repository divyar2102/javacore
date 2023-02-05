package fundamentals;

public class Break_Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int n=5;
	      for(int i=1;i<=n;i++){
	          for(int j=1;j<=n;j++){
	              if(i+1==j){
	              //break;
	              return;
	              }
	              System.out.print(j+" ");
	          }
	          
	      }
	      System.out.println();*/
	
		for(int i=1;;i++)
	    {   if(i>5)
	        {
	            break;
	            System.out.print("break statement reached");
	        }
	        System.out.print(i);
	   }
	    }
}
	

