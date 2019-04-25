import java.util.Scanner;
class AddMatrices{
	public static void main(String[]args)
	{
		int rows=3;
		int cols=3;
		Scanner sc=new Scanner(System.in);
		int [][]A=new int[rows][cols];
		int [][]B=new int[rows][cols];
		int [][]C=new int[rows][cols];
		//input for matrix 1
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print("A["+i+"]["+j+"]= ");
				A[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		//input for matrix 2
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print("B["+i+"]["+j+"]= ");
				B[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				C[i][j]=A[i][j]+B[i][j];
				System.out.println("C["+i+"]["+j+"]= "+ C[i][j]);
			}
		}
	}
}