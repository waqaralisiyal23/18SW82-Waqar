import java.util.*;
public class ElectricityBill{
	public static void main(String[]args)
	{
		int units=0;
		System.out.print("Enter number of units consumed: ");
		Scanner sc=new Scanner(System.in);
		units=sc.nextInt();
		int price=0;
		if(units<50){
			price=units*10;
		}
		else if(units>=50 && units<=100){
			price=units*15;
		}
		else if(units>100 && units<=200){
			price=units*20;
		}
		else if(units>200 && units<=300){
			price=units*25;
		}
		else {
			price=units*30;
		}
		System.out.println("Total Electrictity Bill: "+ price + " Rupees");

	}
}