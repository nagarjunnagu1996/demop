package java_programs_TYSS;

public class addition_of_2arrays {

	public static void main(String[] args) 
	{
		int a[]= {2,4,1,5,6};
		int b[]= {3,2,4,1,6,9};
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for (int i = 0; i < length; i++) 
		{
			try 
			{
				System.out.println(a[i]+b[i]);	
			} catch (Exception e) {
				if(a.length<b.length)
				{
					System.out.println(b[i]);
				}
				else
				{

					System.out.println(a[i]);
				}
			}

		}
	}

}
