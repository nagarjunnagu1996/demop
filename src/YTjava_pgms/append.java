package YTjava_pgms;

public class append {

	public static void main(String[] args) 
	{
		int a[]= {1,2,0,9,7,0,0,1,0};	
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
			else {
				b[m]=a[i];
				m++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(i);
		}
	}

}
