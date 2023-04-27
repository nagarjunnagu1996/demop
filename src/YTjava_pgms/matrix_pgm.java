package YTjava_pgms;

import java.util.Iterator;

public class matrix_pgm {

	public static void main(String[] args) 
	{
		//int[][] a= new int[][];	
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]);
				
			}
			System.out.println();
		}
		
		
		int s = a[0][0]+a[1][1]+a[2][2];
		System.out.println(s);
		int s1 = a[0][2]+a[1][1]+a[2][0];
		System.out.println(s1);
		int s3=s-s1;
		
		
		System.out.println("the value is    "+s3);




	}

}
