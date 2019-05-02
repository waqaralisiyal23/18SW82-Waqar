import java.util.Scanner;
public class UserInputs{
	public static void main(String[]args)
	{
		int intType;
		float floatType;
		double doubleType;
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter int type value: ");
		intType=sc.nextInt();
		System.out.print("Enter float type value: ");
		floatType=sc.nextFloat();
		System.out.print("Enter double type value: ");
		doubleType=sc.nextDouble();
		System.out.print("Enter char type value: ");
		ch=sc.next().charAt(0);
		System.out.print("Enter String type value: ");
		str=sc.next();
	}
}