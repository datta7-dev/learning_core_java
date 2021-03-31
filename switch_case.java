import java.util.Scanner;

public class switch_case {
	
	int a,b;
	
	Scanner sc=new Scanner(System.in);
	
	void accept()
	{
		System.out.print("enter value of a:");
		a=sc.nextInt();
		System.out.print("enter value of b:");
		b=sc.nextInt();
	}
	
	int addition()
	{
		return a+b;
	}
	
	int subtraction()
	{
		return a-b;
	}
	
	int multiplication()
	{
		return a*b;
	}
	
	float division()
	{
		return a/b;
	}
	
	public static void main(String args[])
	{
		switch_case s=new switch_case();
		
		int ch;
		float result;
		
		do
		{
			System.out.println("\n1.accept numbers\n2.addition\n3.subtraction\n4.multplication\n5.division\n6.exit");
			System.out.print("enter your choie:");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
	
			switch(ch)
			{
				case 1:
					s.accept();
					break;
				
				case 2:
					result=s.addition();
					System.out.print("addition is:" + result);
					break;
					
				case 3:
					result=s.subtraction();
					System.out.print("subtraction is:" + result);
					break;
					
				case 4:
					result=s.multiplication();
					System.out.print("multiplication is:" + result);
					break;
					
				case 5:
					result=s.division();
					System.out.print("division is:" + result);
					break;
					
				default:
					System.out.print("enter correct choice!");
					break;
					
			}
		}
		while(ch!=6);
	}

}
