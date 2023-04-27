package java_programs_TYSS;

import java.util.LinkedHashSet;

public class Occurance_of_each_digit {

	public static void main(String[] args) 
	{
		int []a= {2,4,4,6,5,6};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);	
		}

		for (Integer value : set) {

			int count=0;
			for (int i = 0; i < a.length; i++) 
			{
				if(value==a[i])
				{
					count++;

				}
			}
			System.out.println(value+"present at "+count+" times");
		}



	}

}
