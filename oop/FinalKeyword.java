package oop;

//final keyword-it is used to finalize the variables/methods/class to constant value;
//we can not change the final variable value;
// we can not perform method overriding if it is final;

public class FinalKeyword {
	final int id;
	final int n=10;
	
	//we can initialize the final variable value only using constructor;
	FinalKeyword(){
		id=101;
	}
	
	void display() {
		System.out.println(id+" "+n);
	}
	
	public static void main(String args[]) {
		FinalKeyword f=new FinalKeyword();
		f.display();
	}
}
