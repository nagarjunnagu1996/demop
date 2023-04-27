package YTjava_pgms;

public class max_without_bubble
{
	public static void main(String[] args) 
	{
		int[]arr= {1,3,23,234,54,24,65,55,55,43,234};
		int fmax=arr[0];
		int smax=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			//0<10
			//1<10
			if(arr[i]<=fmax)
			{
				if(fmax!=arr[i])
				{
					smax=fmax;
				}
				fmax=arr[i];//1
			}
			else if(fmax==smax ||arr[i]<smax)
			{
				smax=arr[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);

	}
}
