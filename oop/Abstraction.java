package oop;

abstract class Abstraction {
	int id;
	String name;
	abstract void accept(int id,String name);	
	abstract void display();
}
