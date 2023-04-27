package YTjava_pgms;

public class check_samw_chars_present_in_each_word {

	public static void main(String[] args) 
	{
		String s="batsaman battery batting";
		String [] spl=s.split(" ");
		String s1=spl[0];
		String s2=spl[1];
		String s3=spl[2];
		for (int i = 0; i < s1.length()-1; i++)
		{
			if(s1.charAt(i)==s2.charAt(i)&&s1.charAt(i)==s3.charAt(i))
			{
				System.out.println(s1.charAt(i));
			}
		}

	}

}
