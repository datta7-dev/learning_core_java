import java.util.Scanner;

public class Hello {
	public static void main(String args[])
	{
		System.out.println("hello, welcome....");
		int a,b,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter values of a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		String name="Datta";
		System.out.println("addition is:" + sum);
		System.out.println("my name is:" + name);
		sc.close();
	}

}
