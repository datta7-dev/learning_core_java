package oop;

import java.util.*;

public class Methods {
	int roll_no;
	String name;
	
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		
		int roll_no;
		String name;
		
		System.out.print("enter roll no and name of the student:");
		roll_no=input.nextInt();
		name=input.next();
		
		Methods m=new Methods();
		
		m.setRoll_no(roll_no);
		int s_roll_no=m.getRoll_no();
		m.setName(name);
		String s_name=m.getName();
		System.out.println("\nroll no:"+s_roll_no+" name:"+s_name);
		
	}
}
