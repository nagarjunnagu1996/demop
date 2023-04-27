package YTjava_pgms;

public class reverse {

	public static void main(String[] args)
	{
		String s="this is madhu from mysore";
		
		String[] tt = s.split(" ");
		// mysore from madhu is This
//		char[] uu = s.toCharArray();
//for(int i=s.length()-1;i>=0;i--) {
//	if(uu[i]=='t') {
//		System.out.print("T");
//		
//	}
//	else{
//		System.out.print(uu[i]);
//	}
	
//}
		/*for (int i = tt.length-1;i>=0;i--) {
			String ii = tt[i];
		
		
			for (int j=0;i<ii.length();j++) {
				System.out.println(ii.charAt(j));
			}
				
			}*/
			String r="";
		for (int i =  tt.length-1; i >=0; i--)
		{
			r=r+tt[i]+" ";
		}
		System.out.println(r);
		
		
		
		
	}

}
