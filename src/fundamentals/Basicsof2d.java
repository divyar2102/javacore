package fundamentals;
import java.util.*;
public class Basicsof2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr2d=new int [3][4];
		System.out.println(arr2d[1][2]);
		
		arr2d[2][1]=12;
		System.out.println(arr2d[2][1]);
		//System.out.println(arr2d[3][1]); errorr
		
		//System.out.println(arr2d[1][4]); arrayindexbound
	
		 int arr[][]=new int[4][5];
		 /*
		    for(int i=0;i<5;i++)
		    {
		        arr[i][0]=2;
		    }
		    System.out.print(arr[3][0]);
		}
		*/
		 for(int i=0;i<4;i++)
		    {
		        for(int j=0;j<5;j++)
		        arr[i][j]=i*j;
		    }
		    System.out.print(arr[3][4]);
		}
	}


