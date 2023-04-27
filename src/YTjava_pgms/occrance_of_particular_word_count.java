package YTjava_pgms;

import java.util.LinkedHashSet;

public class occrance_of_particular_word_count {

	public static void main(String[] args)
	{
		String s="i am nagarjuna am i am";
		String[] s1=s.split(" ");
		LinkedHashSet<String> list=new LinkedHashSet<>();
		for (int i = 0; i < s1.length; i++) {
			list.add(s1[i]);
		}
		System.out.println(list);
		for (String str : list) 
		{
			int count=0;
			for (int i = 0; i < s1.length; i++)
			{
				if(str.equalsIgnoreCase(s1[i]) && s1[i].equalsIgnoreCase("i") ||str.equalsIgnoreCase(s1[i]) && s1[i].equalsIgnoreCase("am"))
				{
					count++;
				}
			}
			if(str.equals("i")||str.equals("am"))
			{
				System.out.println(str+" "+count);
			}
		}

	}

}
