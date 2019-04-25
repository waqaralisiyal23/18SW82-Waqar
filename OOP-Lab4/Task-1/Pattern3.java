import java.util.Scanner;
class Pattern3{
	public static void main(String[]args)
	{
		int lines=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of lines: ");
		lines=sc.nextInt();
		for(int i=1;i<=lines;i++){
			
			for(int s=1;s<=(lines-i);s++){
				System.out.print(" ");
			}
			for(int j=1;j<=((i*2)-1);j++){
				System.out.print("*");
			} 
			System.out.println();
		}
	}
}