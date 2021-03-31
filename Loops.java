public class Loops {
	
	public static void main(String args[])
	{
		//for loop; recommend to use if we know the total no. of iterations;
		for(int i=1;i<=10;i++)//for(initialization;condition;increment/decrement)
		{
			System.out.println("for loop");
		}
		
		//while loop;recommend to use if we don't know the total no. of iterations;
		int i=0;
		while(i>-10)
		{
			//i++;
			System.out.println("while");
			i--;
		}
		
		
		// do-while loop; use when we need to execute some code before checking the condition;
		int j=0;
		do {
			System.out.println("do while");
			j++;
		}
		while(j<10);
		
		
		//break statement;
		//break statement is used to terminate the execution of the loop(ex. for,while,do-while or any other loop);
		for(int k=0;k<10;k++)
		{
			System.out.print(k);
			if(k==5)
			{
				break;
			}
		}
		
		
		//continue statement;
		//it is used to continue the next iteration of the loop instead of executing current iteration code,control goes to loop again;
		
		for(int k=0;k<10;k++)
		{
			if(k==5)
			{
				continue;
			}
			System.out.println(k);
		}
	}
	
	
	
}
