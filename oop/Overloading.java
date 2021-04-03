package oop;

//method overloading- more than one methods have same name with different no./type of arguments;

public class Overloading {
	
	
	void display(int id,String name) {
		System.out.println(id+" "+name);
	}
	void display() {
		System.out.println("hello");
	}
	public static void main(String args[]) {
		Overloading o=new Overloading();
		o.display(7,"datta");
		o.display();
	}
}
