package oop;

//super keyword is used to directly access/invoke the super class properties inside sub class;
public class SuperKeyword extends SuperKeyword_superclass{
	
	int roll_no=20;
	SuperKeyword(){
		super();// call super class constructor only from sub class constructor;
	}
		
	void display1() {
		super.display();
		System.out.println(super.id+" "+super.name);
		System.out.println(roll_no);
	}
	
	public static void main(String args[]){
		SuperKeyword s=new SuperKeyword();
		s.display1();
	}
}
