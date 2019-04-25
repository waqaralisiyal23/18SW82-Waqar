import java.util.Scanner;
class Pattern2{
	public static void main(String[]args)
	{
		int lines=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of lines: ");
		lines=sc.nextInt();
		for(int i=1;i<=lines;i++){
			for(int j=1;j<=((lines-i)+1);j++){
				System.out.print("*");
			} 
			System.out.println();
		} 
	}
}