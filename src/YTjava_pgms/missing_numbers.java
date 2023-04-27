package YTjava_pgms;

import java.util.ArrayList;

public class missing_numbers 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arlis=new ArrayList<>();
		int a[]= {1,2,4,5};
		for (int i = 1; i <= 3; i++) 
		{
			for (int j = 0; j <=3; j++)
			{
				if(i==a[j])
				{
					break;
				} else
				{
					arlis.add(i);
				}
			}	
		}
		for (int i : arlis)
		{
			System.out.println(i);	
		}



	}

}
