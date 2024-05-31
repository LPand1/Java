import java.lang.*;

class Literal
{
	public static void main(String args[])
	{
		char c='A';
		String str="Phrase";
		
		byte decimal_ten=10;
		byte binary_ten=0b1010;
		byte octal_ten=012;
		byte hexadecimal_ten=0xA;

		System.out.println("Decimal writting of the number 10 equals to "+decimal_ten);
		System.out.println("Decimal characters 0,1,2,3,4,5,6,7,8,9,10,12,232,3455,646432, and so on");
		System.out.println("Binary writting of the number 10 equals to "+binary_ten); 
		System.out.println("Binary is written using only 0s and 1s");
		System.out.println("Octal writting of the number 10 equals to "+octal_ten); 
		System.out.println("Octal characters 0,1,2,3,4,5,6,7,10,11,12, where 10 means decimal 8, 11, decimal 9 and so on");
		System.out.println("Hexadecimal writting of the number 10 equals to "+hexadecimal_ten); 										System.out.println("Hexadecimal characters 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F");
	}
}