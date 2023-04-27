package java_programs_TYSS;

public class find_first_maximum_number_without_bubblesort {

	public static void main(String[] args) 
	{
		int arr[]= {7,2,1,5};
		int fmax=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(fmax<arr[i])
			{
				fmax=arr[i];
			}
		}
System.out.println(fmax);	

	}

}
