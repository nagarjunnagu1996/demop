package java_programs_TYSS;

import java.util.LinkedHashSet;

public class find_even_in_array_and_addvalues {

	public static void main(String[] args)
	{	
		String[]arr= {"hi","hello","hello","am","hi"};
		LinkedHashSet<String> map=new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++)
		{
			map.add(arr[i]);	
		}
		for (String st : map)
		{
			int count=0;
			for (int i = 0; i < arr.length; i++)
			{
				if(st==arr[i])
				{
					count++;
				}
				System.out.println(st+" "+i+1);
			}	

		}
	}


}
