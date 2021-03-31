package oop;

//class is an collection of properties, methods, data, variables for who we create objects;
//class is an user defined entity;
//it provides structure for processing and accessing data by creating objects of it;
// reuse of code for multiple objects;

public class Class {
	
	int id;
	String name;
	void accept(int i,String s) {
		id=i;
		name=s;
	}
	void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String args[]) {
		Class cl1=new Class();
		cl1.accept(10,"str1");
		cl1.display();
		
		Class cl2=new Class();
		cl2.accept(20,"str2");
		cl2.display();
		
		System.out.println(cl1.id);

		
		
	}

}
