package java_programs_TYSS_String;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class practice {

	public static void main(String[] args) 
	{
		int n=5;
		char ch='a';
		for (int i = 0; i <=n; i++)
		{
			for (int j = 0; j <=n; j++)
			{
				if(i>j)
				{
					System.out.print(ch++ +" ");
				}
				else
				{
					System.out.print(" ");
				}

			}	
			System.out.println();
		}




	}

}
