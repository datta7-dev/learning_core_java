package oop;

//static keyword is used to reduce the memory use;
//it is created by using static keyword;
//to use same value for multiple objects;
//it is not the part of object instead it is an class property;
//static can be anything like, static variable, static method,...etc;
//static variables are also available outside in main method directly;

public class Static {
	
	static int id=7;
	
	void display(){
		id++;
		System.out.println(id);// static variable holds the previous value;
	}
	public static void main(String args[]) {
		
		//System.out.print(Static.id);//(class name.variable); 
		//System.out.print(id);
		
		Static s1=new Static();
		Static s2=new Static();
		s1.display();
		s2.display();
	}
}
