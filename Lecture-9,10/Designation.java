import java.util.*;
class Designation{
	public static void main(String[]args)
	{
		int salary;
		System.out.print("Enter Salary: ");
		Scanner sc=new Scanner(System.in);
		salary=sc.nextInt();
		if(salary>=10000 && salary<=20000){
			System.out.println("Manager Operations");
		}
		else if(salary>20000 && salary<=30000){
			System.out.println("Manager");
		}
		else if(salary>30000 && salary<=40000){
			System.out.println("Area Manager");
		}
		else if(salary>40000 && salary<=50000){
			System.out.println("Regional Manager");
		}
		else {
			System.out.println("Please enter salary within a range 10000 to 50000");
		}
	}
}