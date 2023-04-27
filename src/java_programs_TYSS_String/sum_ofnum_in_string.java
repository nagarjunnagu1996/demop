package java_programs_TYSS_String;

public class sum_ofnum_in_string {

	public static void main(String[] args)
	{
	String s="1b2c5d";
			int sum=0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)>='0' && s.charAt(i)<='9')
				{
					int n = s.charAt(i)-48;
					sum=sum+n;
				}
			}
	System.out.println(sum);
	}

}
