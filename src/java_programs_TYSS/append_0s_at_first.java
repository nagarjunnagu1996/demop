package java_programs_TYSS;

public class append_0s_at_first {

	public static void main(String[] args)
	{
		int arr[]= {0,1,0,0,1};//op-->0 0 0	1 1
		int b[]=new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0)
			{
				b[m]=arr[i];
				m++; 
			}
			else 
			{
				b[n]=arr[i];
				n--;
			}
		}
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}

}
