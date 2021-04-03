package oop;

public class Employee extends Abstraction{
	
	void accept(int e_id,String e_name) {
		id=e_id;
		name=e_name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String args[]) {
		Employee e=new Employee();
		e.accept(1,"teacher1");
		e.display();
	}
}
