import java.lang.*;
import java.util.*;

class KeybReadStr
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		
		String name;

		System.out.println("Insirt your name");

		name = s.nextLine();

		System.out.println("Welcome Mister/Miss "+name);
	}
}
