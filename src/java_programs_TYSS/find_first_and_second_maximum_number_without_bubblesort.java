package java_programs_TYSS;

public class find_first_and_second_maximum_number_without_bubblesort {

	public static void main(String[] args) {
		int arr[]= {0,7,7,7,0,5,4};
		int fmax=arr[0];//7
		int smax=arr[0];//7
		for (int i = 0; i < arr.length; i++)
		{
			// i=0 0<4t  a[i]=7
			if(arr[i]>=fmax)//7<0f 
			{
				if(arr[i]!=fmax)
				{
					smax=fmax;
				}
				fmax=arr[i];
			}
			
			else if (fmax==smax || arr[i]>smax)
			{
				smax=arr[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}

}
