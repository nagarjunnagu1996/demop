package java_pgms_TYSS;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
	TreeSet<Integer> tree=new TreeSet<>();
	tree.add(10);
	tree.add(5);
	tree.add(6);
	tree.add(50);
	tree.add(49);
	tree.add(49);
	//tree.add(null);// it will through null pointer exception
	//tree.add("hi");// it will through class caste exception
	System.out.println(tree);//in ascending order data will be fetching
	System.out.println(tree.descendingSet());//data will be fetching in descending order
	
	TreeSet<String> tree1=new TreeSet<>();
	tree1.add("hi");
	tree1.add("hello");
	tree1.add("ok");
	tree1.add("ok");
	tree1.add("yes");
	tree1.add("no");
	System.out.println(tree1);

	}

}
