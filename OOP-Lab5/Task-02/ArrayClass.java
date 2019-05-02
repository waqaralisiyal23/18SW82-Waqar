import java.util.Scanner;
class ArrayClass{
	private int []arr=new int[8];
	public void populateArray(){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.print("Array["+i+"]= ");
			arr[i]=sc.nextInt();
		}
	}
	public void printOddEvenNumbers(){
		//odd numbers
		int oddCount=0;
		System.out.print("Odd Numbers in Array: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				System.out.print(arr[i]+" ");
				oddCount++;
			}
		}
		System.out.println();
		System.out.println("No. of Odd numbers in Array: "+oddCount);

		//even numbers
		int evenCount=0;
		System.out.print("Even Numbers in Array: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
				evenCount++;
			}
		}
		System.out.println();
		System.out.println("No. of even numbers in Array: "+oddCount);
	}
}