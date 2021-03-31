package collections;

import java.util.*;

public class linkedList {
	public static void main(String args[])
	{
		//linked list provides more flexible methods for storing elements;
		// in linked list we can add data from both(start and end) position.
		LinkedList<Integer> lst= new LinkedList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		System.out.println(lst);
		
		System.out.println(lst.get(2));//get element at particular index;
		System.out.println(lst.contains(20));//checks if element present or not;it returns boolean value(true/false);
		System.out.println(lst.remove(1));// remove element by index;
		System.out.println(lst);
		System.out.println(lst.size());// returns the size of the linked list;
		System.out.println(lst);
		System.out.println(lst.poll());// remove first element from the linked list;
		System.out.println(lst);
		System.out.println(lst.pop());// remove first element from 
		System.out.println(lst);
		lst.addFirst(50);// add new element at first position of the linkedlist;
		System.out.println(lst);
		
		LinkedList lst2=new LinkedList();//linkedlist can stores all type of data;
		lst2.add("str");
		lst2.add('c');
		
		lst.addAll(lst2);
		System.out.println(lst);
		
		lst.removeAll(lst2);// remove all objects;lst.removeAll(lst);
		System.out.println(lst);

		System.out.println(lst.get(0));// returns element from particular index;
		
		lst.clear();
		System.out.println(lst);// clears all the elements from linkedlist;
		
		
		
	}
	
}
