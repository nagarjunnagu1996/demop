package java_programs_TYSS;

import java.util.LinkedHashSet;

public class print_each_digit_Position_without_duplicate {

	public static void main(String[] args) 
	{
		int a[]= {2,4,4,6,5,6,6};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for (Integer value : set) {
			
			for (int i = 0; i < a.length; i++) 
			{
			if(value==a[i])
			{
		System.out.println(value+"is in "+(i+1)+"st position");
				break;
			}
			}
			
		}
	
	}

}
