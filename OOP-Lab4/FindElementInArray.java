import java.util.Scanner;
class FindElementInArray{
	public static void main(String[]args)
	{
		int arr[]={5,3,4,7,8,6};
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		num=sc.nextInt();
		int i;
		for(i=0;i<arr.length;i++){
			if(num==arr[i]){
				System.out.println("Number found.");
				System.out.println("Location: "+i+" index");
				break;
			}
			else if(i==arr.length-1){
				System.out.println("Number not Found.");
			}
		}


	}
}