package YTjava_pgms;

import java.util.LinkedHashSet;

public class java_pgm {

	public static void main(String[] args) 
	{
		String s="aabbbcaa";
		String s1=s.substring(0, 6);
		String s2=s.substring(6, 8);
	//	System.out.println(s1+" "+s2);
		LinkedHashSet<Character> set =new LinkedHashSet<>();
		for (int i = 0; i < s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for (Character cha : set)
		{
			int count=0;
			for (int i = 0; i < s1.length(); i++)
			{
				if(cha==s1.charAt(i))
				{
					count++;
				}
			}
			System.out.println(cha+"   "+count);
		}
		int count=0;
		for (int i = 0; i < s2.length(); i++)
		{
			char values = s2.charAt(i);
			if(values=='a')
			{
				count++;
			}
		}
		System.out.println("a   "+count);


	}

}

