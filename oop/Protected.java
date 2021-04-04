package oop;

//protected- it is an access specifier to allow access to the data;
//it is mainly used in inheritance;

public class Protected extends Protected_superClass {
	
	void display1() {
		System.out.println("protected sub class");
	}
	
	public static void main(String args[]) {
		Protected p=new Protected();
		
		p.display();
		p.display1();
	
	}

}
