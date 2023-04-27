package pattern_pgms;

public class pgm1_name_increase {

	public static void main(String[] args) 
	{
		String s="nagarjuna";
		int len=s.length();
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length()-1; i++)
		{
			for (int j = 0; j>=i; j--)
			{
				System.out.print(ch[j]);	
			}	
			System.out.println();
		}
		

	}


}
