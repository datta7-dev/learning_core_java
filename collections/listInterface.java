package collections;
import java.util.*;

public class listInterface {
	public static void main(String args[])
	{
		//list interface in java provides index based add/remove/delete/update operations;
		//it implements arraylist/linkedlist/vector/stack;
		//it grows sequentially;
		List<String> lst=new ArrayList<String>();
		lst.add("str1");
		lst.add("str2");
		lst.add("str3");
		System.out.println(lst);
		lst.set(0,"newstr");//insert at particular index;
		System.out.println(lst);
		System.out.println(lst.size());//length of the list;
		System.out.println(lst.isEmpty());//to check if list is empty or not;returns true if empty;
		System.out.println(lst.indexOf("str2"));// returns index value of the particular element from list;
	}	
	

}
