package java_programs_TYSS_String;

public class Sum_of_numbers_in_string {

	public static void main(String[] args) 
	{
		String s="a12b13v5";//30	
		int tsum = 0;//1 12
		int sum = 0;//12
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n = s.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else {
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
	}

}
