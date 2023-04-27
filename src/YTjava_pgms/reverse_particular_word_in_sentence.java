package YTjava_pgms;

public class reverse_particular_word_in_sentence {

	public static void main(String[] args) 
	{
		String s="i am nagarjuna from tumakur"	;
		String[] spl = s.split(" ");
		for (int i = 0; i < spl.length; i++)
		{
			String rev="";
			if(i==2)
			{
				String sp = spl[i];
				for (int j = sp.length()-1; j >=0; j--) 
				{
					rev=rev+sp.charAt(j);	
				}
				System.out.println(rev);
			}else
			{
				System.out.println(spl[i]);
			}
		}




	}

}
