package YTjava_pgms;

public class pattern {

	public static void main(String[] args)
	{
		String s="NAGARJUN";
		int start=s.length();
		for (int i = 0; i <=start-1; i++)
		{
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(s.charAt(j));
				//start++;
			}	
		System.out.println();
		}

	}

}
