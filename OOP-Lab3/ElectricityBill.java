import java.util.Scanner;
class ElectricityBill{
	public static void main(String[]args)
	{
		int units=0;
		System.out.print("Enter number of units: ");
		Scanner sc=new Scanner(System.in);
		units=sc.nextInt();
		int price=0;
		if(units<=50){
			price=units*10;
		}
		else if(units>50 && units<=100){
			price = (50*10)+((units-50)*15);
		}
		else if(units>100 && units<=200){
			price = (50*10)+(50*15)+((units-100)*20);
		}
		else if(units>200 && units<=300){
			price = (50*10)+(50*15)+(100*20)+((units-200)*25);
		}
		else {
			price = (50*10)+(50*15)+(100*20)+(100*25)+((units-300)*30);
		}
		System.out.println("Total Bill= "+ price +" Rupees");
	}
}