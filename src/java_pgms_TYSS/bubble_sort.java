package java_pgms_TYSS;

public class bubble_sort {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,5,43,64,63,64,24};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					temp=arr[i+1];

				}
			}
			System.out.println(arr[i]);

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
