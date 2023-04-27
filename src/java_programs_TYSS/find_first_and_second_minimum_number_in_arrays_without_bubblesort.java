package java_programs_TYSS;

public class find_first_and_second_minimum_number_in_arrays_without_bubblesort {

	public static void main(String[] args) 
	{
		int arr[]= {0,7,2,0,5,4};
		int fmin=arr[0];//7
		int smin=arr[0];//7
		for (int i = 0; i < arr.length; i++)
		{
			// i=0 0<4t  a[i]=7
			if(arr[i]<=fmin)//7<0f 
			{
				if(arr[i]!=fmin)
				{
					smin=fmin;
				}
				fmin=arr[i];
			}
			
			else if (fmin==smin || arr[i]<smin)
			{
				smin=arr[i];
			}
		}
		System.out.println(fmin);
		System.out.println(smin);
	}

}
