import java.util.Scanner;

public class UserInput {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);//scanner class object to create scanner object;
		System.out.print("enter number:");
		int a=input.nextInt();//accepts integer type data;
		System.out.print(a);
		System.out.print("enter name:");
		String str=input.next();
		System.out.print(str);
		System.out.print("enter double value:");
		double d=input.nextDouble();
		System.out.print("d");
		
	}

}
