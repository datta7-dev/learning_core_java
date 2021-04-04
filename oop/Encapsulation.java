package oop;

//encapsulation- It means non of the class data available outside the class;
//we can achieve it by making all the variables/methods by making it private(keyword);

public class Encapsulation{
	private int id=100;// private variable are not accessible outside the class;
	private String name="DaTTa";
	
	public void display() { //public method is accessible outside the class;
		System.out.println("hello, "+name);
	}
	
	public static void main(String args[]) {
		Encapsulation e=new Encapsulation();
		System.out.println(e.id);
		e.display();
	}
}
