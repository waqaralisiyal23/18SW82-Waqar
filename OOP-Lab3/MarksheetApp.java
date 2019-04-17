import java.util.Scanner;
public class MarksheetApp{
	public static void main(String[]args)
	{
		double subject1,subject2,subject3;
		System.out.print("Enter Marks in C++: ");
		Scanner sc=new Scanner(System.in);
		subject1=sc.nextDouble();
		System.out.print("Enter Marks in Data Structures: ");
		subject2=sc.nextDouble();
		System.out.print("Enter Marks in Operating System: ");
		subject3=sc.nextDouble();
		int totalMarks=300;
		double obtMarks=subject1+subject2+subject3;
		double percentage=(obtMarks/totalMarks)*100;
		char grade=0;
		System.out.println("Total Marks: "+ totalMarks);
		System.out.println("Obtained Marks: "+ obtMarks);
		System.out.println("Percentage: "+ percentage);
		if(percentage>90){
			grade='A';
			System.out.println("Grade: "+ grade);
		}
		else if(percentage<=90 && percentage>=80){
			grade='B';
			System.out.println("Grade: "+ grade);
		}
		else if(percentage<80 && percentage>=70){
			grade='C';
			System.out.println("Grade: "+ grade);
		}
		else if(percentage<70 && percentage>=60){
			grade='D';
			System.out.println("Grade: "+ grade);
		}
		else{
			System.out.println("Grade: Fail");	
		}
		
	} 
}