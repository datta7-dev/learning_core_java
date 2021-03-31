package collections;

import java.util.*;

public class Hashset {
	public static void main(String args[])
	{
		//hashset contains only unique elements;
		//it stores elements by mechanism called hashing;
		//it allows null value;it stores all type of data;
		//it does not maintain insertion order,it stores on the basis of hashcode;
		
		HashSet<Integer> hash=new HashSet<Integer>();
		
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(10);
		//hash.add(null);
		
		System.out.println(hash);
		System.out.println(hash.size());
		hash.remove(10);// remove by object;
		System.out.println(hash);
		
		
		//print using for loop;
		for(int i:hash)
		{
			System.out.print(i+" ");
		}
		
		//add another hashset into one;
		HashSet<Integer> hashstr=new HashSet<Integer>();
		
		hashstr.add(70);
		
		hash.addAll(hashstr);

		System.out.println("\n"+ hash);
	}
}
