import java.lang.*;
import java.util.*;

class KeybReadInt
{

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		int a, b, c;

		System.out.println("Insert two nunmbers");

		a=s.nextInt();
		b=s.nextInt();
		c=a+b;

		System.out.println("The addition of integers a and b equals "+c);
	}
}

	