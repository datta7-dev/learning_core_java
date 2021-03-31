package collections;
import java.util.*;

public class linkedHashset {
	public static void main(String args[]) {
		//linked hashset is same as hashset;
		//it is an extended version of hashset;
		//it stores all type of data,it also stores unique values;
		//key difference is that it maintains insertion order;
		
		LinkedHashSet lhash=new LinkedHashSet();
		lhash.add(10);
		lhash.add("str1");
		lhash.add('d');
		lhash.add(true);
		lhash.add(87451316);
		lhash.add(10.70);
		//lhash.add(null);
		
		System.out.println(lhash);
		
		
	}
}
