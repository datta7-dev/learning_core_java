package oop;
public class Student extends Abstraction{
	void accept(int s_id,String s_name) {
		id=s_id;
		name=s_name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String args[]) {
		Student s= new Student();
		s.accept(7,"Datta");
		s.display();
		
	}

	
}
