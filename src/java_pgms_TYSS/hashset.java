package java_pgms_TYSS;

import java.util.ArrayList;
import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		HashSet<Object> hash=new HashSet<>();
		hash.add(10);
		hash.add("hi");
		hash.add("hi");
		hash.add(50);
		hash.add(null);
		hash.add(null);
		System.out.println(hash);
	ArrayList<Object> lis=new ArrayList<>();
	lis.add(60);
	lis.add(80);
	lis.add("welcome");
	lis.add(null);
	lis.add(null);
	lis.add(0);
	System.out.println(lis);
	}
	

}
