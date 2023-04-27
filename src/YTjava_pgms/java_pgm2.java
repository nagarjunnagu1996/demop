package YTjava_pgms;

import java.util.LinkedHashSet;

public class java_pgm2 {

	public static void main(String[] args) 
	{
		String s="welcome to tyss welcome to class";
		String[] str = s.split(" ");
		LinkedHashSet<String> list=new LinkedHashSet<>();
		for (int i = 0; i < str.length; i++) 
		{
			list.add(str[i]);	
		}
		//System.out.println(list);
		for (String string : list)
		{
			int count=0;
			for (int i = 0; i < str.length; i++)
			{
				if(string.equals(str[i]))
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(string);
		}



	}

}
