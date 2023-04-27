package YTjava_pgms;

public class add_numbers_between_string {
	static int tsum;

	public static void main(String[] args) 
	{
		String s="abcd13cvb45kj56";
		//int sum=0;
		
		for (int i = 0; i < s.length(); i++)
		{
		 char ch = s.charAt(i);
		 
		 if(ch>=48 && ch<=57)
		 {
		 
			 
			name(ch); 
			if(s.charAt(i+1)>=48 && s.charAt(i+1)<=57) 
			{
			name(s.charAt(i+1));
			}
			
			 
		 }
		 
		}
		//sum=sum+tsum;
		System.out.println(tsum);

	}
	
	
	public static void name(char ch)
	{
		String	 s1=Character.toString(ch);
		  int n = Integer.parseInt(s1);
		  System.out.println(n);
		  tsum=tsum+n;
		  
	}

}
