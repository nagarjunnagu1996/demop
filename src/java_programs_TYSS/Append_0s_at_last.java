package java_programs_TYSS;

public class Append_0s_at_last {

	public static void main(String[] args)
	{
		int a[]= {4,0,2,0,7};
		int b[]=new int[a.length];
		int m=0;
		int n=b.length-1;
		for (int i = 0; i < b.length; i++)
		{
			if(a[i]==0)
			{
				b[n]=a[i];
				n--;
			}
			else
			{
				b[m]=a[i];
				m++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
