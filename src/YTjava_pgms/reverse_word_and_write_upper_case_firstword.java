package YTjava_pgms;

import java.util.ArrayList;

public class reverse_word_and_write_upper_case_firstword {

	public static void main(String[] args)
	{
		String s="this is nagarjuna from bangalore";
		String []s1=s.split(" ");
		String rev="";
		for (int i = s1.length-1; i>=0; i--)
		{
			rev=rev+(s1[i])+" ";

		}
			String[] ss=rev.split(" ");
		for (int i = 0; i < ss.length; i++)
		{
			if(i==ss.length-1)
			{
				String sss=ss[i];
				char[] t = sss.toCharArray();
				for(int j=0;j<t.length;j++)
				{
					if(j==0)
					{
						char z=t[j];
						String xx=Character.toString(z);
						System.out.print(xx.toUpperCase());
					}
					else
					{
						System.out.print(t[j]);
					}
				}
			}
			else
			{
				System.out.println(ss[i]);
			}
		}



	}

}
