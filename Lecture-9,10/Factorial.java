import java.util.Scanner;
class Factorial{
	public static void main(String[]args)
	{
		int fact=1;
		int x;
		System.out.print("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		for(int num=x;num>0;num--){
			fact*=num;
		}
		System.out.println("Factorial= "+ fact);
	}
}