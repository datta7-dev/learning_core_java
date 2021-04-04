package oop;

public class Constructor {
	
	int id;
	String name;
	int num;
	
	//default constructor without parameters;
	Constructor(){
		id=7;
		name="Datta";
	}
	
	//constructor with parameters;
	Constructor(int number){
		num=number;
		
	}
	Constructor(Constructor c3){
		int emp_id=c3.id;
		String emp_name=c3.name;
		System.out.println("copied id "+emp_id);
		System.out.println("copied name "+emp_name);
	}
	
	void display_c1() {
		System.out.println(id+" "+name);
	}
	
	void display_c2() {
		System.out.println(num);
	}
	
	public static void main(String args[]){
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(10);
		
		c1.display_c1();
		c2.display_c2();
	
		
		//to call copy constructor;
		Constructor c3=new Constructor(c1);
		
		}
}
