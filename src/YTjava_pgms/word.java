package YTjava_pgms;

public class word {

	public static void main(String[] args) 
	{
		String s="this is nagarjun from tumakur";
		String[] spl=s.split(" ");
		String rev="";
		for (int i = spl.length-1; i >=0 ; i--) 
		{
			rev=rev+spl[i]+" ";
		}
		System.out.println(rev);
		System.out.println(rev.length());
		String[] spl1 = rev.split(" ");
		for (int i = 0; i < spl1.length; i++)
		{
			if(i==spl1.length-1)
			{
				String upper=spl1[i];
				char[] ch=upper.toCharArray();
				for (int j = 0; j < ch.length; j++) {
					if(j==0)
					{
					String st=Character.toString(ch[j]);
						System.out.print(st.toUpperCase());
					}
					else
					{
						System.out.print(ch[j]);
					}
				}
			}
			else
			{
				System.out.println(spl1[i]);
			}
		}
	}

}
