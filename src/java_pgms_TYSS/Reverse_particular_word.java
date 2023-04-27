package java_pgms_TYSS;


public class Reverse_particular_word {

	public static void main(String[] args) 
	{
		String s="i am nagarjun from bangalore";
		String[] spl = s.split(" ");
		for (int i = 0; i < spl.length; i++)
		{
			if(i%2==0)
			{
				String st = spl[i];
				String rev="";
				for (int j =  st.length()-1; j >=0; j--)
				{
				rev=rev+st.charAt(j);	
				}
				System.out.println(rev);
			}
			else
			{
				System.out.println(spl[i]);
			}
		}

	}

}
