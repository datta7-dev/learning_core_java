package oop;

//method overriding- same method name with same argument in super-class and sub-class;
// called run time polymorphism;
//sub class method overrides the super class method;

public class Overidding {
	
	void display() {
		System.out.println("hello it's sub class");
		
	}
	public static void main(String args[]) {
		Overidding o=new Overidding();
		Overridding_super_class o1=new Overridding_super_class();
		o1.display();
		o.display();
	}
}
