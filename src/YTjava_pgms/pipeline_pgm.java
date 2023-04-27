package YTjava_pgms;

public class pipeline_pgm {

	public static void main(String[] args) {
		String s="nagarjun|s|update<||$k";
		String s1=s.replace("||", " ");
		System.out.println(s1);
		String[] spl=s.split(":");
		System.out.println(spl.length);
		
		for (int i = 0; i < spl.length; i++)
		{
			System.out.println(spl[i]);	
		}

	}

}
