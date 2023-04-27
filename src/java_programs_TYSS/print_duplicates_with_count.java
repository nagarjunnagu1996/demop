package java_programs_TYSS;

import java.util.LinkedHashSet;

public class print_duplicates_with_count {

	public static void main(String[] args) 
	{
		int a[]= {2,4,4,6,5,6,6};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
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
			if(count>1)  System.out.println(value+" "+count+" times");
		}

	}

}
