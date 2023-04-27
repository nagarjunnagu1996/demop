package YTjava_pgms;

public class swapparticularchar {

	public static void main(String[] args) 
	{
		String s="D@#A&P%Z";
		//int a[]= {1,3,5,7,10}
		char[] s1 = s.toCharArray();
		char temp=s1[0];
		s1[0]=s1[s.length()-1];
		s1[s.length()-1]= temp;
		
		char temp2 = s1[1];
		s1[1]=s1[s.length()-2];
		s1[s.length()-2]= temp2;
		
		for (int i = 0; i < s1.length; i++)
		{
		System.out.println(s1[i]);	
		}
	}

}
